package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class BlockExpr implements Expr {
  private final List<Expr> exprs;

  public BlockExpr(List<Expr> exprs) {
    this.exprs = Objects.requireNonNull(exprs);
  }
  
  public List<Expr> getExprs() {
    return exprs;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitBlock(this, param);
  }
}
