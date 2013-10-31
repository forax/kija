package com.github.kija.compiler.ast;

import java.util.Objects;

public class BinaryExpr implements Expr {
  private final Expr expr;
  private final Expr expr2;
  private final Kind kind;
  
  public enum Kind {
    ADD("+"), SUB("-"), MUL("*"), DIV("/"), MOD("%"),
    AND("&"), OR("|"), XOR("^"),
    EQ("=="), NE("!="), LT("<"), LE("<="), GT(">"), GE(">="),
    BAND("&&"), BOR("||");
    
    private final String operator;
    
    private Kind(String operator) {
      this.operator = operator;
    }

    public String getOperator() {
      return operator;
    }
  }

  public BinaryExpr(Kind kind, Expr expr, Expr expr2) {
    this.kind = Objects.requireNonNull(kind);
    this.expr = Objects.requireNonNull(expr);
    this.expr2 = Objects.requireNonNull(expr2);
  }
  
  public Kind getKind() {
    return kind;
  }
  public Expr getExpr() {
    return expr;
  }
  public Expr getExpr2() {
    return expr2;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitBinary(this, param);
  }
}
