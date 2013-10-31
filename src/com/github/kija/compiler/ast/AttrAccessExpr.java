package com.github.kija.compiler.ast;

import java.util.Objects;

public class AttrAccessExpr implements Expr {
  private final Expr receiver;
  private final String name;
  
  public AttrAccessExpr(Expr receiver, String name) {
    this.receiver = Objects.requireNonNull(receiver);
    this.name = Objects.requireNonNull(name);
  }
  
  public Expr getReceiver() {
    return receiver;
  }
  public String getName() {
    return name;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitAttrAccess(this, param);
  }
}
