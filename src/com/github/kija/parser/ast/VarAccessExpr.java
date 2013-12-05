package com.github.kija.parser.ast;

import java.util.Objects;

public class VarAccessExpr extends Node implements Expr {
  private final String name;

  public VarAccessExpr(String name, int lineNumber) {
    super(lineNumber);
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
