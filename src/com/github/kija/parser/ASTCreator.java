package com.github.kija.parser;

import java.util.ArrayList;
import java.util.List;

import com.github.kija.grammar.tools.GrammarEvaluator;
import com.github.kija.parser.ast.ArrayAccessExpr;
import com.github.kija.parser.ast.ArrayAssignmentExpr;
import com.github.kija.parser.ast.AttrAccessExpr;
import com.github.kija.parser.ast.AttrAssignmentExpr;
import com.github.kija.parser.ast.BinaryExpr;
import com.github.kija.parser.ast.BlockExpr;
import com.github.kija.parser.ast.Const;
import com.github.kija.parser.ast.Data;
import com.github.kija.parser.ast.Expr;
import com.github.kija.parser.ast.FlowStopExpr;
import com.github.kija.parser.ast.FunAccessExpr;
import com.github.kija.parser.ast.FunCallExpr;
import com.github.kija.parser.ast.Function;
import com.github.kija.parser.ast.IfExpr;
import com.github.kija.parser.ast.IsInstanceExpr;
import com.github.kija.parser.ast.LiteralExpr;
import com.github.kija.parser.ast.MethodCallExpr;
import com.github.kija.parser.ast.NewCallExpr;
import com.github.kija.parser.ast.PrintExpr;
import com.github.kija.parser.ast.Script;
import com.github.kija.parser.ast.UnaryExpr;
import com.github.kija.parser.ast.Use;
import com.github.kija.parser.ast.VarAccessExpr;
import com.github.kija.parser.ast.VarAssignment;
import com.github.kija.parser.ast.WhileExpr;

import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;

class ASTCreator implements GrammarEvaluator {
  private final LocationTracker tracker;
  private final ArrayList<Use> uses = new ArrayList<>();
  private final ArrayList<Const> consts = new ArrayList<>();
  private final ArrayList<Data> datas = new ArrayList<>();
  private final ArrayList<Function> functions = new ArrayList<>();
  
  public ASTCreator(LocationTracker tracker) {
    this.tracker = tracker;
  }
  
  private int findLineNumber(Expr expr) {
    return (expr != null)? expr.getLineNumber(): 1 + tracker.getLineNumber();
  }
  private int findFirstLineNumber(List<Expr> exprs) {
    return (!exprs.isEmpty())? exprs.get(0).getLineNumber(): 1 + tracker.getLineNumber();
  }
  
  public Script createScript() {
    return new Script(uses, consts, datas, functions);
  }
  
  @Override
  public void use_member(Token<String> id) {
    uses.add(new Use(id.value, id.lineNumber));
  }

  @Override
  public void const_member(Token<String> id, Expr expr) {
    consts.add(new Const(id.value, expr, id.lineNumber));
  }

  @Override
  public void data_member(Token<String> id, List<String> parameter_star) {
    datas.add(new Data(id.value, parameter_star, id.lineNumber));
  }

  @Override
  public void fun_member(Token<String> id, List<String> parameter_star, List<Expr> instr_star) {
    functions.add(new Function(id.value, parameter_star, block(instr_star), id.lineNumber));
  }
  
  @Override
  public String parameter(Token<String> id) {
    return id.value;
  }

  @Override
  public Expr instr_expr(Expr expr) {
    return expr;
  }

  @Override
  public Expr instr_return(Expr expr_optional) {
    return new FlowStopExpr(FlowStopExpr.Kind.RETURN, expr_optional, findLineNumber(expr_optional));
  }

  @Override
  public Expr instr_break(Expr expr_optional) {
    return new FlowStopExpr(FlowStopExpr.Kind.BREAK, expr_optional, findLineNumber(expr_optional));
  }

  @Override
  public Expr instr_continue() {
    return new FlowStopExpr(FlowStopExpr.Kind.CONTINUE, null, findLineNumber(null));
  }

  @Override
  public Expr instr_fail(Expr expr) {
    return new FlowStopExpr(FlowStopExpr.Kind.FAIL, expr, expr.getLineNumber());
  }
  
  @Override
  public Expr instr_print(List<Expr> expr_plus) {
    return new PrintExpr(expr_plus, expr_plus.get(0).getLineNumber());
  }

  @Override
  public BlockExpr block(List<Expr> instr_star) {
    return new BlockExpr(instr_star, findFirstLineNumber(instr_star));
  } 

  @Override
  public Expr expr_null() {
    return new LiteralExpr(null, findLineNumber(null));
  }
  @Override
  public Expr expr_bool(Token<Boolean> bool) {
    return new LiteralExpr(bool.value, bool.lineNumber);
  }
  @Override
  public Expr expr_integer(Token<Integer> integer) {
    return new LiteralExpr(integer.value, integer.lineNumber);
  }
  @Override
  public Expr expr_number(Token<Double> number) {
    return new LiteralExpr(number.value, number.lineNumber);
  }
  @Override
  public Expr expr_text(Token<String> text) {
    return new LiteralExpr(text.value, text.lineNumber);
  }

  @Override
  public Expr expr_parens(Expr expr) {
    return expr;
  }

  @Override
  public Expr expr_var_access(Token<String> id) {
    return new VarAccessExpr(id.value, id.lineNumber);
  }
  @Override
  public Expr expr_var_assignment(Token<String> id, Expr expr) {
    return new VarAssignment(id.value, expr, id.lineNumber);
  }
  @Override
  public Expr expr_attribute_access(Expr expr, Token<String> id) {
    return new AttrAccessExpr(expr, id.value, expr.getLineNumber());
  }
  @Override
  public Expr expr_attribute_assignment(Expr expr, Token<String> id, Expr expr2) {
    return new AttrAssignmentExpr(expr, id.value, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_array_access(Expr expr, Expr expr2) {
    return new ArrayAccessExpr(expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_array_assignment(Expr expr, Expr expr2, Expr expr3) {
    return new ArrayAssignmentExpr(expr, expr2, expr3, expr.getLineNumber());
  }

  @Override
  public Expr expr_fun_access(Token<String> id) {
    return new FunAccessExpr(id.value, id.lineNumber);
  }
  @Override
  public Expr expr_fun_call(Token<String> id, List<Expr> expr_star) {
    return new FunCallExpr(id.value, expr_star, id.lineNumber);
  }
  @Override
  public Expr expr_method_call(Expr expr, Token<String> id, List<Expr> expr_star) {
    return new MethodCallExpr(expr, id.value, expr_star, expr.getLineNumber());
  }
  @Override
  public Expr expr_new_call(Token<String> id, List<Expr> expr_star) {
    return new NewCallExpr(id.value, expr_star, id.lineNumber);
  }

  @Override
  public Expr expr_if(Expr expr, BlockExpr block) {
    return new IfExpr(expr, block, null, expr.getLineNumber());
  }
  
  @Override
  public Expr expr_if_else(Expr expr, BlockExpr block, BlockExpr block2) {
    return new IfExpr(expr, block, block2, expr.getLineNumber());
  }

  @Override
  public Expr expr_orif(Expr expr, Expr expr2, Expr expr3) {
    return new IfExpr(expr3, expr, expr2, expr.getLineNumber());
  }

  @Override
  public Expr expr_while(Expr expr, BlockExpr block) {
    return new WhileExpr(expr, block, null, expr.getLineNumber());
  }
  
  @Override
  public Expr expr_while_else(Expr expr, BlockExpr block, BlockExpr block2) {
    return new WhileExpr(expr, block, block2, expr.getLineNumber());
  }

  @Override
  public Expr expr_unary_minus(Expr expr) {
    return new UnaryExpr(UnaryExpr.Kind.MINUS, expr, expr.getLineNumber());
  }
  @Override
  public Expr expr_unary_plus(Expr expr) {
    return expr;
  }
  @Override
  public Expr expr_unary_not(Expr expr) {
    return new UnaryExpr(UnaryExpr.Kind.NOT, expr, expr.getLineNumber());
  }
  @Override
  public Expr expr_unary_complement(Expr expr) {
    return new UnaryExpr(UnaryExpr.Kind.COMPLEMENT, expr, expr.getLineNumber());
  }

  @Override
  public Expr expr_is_instance(Expr expr, Token<String> id) {
    return new IsInstanceExpr(expr, id.value, expr.getLineNumber());
  }

  @Override
  public Expr expr_binary_and(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.AND, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_or(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.OR, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_xor(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.XOR, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_add(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.ADD, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_sub(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.SUB, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_mul(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.MUL, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_div(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.DIV, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_mod(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.MOD, expr, expr2, expr.getLineNumber());
  }

  @Override
  public Expr expr_binary_eq(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.EQ, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_ne(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.NE, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_lt(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.LT, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_le(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.LE, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_gt(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.GT, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_ge(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.GE, expr, expr2, expr.getLineNumber());
  }

  @Override
  public Expr expr_binary_band(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.BAND, expr, expr2, expr.getLineNumber());
  }
  @Override
  public Expr expr_binary_bor(Expr expr, Expr expr2) {
    return new BinaryExpr(BinaryExpr.Kind.BOR, expr, expr2, expr.getLineNumber());
  }

  @Override
  public void acceptScript() {
    // cool
  }
}
