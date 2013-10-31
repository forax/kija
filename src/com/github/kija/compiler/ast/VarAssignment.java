package com.github.kija.compiler.ast;

import java.util.Objects;

public class VarAssignment implements Expr {
  private final String name;
  private final Expr expr;
  
  public VarAssignment(String name, Expr expr) {
    this.name = Objects.requireNonNull(name);
    this.expr = Objects.requireNonNull(expr);
  }
  
  public String getName() {
    return name;
  }
  public Expr getExpr() {
    return expr;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitVarAssignment(this, param);
  }
}
