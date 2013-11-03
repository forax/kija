package com.github.kija.parser.ast;

import java.util.List;
import java.util.Objects;

public class BlockExpr extends Node implements Expr {
  private final List<Expr> instructions;

  public BlockExpr(List<Expr> instructions, int lineNumber) {
    super(lineNumber);
    this.instructions = Objects.requireNonNull(instructions);
  }
  
  public List<Expr> getInstructions() {
    return instructions;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitBlock(this, param);
  }
}
