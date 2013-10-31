package com.github.kija.compiler.ast;

import java.util.Objects;

public class FlowStopExpr implements Expr {
  private final Expr optionalExpr;
  private final Kind kind;
  
  public enum Kind {
    BREAK, CONTINUE, RETURN;
    
    public String getOperator() {
      return name().toLowerCase();
    }
  }

  public FlowStopExpr(Kind kind, Expr optionalExpr) {
    this.kind = Objects.requireNonNull(kind);
    this.optionalExpr = optionalExpr;
  }
  
  public Kind getKind() {
    return kind;
  }
  public Expr getOptionalExpr() {
    return optionalExpr;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitFlowStop(this, param);
  }
}
