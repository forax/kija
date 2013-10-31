package com.github.kija.compiler.ast;

import java.util.Objects;

public class ArrayAssignmentExpr implements Expr {
  private final Expr receiver;
  private final Expr index;
  private final Expr expr;
  
  public ArrayAssignmentExpr(Expr receiver, Expr index, Expr expr) {
    this.receiver = Objects.requireNonNull(receiver);
    this.index = Objects.requireNonNull(index);
    this.expr = Objects.requireNonNull(expr);
  }
  
  public Expr getReceiver() {
    return receiver;
  }
  public Expr getIndex() {
    return index;
  }
  public Expr getExpr() {
    return expr;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitArrayAssignment(this, param);
  }
}
