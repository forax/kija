package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class Data {
  private final String name;
  private final List<String> fields;

  public Data(String name, List<String> fields) {
    this.name = Objects.requireNonNull(name);
    this.fields = Objects.requireNonNull(fields);
  }
  
  public String getName() {
    return name;
  }
  
  public List<String> getFields() {
    return fields;
  }
}
