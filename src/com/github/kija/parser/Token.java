package com.github.kija.parser;

public class Token<V> {
  final V value;
  final int lineNumber;
  
  Token(V value, int lineNumber) {
    this.value = value;
    this.lineNumber = lineNumber;
  }
}
