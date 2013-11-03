package com.github.kija.parser.ast;

import java.util.Objects;

public class FlowStopExpr extends Node implements Expr {
  private final Expr optionalExpr;
  private final Kind kind;
  
  public enum Kind {
    BREAK, CONTINUE, RETURN, FAIL;
    
    public String getOperator() {
      return name().toLowerCase();
    }
  }

  public FlowStopExpr(Kind kind, Expr optionalExpr, int lineNumber) {
    super(lineNumber);
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
