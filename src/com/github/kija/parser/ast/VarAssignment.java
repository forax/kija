package com.github.kija.parser.ast;

import java.util.Map;
import java.util.Objects;

public class VarAssignment extends Node implements Expr {
  private final String name;
  private final Expr expr;
  
  public VarAssignment(String name, Expr expr, int lineNumber) {
    super(lineNumber);
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
