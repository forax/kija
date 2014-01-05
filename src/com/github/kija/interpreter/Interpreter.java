package com.github.kija.interpreter;

import com.github.kija.compiler.Type;
import com.github.kija.parser.Parser;
import com.github.kija.parser.ast.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Interpreter implements ExprVisitor<Map<String, Var>, Value> {
  private final Script script;
  private final String[] args;
  private final List<Use> uses;
  private final List<Const> consts;
  private final List<Data> datas;
  private final Map<String, Function> functions;

  public Interpreter(Path scriptPath, String[] args) throws IOException {
    //FIXME, close() is not called on the reader !
    // the interpreter should be initialized with a Script, not a scriptPath
    // so this code should be moved in the code that call the Interpreter constructor
    BufferedReader reader =
        Files.newBufferedReader(scriptPath, StandardCharsets.UTF_8); //FIXME, newBufferedReader can take 1 argument
    script    = Parser.parse(reader);

    this.args = args;
    consts    = script.getConsts();
    datas     = script.getDatas();
    uses      = script.getUses();
    functions = script.getFunctions().stream()
        .collect(Collectors.toMap(Function::getName,
            java.util.function.Function.identity()));
  }

  public void interpret() {
    interpretUses();
    interpretConsts();
    interpretDatas();

    Function function = functions.get("main");
    if (function == null) {
      throw new RuntimeException("No main function found.");
    }
    interpretFunction(function);
  }

  private void interpretUses() {
  }

  private void interpretConsts() {
  }

  private void interpretDatas() {
  }

  private void interpretFunction(Function function) {
    HashMap<String, Var> vars = new HashMap<>();
    function.getBody().accept(this, vars);
  }

  @Override
  public Value visitArrayAccess(ArrayAccessExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitArrayAssignment(ArrayAssignmentExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitAttrAccess(AttrAccessExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitAttrAssignment(AttrAssignmentExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitBinary(BinaryExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitBlock(BlockExpr expr, Map<String, Var> vars) {
    // FIXME, does a block create a new HashMap ??
    for (Expr instr : expr.getInstructions()) {
      instr.accept(this, vars);
    }
    //FIXME, the value of a block is the value of the last expression of a block
    return null;
  }

  @Override
  public Value visitFlowStop(FlowStopExpr expr, Map<String, Var> vars) {
    switch (expr.getKind()) {
      case BREAK:
        throw new UnsupportedOperationException();
      case CONTINUE:
        throw new UnsupportedOperationException();
      case RETURN:
        throw new UnsupportedOperationException();
      case FAIL:
        Value value = expr.getOptionalExpr().accept(this, vars);
        throw new RuntimeException(value.toString());
      default:
        throw new UnsupportedOperationException();
    }
  }

  @Override
  public Value visitFunAccess(FunAccessExpr expr, Map<String, Var> vars) {
    return null;
  }
  
  @Override
  public Value visitFunCall(FunCallExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitIf(IfExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitIsInstance(IsInstanceExpr expr, Map<String, Var> vars) {
    return null;
  }

  private static Type getTypeOf(Object value) {
    if (value instanceof Boolean) {
      return Type.BOOL;
    }
    if (value instanceof Integer) {
      return Type.INT;
    }
    if (value instanceof Double) {
      return Type.NUM;
    }
    if (value instanceof String) {
      return Type.STR;
    }
    throw new UnsupportedOperationException("This type is not supported.");
  }
  
  @Override
  public Value visitLiteral(LiteralExpr expr, Map<String, Var> vars) {
    Object nonTypedValue = expr.getValue();
    Type type = getTypeOf(nonTypedValue);  
    return new Value(type, nonTypedValue);
  }

  @Override
  public Value visitNewCall(NewCallExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitMethodCall(MethodCallExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitPrint(PrintExpr expr, Map<String, Var> vars) {
    List<Expr> parameters = expr.getParameters();

    if (parameters.size() != 1) {
      throw new RuntimeException("print takes one argument only");
    }

    Expr parameter = parameters.get(0);
    Value argument = parameter.accept(this, vars);
    System.out.println(argument);
    
    return null;   //FIXME, I don'think it should return null !
  }

  @Override
  public Value visitUnary(UnaryExpr expr, Map<String, Var> vars) {
    return null;
  }

  @Override
  public Value visitVarAccess(VarAccessExpr expr, Map<String, Var> vars) {
    Var var = vars.get(expr.getName());
    if (var == null) {
      throw new RuntimeException("Variable `" + expr.getName() + "` does not exist.");
    }
    return var.getValue();
  }

  @Override
  public Value visitVarAssignment(VarAssignment expr, Map<String, Var> vars) {
    Value value = expr.getExpr().accept(this, vars);
    Var var = new Var(expr.getName(), value);  //FIXME, why did you create a var is a var already exist ??

    if (vars.get(expr.getName()) != null) {   //FIXME, I don't understand this check ??
      throw new RuntimeException("You cannot assign value `" + value +
          "` to variable of type " + value.getType() + ".");
    }
    
    vars.put(expr.getName(), var);
    return value;
  }

  @Override
  public Value visitWhile(WhileExpr expr, Map<String, Var> vars) {
    return null;
  }
}
