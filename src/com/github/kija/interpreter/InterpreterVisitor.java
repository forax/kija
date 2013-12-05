//package com.github.kija.interpreter;
//
//import com.github.kija.compiler.Type;
//import com.github.kija.parser.ast.*;
//
//import java.util.List;
//
//public class InterpreterVisitor implements ExprVisitor<Interpreter, Type> {
//  @Override
//  public Type visitArrayAccess(ArrayAccessExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitArrayAssignment(ArrayAssignmentExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitAttrAccess(AttrAccessExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitAttrAssignment(AttrAssignmentExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitBinary(BinaryExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitBlock(BlockExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitFlowStop(FlowStopExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitFunCall(FunCallExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitIf(IfExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitIsInstance(IsInstanceExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitLiteral(LiteralExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitNewCall(NewCallExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitMethodCall(MethodCallExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitPrint(PrintExpr expr, Interpreter env) {
//    List<Expr> parameters = expr.getParameters();
//
//    if (parameters.size() != 1) {
//      throw new RuntimeException("print takes one argument only");
//    }
//
//    if (parameters.get(0) instanceof LiteralExpr) {
//      Expr arg = parameters.get(0);
//      System.out.println(((LiteralExpr) arg).getValue());
//    } else if (parameters.get(0) instanceof VarAccessExpr) {
//      VarAccessExpr arg = (VarAccessExpr) parameters.get(0);
//      System.out.println(env.getVars().get(arg.getName()));
//    } else {
//      throw new RuntimeException("print takes a string or a variable name.");
//    }
//
//    return null;
//  }
//
//  @Override
//  public Type visitUnary(UnaryExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitVarAccess(VarAccessExpr expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitVarAssignment(VarAssignment expr, Interpreter env) {
//    return null;
//  }
//
//  @Override
//  public Type visitWhile(WhileExpr expr, Interpreter env) {
//    return null;
//  }
//}
