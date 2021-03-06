package com.github.kija.parser.ast;

import java.util.Objects;

public class UnaryExpr extends Node implements Expr {
  private final Expr expr;
  private final Kind kind;
  
  public enum Kind {
    MINUS("-"), NOT("!"), COMPLEMENT("~");
    
    private final String operator;

    private Kind(String operator) {
      this.operator = operator;
    }
    
    public String getOperator() {
      return operator;
    }
  }

  public UnaryExpr(Kind kind, Expr expr, int lineNumber) {
    super(lineNumber);
    this.kind = Objects.requireNonNull(kind);
    this.expr = Objects.requireNonNull(expr);
  }
  
  public Kind getKind() {
    return kind;
  }
  public Expr getExpr() {
    return expr;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitUnary(this, param);
  }
}
