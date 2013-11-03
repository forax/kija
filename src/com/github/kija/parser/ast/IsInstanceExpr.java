package com.github.kija.parser.ast;


public class IsInstanceExpr extends Node implements Expr {
  private final Expr expr;
  private final String type;

  public IsInstanceExpr(Expr expr, String type, int lineNumber) {
    super(lineNumber);
    this.expr = expr;
    this.type = type;
  }
  
  public Expr getExpr() {
    return expr;
  }
  public String getType() {
    return type;
  }

  @Override
  public <P, R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitIsInstance(this, param);
  }

}
