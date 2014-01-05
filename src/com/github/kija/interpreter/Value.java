package com.github.kija.interpreter;

import com.github.kija.compiler.Type;

public class Value {
  private final Type type;
  private Object value;

  public Value(Type type, Object value) {
    this.type = type;
    this.value = value;
  }

  public Type getType() {
    return type;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
