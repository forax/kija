package com.github.kija.compiler.ast;

public interface Expr {
  <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param);
}
