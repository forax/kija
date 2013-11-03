package com.github.kija.parser.ast;

import java.util.Objects;

public class Use extends Node {
  private final String name;

  public Use(String name, int lineNumber) {
    super(lineNumber);
    this.name = Objects.requireNonNull(name);
  }
 
  public String getName() {
    return name;
  }
}
