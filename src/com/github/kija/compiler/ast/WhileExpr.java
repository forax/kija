package com.github.kija.compiler.ast;

import java.util.Objects;

public class WhileExpr implements Expr {
  private final Expr condition;
  private final BlockExpr body;
  private final BlockExpr otherwiseOptional;
  
  public WhileExpr(Expr condition, BlockExpr body, BlockExpr otherwiseOptional) {
    this.condition = Objects.requireNonNull(condition);
    this.body = Objects.requireNonNull(body);
    this.otherwiseOptional = otherwiseOptional;
  }
  
  public Expr getCondition() {
    return condition;
  }
  public BlockExpr getBody() {
    return body;
  }
  public BlockExpr getOtherwiseOptional() {
    return otherwiseOptional;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitWhile(this, param);
  }
}
