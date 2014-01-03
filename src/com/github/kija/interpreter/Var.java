package com.github.kija.interpreter;

public class Var {
  private final String name;
  private Value value;

  public Var(String name, Value value) {
    this.name = name;
    this.value = value;
  }

  public Value getValue() {
    return value;
  }
}
