package com.github.kija.compiler.ast;

import java.util.Objects;

public class AttrAssignmentExpr implements Expr {
  private final Expr receiver;
  private final String name;
  private final Expr expr;
  
  public AttrAssignmentExpr(Expr receiver, String name, Expr expr) {
    this.receiver = Objects.requireNonNull(receiver);
    this.name = Objects.requireNonNull(name);
    this.expr = Objects.requireNonNull(expr);
  }
  
  public Expr getReceiver() {
    return receiver;
  }
  public String getName() {
    return name;
  }
  public Expr getExpr() {
    return expr;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitAttrAssignment(this, param);
  }
}
