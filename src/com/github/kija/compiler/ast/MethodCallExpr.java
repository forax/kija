package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class MethodCallExpr implements Expr {
  private final Expr receiver;
  private final String name;
  private final List<Expr> parameters;
  
  public MethodCallExpr(Expr receiver, String name, List<Expr> parameters) {
    this.receiver = Objects.requireNonNull(receiver);
    this.name = Objects.requireNonNull(name);
    this.parameters = Objects.requireNonNull(parameters);
  }
  
  public Expr getReceiver() {
    return receiver;
  }
  public String getName() {
    return name;
  }
  public List<Expr> getParameters() {
    return parameters;
  }
  
  @Override
  public <P,R> R accept(ExprVisitor<? super P, ? extends R> visitor, P param) {
    return visitor.visitMethodCall(this, param);
  }
}
