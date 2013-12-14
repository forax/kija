package com.github.kija.parser.ast;

public class FunAccessExpr extends Node implements Expr {
  private final String name;

  public FunAccessExpr(String name, int lineNumber) {
    super(lineNumber);
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  @Override
  public <P, R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitFunAccess(this, param);
  }

}
