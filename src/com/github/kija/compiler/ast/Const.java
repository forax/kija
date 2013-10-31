package com.github.kija.compiler.ast;

import java.util.Objects;

public class Const {
  private final String name;
  private final Expr expr;
  
  public Const(String name, Expr expr) {
    this.name = Objects.requireNonNull(name);
    this.expr = Objects.requireNonNull(expr);
  }
  
  public String getName() {
    return name;
  }
  public Expr getInit() {
    return expr;
  }
}
