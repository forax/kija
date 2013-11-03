package com.github.kija.parser.ast;

import java.util.Objects;

public class Const extends Node {
  private final String name;
  private final Expr expr;
  
  public Const(String name, Expr expr, int lineNumber) {
    super(lineNumber);
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
