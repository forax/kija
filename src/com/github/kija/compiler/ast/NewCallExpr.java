package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class NewCallExpr implements Expr {
  private final String name;
  private final List<Expr> parameters;
  
  public NewCallExpr(String name, List<Expr> parameters) {
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
    return visitor.visitNewCall(this, param);
  }
}
