package com.github.kija.compiler.ast;

import java.util.Objects;

public class IfExpr implements Expr {
  private final Expr condition;
  private final Expr truePart;
  private final Expr falsePartOptional;
  
  public IfExpr(Expr condition, Expr truePart, Expr falsePartOptional) {
    this.condition = Objects.requireNonNull(condition);
    this.truePart = Objects.requireNonNull(truePart);
    this.falsePartOptional = falsePartOptional;
  }
  
  public Expr getCondition() {
    return condition;
  }
  public Expr getTruePart() {
    return truePart;
  }
  public Expr getFalsePartOptional() {
    return falsePartOptional;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitIf(this, param);
  }
}
