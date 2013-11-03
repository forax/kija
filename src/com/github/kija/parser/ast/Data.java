package com.github.kija.parser.ast;

import java.util.List;
import java.util.Objects;

public class Data extends Node {
  private final String name;
  private final List<String> fields;

  public Data(String name, List<String> fields, int lineNumber) {
    super(lineNumber);
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
