package com.github.kija.parser.ast;

import java.util.List;
import java.util.Objects;

public class FunCallExpr extends Node implements Expr {
  private final String name;
  private final List<Expr> parameters;
  
  public FunCallExpr(String name, List<Expr> parameters, int lineNumber) {
    super(lineNumber);
    this.name = Objects.requireNonNull(name);
    this.parameters = Objects.requireNonNull(parameters);
  }
  
  public String getName() {
    return name;
  }
  public List<Expr> getParameters() {
    return parameters;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitFunCall(this, param);
  }
}
