package com.github.kija.parser.ast;

import java.util.Objects;

public class AttrAccessExpr extends Node implements Expr {
  private final Expr receiver;
  private final String name;
  
  public AttrAccessExpr(Expr receiver, String name, int lineNumber) {
    super(lineNumber);
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
