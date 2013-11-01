package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class BlockExpr implements Expr {
  private final List<Expr> instructions;

  public BlockExpr(List<Expr> instructions) {
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
