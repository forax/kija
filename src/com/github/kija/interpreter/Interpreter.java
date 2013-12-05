package com.github.kija.interpreter;

import com.github.kija.compiler.Type;
import com.github.kija.parser.Parser;
import com.github.kija.parser.ast.*;
import com.github.kija.parser.ast.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Interpreter implements ExprVisitor<Interpreter, Type> {
  private final Script script;
  private final String[] args;
  private final List<Use> uses;
  private final List<Const> consts;
  private final List<Data> datas;
  private final Map<String, Function> functions;

  private Map<String, Map<String, Object>> vars = new HashMap<>();

  private String currentFunction;
  private Stack<Object> stack = new Stack<>();

  public Interpreter(Path scriptPath, String[] args) throws IOException {
    BufferedReader reader =
        Files.newBufferedReader(scriptPath, StandardCharsets.UTF_8);
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

    if (!functions.containsKey("main")) {
      throw new RuntimeException("No main function found.");
    }
    interpretFunction(functions.get("main"));
  }

  private void interpretUses() {
  }

  private void interpretConsts() {
  }

  private void interpretDatas() {
  }

  private void interpretFunction(Function function) {
    currentFunction = function.getName();

    vars.put(currentFunction, new HashMap<>());

    for (Expr instr : function.getBody().getInstructions()) {
      instr.accept(this, this);
    }
  }

  @Override
  public Type visitArrayAccess(ArrayAccessExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitArrayAssignment(ArrayAssignmentExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitAttrAccess(AttrAccessExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitAttrAssignment(AttrAssignmentExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitBinary(BinaryExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitBlock(BlockExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitFlowStop(FlowStopExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitFunCall(FunCallExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitIf(IfExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitIsInstance(IsInstanceExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitLiteral(LiteralExpr expr, Interpreter interpreter) {
    interpreter.stack.add(expr.getValue());
    return null;
  }

  @Override
  public Type visitNewCall(NewCallExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitMethodCall(MethodCallExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitPrint(PrintExpr expr, Interpreter interpreter) {
    List<Expr> parameters = expr.getParameters();

    if (parameters.size() != 1) {
      throw new RuntimeException("print takes one argument only");
    }

    if (parameters.get(0) instanceof LiteralExpr) {
      Expr arg = parameters.get(0);
      System.out.println(((LiteralExpr) arg).getValue());
    } else if (parameters.get(0) instanceof VarAccessExpr) {
      VarAccessExpr arg = (VarAccessExpr) parameters.get(0);
      System.out.println(vars.get(arg.getName()));
    } else {
      throw new RuntimeException("print takes a string or a variable name.");
    }

    return null;
  }

  @Override
  public Type visitUnary(UnaryExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitVarAccess(VarAccessExpr expr, Interpreter interpreter) {
    return null;
  }

  @Override
  public Type visitVarAssignment(VarAssignment expr, Interpreter interpreter) {
    String name = expr.getName();
    Object value = null;

    if (expr.getExpr() instanceof LiteralExpr) {
      expr.getExpr().accept(this, this);
      value = stack.pop();
    } else if (expr.getExpr() instanceof VarAccessExpr) {
      expr.getExpr().accept(this, this);
      value = stack.pop();
    }

    vars.get(currentFunction).put(name, value);

    return null;
  }

  @Override
  public Type visitWhile(WhileExpr expr, Interpreter interpreter) {
    return null;
  }
}
