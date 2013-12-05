package com.github.kija.parser.ast;

public class LiteralExpr extends Node implements Expr {
  private final Object valueOrNull;

  public LiteralExpr(Object valueOrNull, int lineNumber) {
    super(lineNumber);
    this.valueOrNull = valueOrNull;
  }
  
  public Object getValue() {
    return valueOrNull;
  }

  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitLiteral(this, param);
  }
}
