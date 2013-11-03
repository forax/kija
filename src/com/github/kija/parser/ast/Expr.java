package com.github.kija.parser.ast;

public interface Expr {
  int getLineNumber();
  <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param);
}
