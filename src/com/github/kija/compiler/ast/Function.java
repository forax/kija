package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class Function {
  private final String name;
  private final List<String> parameters;
  private final BlockExpr body;
  
  public Function(String name, List<String> parameters, BlockExpr body) {
    this.name = Objects.requireNonNull(name);
    this.parameters = Objects.requireNonNull(parameters);
    this.body = Objects.requireNonNull(body);
  }
  
  public String getName() {
    return name;
  }
  public List<String> getParameters() {
    return parameters;
  }
  public BlockExpr getBody() {
    return body;
  }
}
