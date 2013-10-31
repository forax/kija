package com.github.kija.compiler;

import java.util.ArrayList;
import java.util.List;

import com.github.kija.compiler.ast.ArrayAccessExpr;
import com.github.kija.compiler.ast.ArrayAssignmentExpr;
import com.github.kija.compiler.ast.AttrAccessExpr;
import com.github.kija.compiler.ast.AttrAssignmentExpr;
import com.github.kija.compiler.ast.BinaryExpr;
import com.github.kija.compiler.ast.BlockExpr;
import com.github.kija.compiler.ast.FlowStopExpr;
import com.github.kija.compiler.ast.Const;
import com.github.kija.compiler.ast.Data;
import com.github.kija.compiler.ast.Expr;
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
import com.github.kija.grammar.tools.GrammarEvaluator;

public class ASTCreator implements GrammarEvaluator {
  private final ArrayList<Use> uses = new ArrayList<>();
  private final ArrayList<Const> consts = new ArrayList<>();
  private final ArrayList<Data> datas = new ArrayList<>();
  private final ArrayList<Function> functions = new ArrayList<>();
  
  public Script createScript() {
    return new Script(uses, consts, datas, functions);
  }
  
  @Override
  public void use_member(String id) {
    uses.add(new Use(id));
  }

  @Override
  public void const_member(String id, Expr expr) {
    consts.add(new Const(id, expr));
  }

  @Override
  public void data_member(String id, List<String> id_star) {
    datas.add(new Data(id, id_star));
  }

  @Override
  public void fun_member(String id, List<String> id_star, List<Expr> instr_star) {
    functions.add(new Function(id, id_star, new BlockExpr(instr_star)));
  }

  @Override
  public Expr instr_expr(Expr expr) {
    return expr;
  }

  @Override
  public Expr instr_return(Expr expr_optional) {
    return new FlowStopExpr(FlowStopExpr.Kind.RETURN, expr_optional);
  }

  @Override
  public Expr instr_break(Expr expr_optional) {
    return new FlowStopExpr(FlowStopExpr.Kind.BREAK, expr_optional);
  }

  @Override
  public Expr instr_continue(Expr expr_optional) {
    return new FlowStopExpr(FlowStopExpr.Kind.CONTINUE, expr_optional);
  }

  @Override
  public Expr instr_print(List<Expr> expr_plus) {
    return new PrintExpr(expr_plus);
  }

  @Override
  public BlockExpr block(List<Expr> instr_star) {
    return new BlockExpr(instr_star);
  } 

  @Override
  public Expr expr_null() {
    return new LiteralExpr(null);
  }
  @Override
  public Expr expr_bool(boolean bool) {
    return new LiteralExpr(bool);
  }
  @Override
  public Expr expr_integer(int integer) {
    return new LiteralExpr(integer);
  }
  @Override
  public Expr expr_number(double number) {
    return new LiteralExpr(number);
  }
  @Override
  public Expr expr_text(String text) {
    return new LiteralExpr(text);
  }

  @Override
  public Expr expr_parens(Expr expr) {
    return expr;
  }

  @Override
  public Expr expr_var_access(String id) {
    return new VarAccessExpr(id);
  }
  @Override
  public Expr expr_var_assignment(String id, Expr expr) {
    return new VarAssignment(id, expr);
  }
  @Override
  public Expr expr_attribute_access(Expr expr, String id) {
    return new AttrAccessExpr(expr, id);
  }
  @Override
  public Expr expr_attribute_assignment(Expr expr, String id, Expr expr2) {
    return new AttrAssignmentExpr(expr, id, expr2);
  }
  @Override
  public Expr expr_array_access(Expr expr, Expr expr2) {
    return new ArrayAccessExpr(expr, expr2);
  }
  @Override
  public Expr expr_array_assignment(Expr expr, Expr expr2, Expr expr3) {
    return new ArrayAssignmentExpr(expr, expr2, expr3);
  }

  @Override
  public Expr expr_fun_call(String id, List<Expr> expr_star) {
    return new FunCallExpr(id, expr_star);
  }
  @Override
  public Expr expr_method_call(Expr expr, String id, List<Expr> expr_star) {
    return new MethodCallExpr(expr, id, expr_star);
  }
  @Override
  public Expr expr_new_call(String id, List<Expr> expr_star) {
    return new NewCallExpr(id, expr_star);
  }

  @Override
  public Expr expr_if(Expr expr, BlockExpr block) {
    return new IfExpr(expr, block, null);
  }
  
  @Override
  public Expr expr_if_else(Expr expr, BlockExpr block, BlockExpr block2) {
    return new IfExpr(expr, block, block2);
  }

  @Override
  public Expr expr_orif(Expr expr, Expr expr2, Expr expr3) {
    return new IfExpr(expr3, expr, expr2);
  }

  @Override
  public Expr expr_while(Expr expr, BlockExpr block) {
    return new WhileExpr(expr, block, null);
  }
  
  @Override
  public Expr expr_while_else(Expr expr, BlockExpr block, BlockExpr block2) {
    return new WhileExpr(expr, block, block2);
  }

  @Override
  public Expr expr_unary_minus(Expr expr) {
    return new UnaryExpr(UnaryExpr.Kind.MINUS, expr);
  }
  @Override
  public Expr expr_unary_plus(Expr expr) {
    return expr;
  }
  @Override
  public Expr expr_unary_not(Expr expr) {
    return new UnaryExpr(UnaryExpr.Kind.NOT, expr);
  }
  @Override
  public Expr expr_unary_complement(Expr expr) {
    return new UnaryExpr(UnaryExpr.Kind.COMPLEMENT, expr);
  }

  @Override
  public Expr expr_is_instance(Expr expr, String id) {
    return new IsInstanceExpr(expr, id);
  }

  @Override
  public Expr expr_binary_and(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.AND, expr, expr2);
  }
  @Override
  public Expr expr_binary_or(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.OR, expr, expr2);
  }
  @Override
  public Expr expr_binary_xor(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.XOR, expr, expr2);
  }
  @Override
  public Expr expr_binary_add(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.ADD, expr, expr2);
  }
  @Override
  public Expr expr_binary_sub(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.SUB, expr, expr2);
  }
  @Override
  public Expr expr_binary_mul(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.MUL, expr, expr2);
  }
  @Override
  public Expr expr_binary_div(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.DIV, expr, expr2);
  }
  @Override
  public Expr expr_binary_mod(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.MOD, expr, expr2);
  }

  @Override
  public Expr expr_binary_eq(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.EQ, expr, expr2);
  }
  @Override
  public Expr expr_binary_ne(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.NE, expr, expr2);
  }
  @Override
  public Expr expr_binary_lt(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.LT, expr, expr2);
  }
  @Override
  public Expr expr_binary_le(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.LE, expr, expr2);
  }
  @Override
  public Expr expr_binary_gt(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.GT, expr, expr2);
  }
  @Override
  public Expr expr_binary_ge(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.GE, expr, expr2);
  }

  @Override
  public Expr expr_binary_band(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.BAND, expr, expr2);
  }
  @Override
  public Expr expr_binary_bor(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.BOR, expr, expr2);
  }

  @Override
  public void acceptScript() {
    // cool
  }
}
