package com.github.kija.compiler.ast;

import java.util.Objects;


public class VarAccessExpr implements Expr {
  private final String name;

  public VarAccessExpr(String name) {
    this.name = Objects.requireNonNull(name);
  }
  
  public String getName() {
    return name;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitVarAccess(this, param);
  }
}
