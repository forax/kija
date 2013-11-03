package com.github.kija.parser.ast;

abstract class Node {
  private final int lineNumber;
  
  protected Node(int lineNumber) {
    this.lineNumber = lineNumber;
  }
  
  public int getLineNumber() {
    return lineNumber;
  }
}
