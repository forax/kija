package com.github.kija.compiler.ast;

import java.util.Objects;

public class Use {
  private final String name;

  public Use(String name) {
    this.name = Objects.requireNonNull(name);
  }
 
  public String getName() {
    return name;
  }
}
