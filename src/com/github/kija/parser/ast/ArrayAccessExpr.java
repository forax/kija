package com.github.kija.parser.ast;

import java.util.Objects;


public class ArrayAccessExpr extends Node implements Expr {
  private final Expr receiver;
  private final Expr index;
  
  public ArrayAccessExpr(Expr receiver, Expr index, int lineNumber) {
    super(lineNumber);
    this.receiver = Objects.requireNonNull(receiver);
    this.index = Objects.requireNonNull(index);
  }
  
  public Expr getReceiver() {
    return receiver;
  }
  public Expr getIndex() {
    return index;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitArrayAccess(this, param);
  }
}
