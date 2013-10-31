package com.github.kija.grammar.tools;

import com.github.kija.compiler.ast.BlockExpr;
import com.github.kija.compiler.ast.Expr;
import java.util.List;

/** 
 *  This class is generated - please do not edit it 
 */
public interface GrammarEvaluator {
  /** This methods is called after the reduction of the non terminal member
   *  by the grammar production use_member.
   *  <code>member ::= use id</code>
   */
  public void use_member(String id);
  /** This methods is called after the reduction of the non terminal member
   *  by the grammar production const_member.
   *  <code>member ::= _const id assign expr</code>
   */
  public void const_member(String id,Expr expr);
  /** This methods is called after the reduction of the non terminal member
   *  by the grammar production data_member.
   *  <code>member ::= data id lpar id_star_1 rpar</code>
   */
  public void data_member(String id,List<String> id_star);
  /** This methods is called after the reduction of the non terminal member
   *  by the grammar production fun_member.
   *  <code>member ::= def id lpar id_star_2 rpar colon instr_star_3</code>
   */
  public void fun_member(String id,List<String> id_star,List<Expr> instr_star);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_expr.
   *  <code>instr ::= expr eol</code>
   */
  public Expr instr_expr(Expr expr);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_return.
   *  <code>instr ::= _return expr_optional_4 eol</code>
   */
  public Expr instr_return(Expr expr_optional);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_break.
   *  <code>instr ::= _break expr_optional_5 eol</code>
   */
  public Expr instr_break(Expr expr_optional);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_continue.
   *  <code>instr ::= _continue expr_optional_6 eol</code>
   */
  public Expr instr_continue(Expr expr_optional);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_print.
   *  <code>instr ::= print expr_plus_7 eol</code>
   */
  public Expr instr_print(List<Expr> expr_plus);
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block.
   *  <code>block ::= instr_star_8</code>
   */
  public BlockExpr block(List<Expr> instr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_null.
   *  <code>expr ::= nulz</code>
   */
  public Expr expr_null();
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_bool.
   *  <code>expr ::= bool</code>
   */
  public Expr expr_bool(boolean bool);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_integer.
   *  <code>expr ::= integer</code>
   */
  public Expr expr_integer(int integer);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_number.
   *  <code>expr ::= number</code>
   */
  public Expr expr_number(double number);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_text.
   *  <code>expr ::= text</code>
   */
  public Expr expr_text(String text);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_parens.
   *  <code>expr ::= lpar expr rpar</code>
   */
  public Expr expr_parens(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_var_access.
   *  <code>expr ::= id</code>
   */
  public Expr expr_var_access(String id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_var_assignment.
   *  <code>expr ::= id assign expr</code>
   */
  public Expr expr_var_assignment(String id,Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_attribute_access.
   *  <code>expr ::= expr dot id</code>
   */
  public Expr expr_attribute_access(Expr expr,String id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_attribute_assignment.
   *  <code>expr ::= expr dot id assign expr</code>
   */
  public Expr expr_attribute_assignment(Expr expr,String id,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_array_access.
   *  <code>expr ::= expr lopt expr ropt</code>
   */
  public Expr expr_array_access(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_array_assignment.
   *  <code>expr ::= expr lopt expr ropt assign expr</code>
   */
  public Expr expr_array_assignment(Expr expr,Expr expr2,Expr expr3);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_fun_call.
   *  <code>expr ::= id lpar expr_star_9 rpar</code>
   */
  public Expr expr_fun_call(String id,List<Expr> expr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_method_call.
   *  <code>expr ::= expr dot id lpar expr_star_10 rpar</code>
   */
  public Expr expr_method_call(Expr expr,String id,List<Expr> expr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_new_call.
   *  <code>expr ::= _new id lpar expr_star_11 rpar</code>
   */
  public Expr expr_new_call(String id,List<Expr> expr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if_else.
   *  <code>expr ::= _if expr colon block _else colon block end</code>
   */
  public Expr expr_if_else(Expr expr,BlockExpr block,BlockExpr block2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if.
   *  <code>expr ::= _if expr colon block end</code>
   */
  public Expr expr_if(Expr expr,BlockExpr block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_orif.
   *  <code>expr ::= expr or expr _if expr</code>
   */
  public Expr expr_orif(Expr expr,Expr expr2,Expr expr3);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_while.
   *  <code>expr ::= _while expr colon block end</code>
   */
  public Expr expr_while(Expr expr,BlockExpr block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_while_else.
   *  <code>expr ::= _while expr colon block _else block end</code>
   */
  public Expr expr_while_else(Expr expr,BlockExpr block,BlockExpr block2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_minus.
   *  <code>expr ::= minus expr</code>
   */
  public Expr expr_unary_minus(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_plus.
   *  <code>expr ::= plus expr</code>
   */
  public Expr expr_unary_plus(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_not.
   *  <code>expr ::= bang expr</code>
   */
  public Expr expr_unary_not(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_complement.
   *  <code>expr ::= is expr</code>
   */
  public Expr expr_unary_complement(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_is_instance.
   *  <code>expr ::= expr is id</code>
   */
  public Expr expr_is_instance(Expr expr,String id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_and.
   *  <code>expr ::= expr amp expr</code>
   */
  public Expr expr_binary_and(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_or.
   *  <code>expr ::= expr pipe expr</code>
   */
  public Expr expr_binary_or(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_xor.
   *  <code>expr ::= expr xor expr</code>
   */
  public Expr expr_binary_xor(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_add.
   *  <code>expr ::= expr plus expr</code>
   */
  public Expr expr_binary_add(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_sub.
   *  <code>expr ::= expr minus expr</code>
   */
  public Expr expr_binary_sub(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_mul.
   *  <code>expr ::= expr star expr</code>
   */
  public Expr expr_binary_mul(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_div.
   *  <code>expr ::= expr slash expr</code>
   */
  public Expr expr_binary_div(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_mod.
   *  <code>expr ::= expr mod expr</code>
   */
  public Expr expr_binary_mod(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_eq.
   *  <code>expr ::= expr eq expr</code>
   */
  public Expr expr_binary_eq(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_ne.
   *  <code>expr ::= expr ne expr</code>
   */
  public Expr expr_binary_ne(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_lt.
   *  <code>expr ::= expr lt expr</code>
   */
  public Expr expr_binary_lt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_le.
   *  <code>expr ::= expr le expr</code>
   */
  public Expr expr_binary_le(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_gt.
   *  <code>expr ::= expr gt expr</code>
   */
  public Expr expr_binary_gt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_ge.
   *  <code>expr ::= expr ge expr</code>
   */
  public Expr expr_binary_ge(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_band.
   *  <code>expr ::= expr damp expr</code>
   */
  public Expr expr_binary_band(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_bor.
   *  <code>expr ::= expr dpipe expr</code>
   */
  public Expr expr_binary_bor(Expr expr,Expr expr2);

  public void acceptScript();
}
