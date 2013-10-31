package com.github.kija.compiler.ast;

public class LiteralExpr implements Expr {
  private final Object valueOrNull;

  public LiteralExpr(Object valueOrNull) {
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
