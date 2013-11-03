package com.github.kija.printer;

import java.util.List;

import com.github.kija.compiler.ast.ArrayAccessExpr;
import com.github.kija.compiler.ast.ArrayAssignmentExpr;
import com.github.kija.compiler.ast.AttrAccessExpr;
import com.github.kija.compiler.ast.AttrAssignmentExpr;
import com.github.kija.compiler.ast.BinaryExpr;
import com.github.kija.compiler.ast.BlockExpr;
import com.github.kija.compiler.ast.Const;
import com.github.kija.compiler.ast.Data;
import com.github.kija.compiler.ast.Expr;
import com.github.kija.compiler.ast.ExprVisitor;
import com.github.kija.compiler.ast.FlowStopExpr;
import com.github.kija.compiler.ast.FunCallExpr;
import com.github.kija.compiler.ast.Function;
import com.github.kija.compiler.ast.IfExpr;
import com.github.kija.compiler.ast.IsInstanceExpr;
import com.github.kija.compiler.ast.LiteralExpr;
import com.github.kija.compiler.ast.MethodCallExpr;
import com.github.kija.compiler.ast.NewCallExpr;
import com.github.kija.compiler.ast.PrintExpr;
import com.github.kija.compiler.ast.Script;
import com.github.kija.compiler.ast.UnaryExpr;
import com.github.kija.compiler.ast.Use;
import com.github.kija.compiler.ast.VarAccessExpr;
import com.github.kija.compiler.ast.VarAssignment;
import com.github.kija.compiler.ast.WhileExpr;

public class PrettyPrinter implements ExprVisitor<StringBuilder, StringBuilder> {
  public String prettyPrint(Script script) {
    StringBuilder builder = new StringBuilder();
    List<Use> uses = script.getUses();
    if (!uses.isEmpty()) {
      printUses(builder, uses);
    }
    List<Const> consts = script.getConsts();
    if (!consts.isEmpty()) {
      printConsts(builder, consts);
    }
    List<Data> datas = script.getDatas();
    if (!datas.isEmpty()) {
      printDatas(builder, datas);
    }
    List<Function> functions = script.getFunctions();
    if (!functions.isEmpty()) {
      printFunctions(builder, functions);
    }
    return builder.toString();
  }
  
  private static void printUses(StringBuilder builder, List<Use> uses) {
    for(Use use: uses) {
      builder.append("use ").append(use.getName()).append('\n');
    }
    builder.append('\n');
  }
  
  private void printConsts(StringBuilder builder, List<Const> consts) {
    for(Const conzt: consts) {
      builder.append("const ").append(conzt.getName()).append(" = ");
      conzt.getInit().accept(this, builder);
    }
    builder.append('\n');
  }
  
  private static void printDatas(StringBuilder builder, List<Data> datas) {
    for(Data data: datas) {
      builder.append("data ").append(data.getName()).append('(');
      String separator = "";
      for(String field: data.getFields()) {
        builder.append(separator).append(field);
        separator = ", ";
      }
      builder.append(")\n");
    }
    builder.append('\n');
  }
  
  private void printFunctions(StringBuilder builder, List<Function> functions) {
    for(Function function: functions) {
      builder.append("def ").append(function.getName()).append('(');
      String separator = "";
      for(String parameter: function.getParameters()) {
        builder.append(separator).append(parameter);
        separator = ", ";
      }
      builder.append("):\n");
      function.getBody().accept(this, builder);
      builder.append('\n');
    }
  }
  

  @Override
  public StringBuilder visitArrayAccess(ArrayAccessExpr expr, StringBuilder builder) {
    expr.getReceiver().accept(this, builder);
    builder.append('[');
    expr.getIndex().accept(this, builder);
    builder.append(']');
    return builder;
  }

  @Override
  public StringBuilder visitArrayAssignment(ArrayAssignmentExpr expr, StringBuilder builder) {
    expr.getReceiver().accept(this, builder);
    builder.append('[');
    expr.getIndex().accept(this, builder);
    builder.append("] = ");
    expr.getExpr().accept(this, builder);
    return builder;
  }

  @Override
  public StringBuilder visitAttrAccess(AttrAccessExpr expr, StringBuilder builder) {
    expr.getReceiver().accept(this, builder);
    return builder.append('.').append(expr.getName());
  }

  @Override
  public StringBuilder visitAttrAssignment(AttrAssignmentExpr expr, StringBuilder builder) {
    expr.getReceiver().accept(this, builder);
    builder.append('.').append(expr.getName()).append(" = ");
    expr.getExpr().accept(this, builder);
    return builder;
  }

  @Override
  public StringBuilder visitBinary(BinaryExpr expr, StringBuilder builder) {
    expr.getExpr().accept(this, builder);
    builder.append(' ').append(expr.getKind().getOperator()).append(' ');
    expr.getExpr2().accept(this, builder);
    return builder;
  }

  @Override
  public StringBuilder visitBlock(BlockExpr expr, StringBuilder builder) {
    for(Expr e: expr.getInstructions()) {
      e.accept(this, builder);
      builder.append('\n');
    }
    return builder;
  }

  @Override
  public StringBuilder visitFlowStop(FlowStopExpr expr, StringBuilder builder) {
    builder.append(expr.getKind().getOperator());
    Expr exprOptional = expr.getOptionalExpr();
    if (exprOptional != null) {
      builder.append(' ');
      exprOptional.accept(this, builder);
    }
    return builder;
  }

  @Override
  public StringBuilder visitFunCall(FunCallExpr expr, StringBuilder builder) {
    builder.append(expr.getName()).append('(');
    String separator = "";
    for(Expr parameter: expr.getParameters()) {
      builder.append(separator);
      parameter.accept(this, builder);
      separator = ", ";
    }
    return builder.append(')');
  }

  @Override
  public StringBuilder visitIf(IfExpr expr, StringBuilder builder) {
    builder.append("if ");
    expr.getCondition().accept(this, builder);
    builder.append(":\n");
    expr.getTruePart().accept(this, builder);
    Expr falsePartOptional = expr.getFalsePartOptional();
    if (falsePartOptional != null) {
      builder.append("else:\n");
      falsePartOptional.accept(this, builder);
    }
    builder.append("end");
    return builder;
  }
  
  @Override
  public StringBuilder visitIsInstance(IsInstanceExpr expr, StringBuilder builder) {
    expr.accept(this, builder);
    builder.append(" ~ ").append(expr.getType());
    return builder;
  }

  @Override
  public StringBuilder visitLiteral(LiteralExpr expr, StringBuilder builder) {
    Object value = expr.getValue();
    if (value instanceof String) {
      builder.append('"').append(value).append('"');
    } else {
      builder.append(value);
    }
    return builder;
  }

  @Override
  public StringBuilder visitMethodCall(MethodCallExpr expr, StringBuilder builder) {
    expr.getReceiver().accept(this, builder);
    builder.append('.').append(expr.getName()).append('(');
    String separator = "";
    for(Expr parameter: expr.getParameters()) {
      builder.append(separator);
      parameter.accept(this, builder);
      separator = ", ";
    }
    return builder.append(')');
  }

  @Override
  public StringBuilder visitNewCall(NewCallExpr expr, StringBuilder builder) {
    builder.append("new").append(' ').append(expr.getName()).append('(');
    String separator = "";
    for(Expr parameter: expr.getParameters()) {
      builder.append(separator);
      parameter.accept(this, builder);
      separator = ", ";
    }
    return builder.append(')');
  }
  
  @Override
  public StringBuilder visitPrint(PrintExpr expr, StringBuilder builder) {
    builder.append("print ");
    String separator = "";
    for(Expr parameter: expr.getParameters()) {
      parameter.accept(this, builder);
      builder.append(separator);
      separator = ", ";
    }
    return builder;
  }

  @Override
  public StringBuilder visitUnary(UnaryExpr expr, StringBuilder builder) {
    builder.append(expr.getKind().getOperator()).append(' ');
    expr.accept(this, builder);
    return builder;
  }

  @Override
  public StringBuilder visitVarAccess(VarAccessExpr expr, StringBuilder builder) {
    return builder.append(expr.getName());
  }

  @Override
  public StringBuilder visitVarAssignment(VarAssignment expr, StringBuilder builder) {
    builder.append(expr.getName()).append(" = ");
    expr.getExpr().accept(this, builder);
    return builder;
  }

  @Override
  public StringBuilder visitWhile(WhileExpr expr, StringBuilder builder) {
    builder.append("while ");
    expr.getCondition().accept(this, builder);
    builder.append(":\n");
    expr.getBody().accept(this, builder);
    Expr otherwiseOptional = expr.getOtherwiseOptional();
    if (otherwiseOptional != null) {
      builder.append("else:\n");
      otherwiseOptional.accept(this, builder);
    }
    builder.append("end");
    return builder;
  }
}
