package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class PrintExpr implements Expr {
  private final List<Expr> exprs;

  public PrintExpr(List<Expr> exprs) {
    this.exprs = Objects.requireNonNull(exprs);
  }
  
  public List<Expr> getParameters() {
    return exprs;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitPrint(this, param);
  }
}
