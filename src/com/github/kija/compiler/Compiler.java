package com.github.kija.compiler;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.util.CheckClassAdapter;

import com.github.kija.parser.ast.ArrayAccessExpr;
import com.github.kija.parser.ast.ArrayAssignmentExpr;
import com.github.kija.parser.ast.AttrAccessExpr;
import com.github.kija.parser.ast.AttrAssignmentExpr;
import com.github.kija.parser.ast.BinaryExpr;
import com.github.kija.parser.ast.BlockExpr;
import com.github.kija.parser.ast.Expr;
import com.github.kija.parser.ast.ExprVisitor;
import com.github.kija.parser.ast.FlowStopExpr;
import com.github.kija.parser.ast.FunAccessExpr;
import com.github.kija.parser.ast.FunCallExpr;
import com.github.kija.parser.ast.Function;
import com.github.kija.parser.ast.IfExpr;
import com.github.kija.parser.ast.IsInstanceExpr;
import com.github.kija.parser.ast.LiteralExpr;
import com.github.kija.parser.ast.MethodCallExpr;
import com.github.kija.parser.ast.NewCallExpr;
import com.github.kija.parser.ast.PrintExpr;
import com.github.kija.parser.ast.UnaryExpr;
import com.github.kija.parser.ast.VarAccessExpr;
import com.github.kija.parser.ast.VarAssignment;
import com.github.kija.parser.ast.WhileExpr;
import com.github.kija.runtime.RT;

import static com.github.kija.compiler.Type.*;
import static org.objectweb.asm.Opcodes.*;
import static java.lang.invoke.MethodType.*;

public class Compiler implements ExprVisitor<Compiler.Env, Type> {
  public static class CompilerResult {
    private final Class<?> generatedClass;
    private final MethodHandle invoker;

    CompilerResult(Class<?> generatedClass, MethodHandle invoker) {
      this.generatedClass = generatedClass;
      this.invoker = invoker;
    }
    
    public Class<?> getGeneratedClass() {
      return generatedClass;
    }
    public MethodHandle getInvoker() {
      return invoker;
    }
  }
  
  static class Var {
    final Type type;
    final int slot;

    Var(Type type, int slot) {
      this.type = type;
      this.slot = slot;
    }
    
    void load(MethodVisitor mv) {
      mv.visitVarInsn(type.loadOp, slot);
    }
    
    void store(MethodVisitor mv) {
      mv.visitVarInsn(type.storeOp, slot);
    }
  }
  
  static class Scope {
    private final Scope parent;
    private int slotCount;
    private final HashMap<String, Var> varMap = new HashMap<>();
    
    Scope(Scope parent, int slotCount) {
      this.slotCount = slotCount;
      this.parent = parent;
    }

    int getSlotCount() {
      return slotCount;
    }
    
    Var getVar(String name) {
      Var var = varMap.get(name); 
      if (var != null) {
        return var;
      }
      if (parent == null) {
        return null;
      }
      return parent.getVar(name);
    }
    
    Var newVar(String name, Type type) {
      int slot = slotCount;
      slotCount += type.slotSize();
      Var var = new Var(type, slot);
      varMap.put(name, var);
      return var;
    }
  }
  
  static class GlobalEnv {
    Type inferedReturnType;

    void addReturnType(Type returnType) {
      if (inferedReturnType == null || inferedReturnType == VOID) {
        inferedReturnType = returnType;
        return;
      }
      if (inferedReturnType == returnType) {
        return;
      }
      if (returnType == VOID) {
        return;
      }
      inferedReturnType = ANY;
    }
  }
  
  static class Env {
    final Type expectedType;
    final Scope scope;
    final GlobalEnv globalEnv;
    final MethodVisitor mv;
        
    Env(Type expectedType, Scope scope, GlobalEnv globalEnv, MethodVisitor mv) {
      this.expectedType = expectedType;
      this.scope = scope;
      this.globalEnv = globalEnv;
      this.mv = mv;
    }

    Env expectedType(Type expectedType) {
      if (expectedType == this.expectedType) {
        return this;
      }
      return new Env(expectedType, scope, globalEnv, mv);
    }

    Env newScope() {
      return new Env(expectedType, new Scope(scope, scope.getSlotCount()), globalEnv, mv);
    }
  }
  
  private static final String RT_CLASS_NAME = RT.class.getName().replace('.', '/');
  private static final Handle BSM_CONVERT = getHandle("convert", CallSite.class, Lookup.class, String.class, MethodType.class);
  private static final Handle BSM_FAIL = getHandle("fail", CallSite.class, Lookup.class, String.class, MethodType.class, String.class);
  private static final Handle BSM_PRINT = getHandle("print", CallSite.class, Lookup.class, String.class, MethodType.class);
  
  
  // --- helper methods
  
  private static Handle getHandle(String name, Class<?> returnType, Class<?>... parameterTypes) {
    return new Handle(H_INVOKESTATIC, RT_CLASS_NAME, name,
        MethodType.methodType(returnType, parameterTypes).toMethodDescriptorString());
  }
  
  private static String desc(MethodType methodType) {
    // TODO, check speed !
    return methodType.toMethodDescriptorString();
  }
  
  private static void convertType(MethodVisitor mv, Type leftType, Type rightType) {
    if (leftType == rightType) {
      return;
    }
    Class<?> leftClass = leftType.type;
    Class<?> rightClass = rightType.type;
    if (leftClass == rightClass) {
      return;
    }
    // try to convert, this may fail at runtime
    mv.visitInvokeDynamicInsn("convert", desc(methodType(leftClass,  rightClass)), BSM_CONVERT);
  }
  
  
  // --- entry point
  
  public CompilerResult compile(String unitName, Function function, Type returnType, Type[] parameterTypes) {
    Scope scope = new Scope(null, 0);
    List<String> parameters = function.getParameters();
    Class<?>[] parameterClasses = new Class<?>[parameters.size()];
    for(int i = 0; i < parameterTypes.length; i++) {
      String parameterName = parameters.get(i);
      char lastChar = parameterName.charAt(parameterName.length() - 1);
      Type type = (lastChar == '\'')? Type.ANY: parameterTypes[i];
      scope.newVar(parameterName, type);
      parameterClasses[i] = type.type;
    }
    
    MethodNode node = new MethodNode(ASM5);
    GlobalEnv globalEnv = new GlobalEnv();
    if (returnType != ANY && returnType != VOID) {
      globalEnv.addReturnType(returnType);
    }
    Type blockType = function.getBody().accept(this, new Env(returnType, scope, globalEnv, node));
    globalEnv.addReturnType(blockType);
    Type inferedReturnType = globalEnv.inferedReturnType;
    
    if (blockType != DEAD) {
      convertType(node, inferedReturnType, blockType);
      node.visitInsn(inferedReturnType.returnOp);
    }
    
    ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS);
    String name = function.getName();
    writer.visit(V1_8, ACC_PUBLIC|ACC_SUPER, name, null, "java/lang/Object", null);
    writer.visitSource(unitName, null);
    MethodType methodType = methodType(inferedReturnType.type,  parameterClasses);
    MethodVisitor mv = writer.visitMethod(ACC_PUBLIC|ACC_STATIC, name, desc(methodType), null, null);
    node.accept(mv);
    writer.visitEnd();
    byte[] byteArray = writer.toByteArray();
    
    // check generated class
    CheckClassAdapter.verify(new ClassReader(byteArray), true, new PrintWriter(System.out));
    
    //TODO use anonymous class loader 
    Class<?> generatedClass = new ClassLoader() {
      Class<?> createClass(String name, byte[] byteArray) {
        return defineClass(name, byteArray, 0, byteArray.length);
      }
    }.createClass(name, byteArray);
    
    MethodHandle mh;
    try {
      mh = MethodHandles.publicLookup().findStatic(generatedClass, name, methodType);
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
    
    return new CompilerResult(generatedClass, mh);
  } 
  
  // --- visitors
  
  @Override
  public Type visitLiteral(LiteralExpr expr, Env env) {
    Object value = expr.getValue();
    if (value == null) {
      env.mv.visitInsn(ACONST_NULL);
      return OBJ;
    }
    if (value instanceof Boolean) {
      env.mv.visitInsn(((Boolean)value)? ICONST_1: ICONST_0);
      return BOOL;
    }
    if (value instanceof Integer) {
      env.mv.visitLdcInsn(value);
      return INT;
    }
    if (value instanceof Double) {
      env.mv.visitLdcInsn(value);
      return NUM;
    }
    if (value instanceof String) {
      env.mv.visitLdcInsn(value);
      return STR;
    }
    throw new AssertionError();
  }
  
  @Override
  public Type visitVarAccess(VarAccessExpr expr, Env env) {
    String name = expr.getName();
    Var var = env.scope.getVar(name);
    if (var == null) {
      // no local var, try to find a function
      //TODO
      // fail
      env.mv.visitInvokeDynamicInsn("fail", desc(methodType(env.expectedType.type)), BSM_FAIL,
          "local variable " + name + " doesn't exist");
      return env.expectedType;
    }
    
    var.load(env.mv);
    return var.type;
  }
  
  @Override
  public Type visitVarAssignment(VarAssignment expr, Env env) {
    Type resultType = env.expectedType;
    String name = expr.getName();
    Var var = env.scope.getVar(name);
    Type expectedType = (var == null)? resultType.expectedTypeAsStackType(): var.type;
    Type exprType = expr.getExpr().accept(this, env.expectedType(expectedType));
    if (var == null) {
      var = env.scope.newVar(name, exprType);
    }
    if (resultType != VOID) {
      env.mv.visitInsn((exprType.slotSize() == 2)? DUP2: DUP);
    }
    convertType(env.mv, var.type, exprType);
    var.store(env.mv);
    return (resultType == VOID)? VOID: exprType;
  }
  
  @Override
  public Type visitBlock(BlockExpr expr, Env env) {
    MethodVisitor mv = env.mv;
    List<Expr> instructions = expr.getInstructions();
    if (instructions.isEmpty()) {
      mv.visitInsn(ACONST_NULL);
      return OBJ;
    }
    Type exprType = null; // just to please the compiler
    Env newEnv = env.newScope();
    for(int i = 0; i < instructions.size(); i++) {
      Expr instruction = instructions.get(i);
      Label label = new Label();
      mv.visitLabel(label);
      mv.visitLineNumber(instruction.getLineNumber(), label);
      exprType = instruction.accept(this, newEnv.expectedType(VOID));
      if (exprType == DEAD) {
        // skip next instruction, and report dead
        System.out.println("warning, dead instruction at ");
        return DEAD;
      }
      if (exprType != VOID && i != instructions.size() - 1) {
        mv.visitInsn((exprType.slotSize() == 2)? POP2: POP);
      }
    }
    return exprType;
  }
  
  @Override
  public Type visitPrint(PrintExpr expr, Env env) {
    ArrayList<Class<?>> parameterClasses = new ArrayList<>();
    for(Expr parameter: expr.getParameters()) {
      Type parameterType = parameter.accept(this, env.expectedType(ANY));
      parameterClasses.add(parameterType.type);
    }
    env.mv.visitInvokeDynamicInsn("print", desc(methodType(void.class, parameterClasses)), BSM_PRINT);
    if (env.expectedType != VOID) {
      env.mv.visitInsn(ACONST_NULL);
      return OBJ;
    }
    return VOID;
  }

  @Override
  public Type visitArrayAccess(ArrayAccessExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitArrayAssignment(ArrayAssignmentExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitAttrAccess(AttrAccessExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitAttrAssignment(AttrAssignmentExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitBinary(BinaryExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitFlowStop(FlowStopExpr expr, Env env) {
    MethodVisitor mv = env.mv;
    Expr optionalExpr = expr.getOptionalExpr();
    switch(expr.getKind()) {
    case RETURN: {
      Type exprType = (optionalExpr != null)? optionalExpr.accept(this, env): VOID;
      mv.visitInsn(exprType.returnOp);
      break;
    }
    case FAIL: {
      mv.visitTypeInsn(NEW, "java/lang/RuntimeException");
      mv.visitInsn(DUP);
      Type exprType = optionalExpr.accept(this, env);
      convertType(mv, ANY, exprType);
      mv.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
      mv.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
      mv.visitInsn(ATHROW);
      break;
    }
    default:
      throw new UnsupportedOperationException();
    }
    return DEAD;
  }

  @Override
  public Type visitFunAccess(FunAccessExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  public Type visitFunCall(FunCallExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitIf(IfExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitIsInstance(IsInstanceExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitNewCall(NewCallExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitMethodCall(MethodCallExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitUnary(UnaryExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Type visitWhile(WhileExpr expr, Env env) {
    // TODO Auto-generated method stub
    return null;
  }
}
