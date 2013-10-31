package com.github.kija.compiler.ast;


public interface ExprVisitor<E, R> {
  public R visitArrayAccess(ArrayAccessExpr expr, E env);
  public R visitArrayAssignment(ArrayAssignmentExpr expr, E env);
  public R visitAttrAccess(AttrAccessExpr expr, E env);
  public R visitAttrAssignment(AttrAssignmentExpr expr, E env);
  public R visitBinary(BinaryExpr expr, E env);
  public R visitBlock(BlockExpr expr, E env);
  public R visitFlowStop(FlowStopExpr expr, E env);
  public R visitFunCall(FunCallExpr expr, E env);
  public R visitIf(IfExpr expr, E env);
  public R visitIsInstance(IsInstanceExpr expr, E env);
  public R visitLiteral(LiteralExpr expr, E env);
  public R visitNewCall(NewCallExpr expr, E env);
  public R visitMethodCall(MethodCallExpr expr, E env);
  public R visitPrint(PrintExpr expr, E env);
  public R visitUnary(UnaryExpr expr, E env);
  public R visitVarAccess(VarAccessExpr expr, E env);
  public R visitVarAssignment(VarAssignment expr, E env);
  public R visitWhile(WhileExpr expr, E env);
}
