package com.github.kija.grammar.tools;

  import com.github.kija.compiler.ast.BlockExpr;
    import com.github.kija.compiler.ast.Expr;
    import java.util.List;
  
import com.github.kija.grammar.lexer.RuleEnum;
import com.github.kija.grammar.parser.TerminalEnum;
import com.github.kija.grammar.parser.NonTerminalEnum;
import com.github.kija.grammar.parser.ProductionEnum;
import com.github.kija.grammar.tools.TerminalEvaluator;
import com.github.kija.grammar.tools.GrammarEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.tools.AnalyzerListener;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;

/**  This class is called by the parser when
 *  <ol>
 *    <li>a terminal is shifted</li>
 *    <li>a non terminal is reduced</li>
 *    <li>a non terminal is accepted</li>
 *   </ol>
 *   In that case, depending on the information of the .xtls, terminal and non-terminal
 *   values are pushed/pop from a semantic stack.
 *   
 *   Furthermore, in case of error recovery, values of the stack can be pop out
 *   depending if the last recognized element is a terminal or a non-terminal.
 * 
 *  This class is generated - please do not edit it 
 */
public class AnalyzerProcessor<B extends LexerBuffer,D>
  implements AnalyzerListener<RuleEnum,B,TerminalEnum,NonTerminalEnum,ProductionEnum> {
          
  private final GrammarEvaluator grammarEvaluator;
  private final TerminalEvaluator<? super D> terminalEvaluator;
  private final DataViewer<? super B,? extends D> dataViewer;
  private final SemanticStack stack;
  
  protected AnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    this.terminalEvaluator=terminalEvaluator;
    this.grammarEvaluator=grammarEvaluator;
    this.dataViewer=dataViewer;
    this.stack=stack;
  }
  
  /** Creates a tools listener that redirect accept/shift/reduce and comment to the terminal Evaluator
      and the grammar evaluator..
      This constructor allows to share the same stack between more
      than one parser processor.
      @param terminalEvaluator the terminal evaluator.
      @param grammarEvaluator the grammar evaluator.
      @param stack the stack used by the processor
   */
  public static <B extends LexerBuffer,D> AnalyzerProcessor<B,D>
    createAnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    
    return new AnalyzerProcessor<B,D>(terminalEvaluator,grammarEvaluator,dataViewer,stack);
  }
  
  public void comment(RuleEnum rule, B buffer) {
    D data;
    switch(rule) {           case comment:
            data=dataViewer.view(buffer);
            terminalEvaluator.comment(data);
            return;
              default:
    }
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(TerminalEnum terminal, RuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case plus: {
                       return;
           }
                 case minus: {
                       return;
           }
                 case star: {
                       return;
           }
                 case slash: {
                       return;
           }
                 case mod: {
                       return;
           }
                 case assign: {
                       return;
           }
                 case eq: {
                       return;
           }
                 case ne: {
                       return;
           }
                 case lt: {
                       return;
           }
                 case le: {
                       return;
           }
                 case gt: {
                       return;
           }
                 case ge: {
                       return;
           }
                 case dot: {
                       return;
           }
                 case bang: {
                       return;
           }
                 case pipe: {
                       return;
           }
                 case amp: {
                       return;
           }
                 case xor: {
                       return;
           }
                 case dpipe: {
                       return;
           }
                 case damp: {
                       return;
           }
                 case at: {
                       return;
           }
                 case is: {
                       return;
           }
                 case colon: {
                       return;
           }
                 case comma: {
                       return;
           }
                 case eol: {
                       return;
           }
                 case lpar: {
                       return;
           }
                 case rpar: {
                       return;
           }
                 case lcurl: {
                       return;
           }
                 case rcurl: {
                       return;
           }
                 case lopt: {
                       return;
           }
                 case ropt: {
                       return;
           }
                 case use: {
                       return;
           }
                 case data: {
                       return;
           }
                 case def: {
                       return;
           }
                 case _const: {
                       return;
           }
                 case end: {
                       return;
           }
                 case _new: {
                       return;
           }
                 case _if: {
                       return;
           }
                 case _else: {
                       return;
           }
                 case or: {
                       return;
           }
                 case print: {
                       return;
           }
                 case _while: {
                       return;
           }
                 case _return: {
                       return;
           }
                 case _break: {
                       return;
           }
                 case _continue: {
                       return;
           }
                 case nulz: {
                       return;
           }
                 case bool: {
         data=dataViewer.view(buffer);
                                  boolean bool=terminalEvaluator.bool(data);
                                      stack.push_boolean(bool);
                                 return;
           }
                 case id: {
         data=dataViewer.view(buffer);
                                  String id=terminalEvaluator.id(data);
                                      stack.push_Object(id);
                                 return;
           }
                 case text: {
         data=dataViewer.view(buffer);
                                  String text=terminalEvaluator.text(data);
                                      stack.push_Object(text);
                                 return;
           }
                 case integer: {
         data=dataViewer.view(buffer);
                                  int integer=terminalEvaluator.integer(data);
                                      stack.push_int(integer);
                                 return;
           }
                 case number: {
         data=dataViewer.view(buffer);
                                  double number=terminalEvaluator.number(data);
                                      stack.push_double(number);
                                 return;
           }
                 case __eof__: {
                       return;
           }
                 }
     throw new AssertionError("unknown terminal "+terminal);
   }
    
    
    @SuppressWarnings("unchecked")
    public void reduce(ProductionEnum production) {
      switch(production) {           case member_star_0_empty: { // STAR_EMPTY
            
          }
          return;
                    case member_star_0_rec: { // STAR_RECURSIVE_LEFT
            
          }
          return;
                    case script: { // not synthetic
            
          }
          return;
                    case use_member: { // not synthetic
                                 String id=(String)stack.pop_Object();
                                           grammarEvaluator.use_member(id);
                      
          }
          return;
                    case const_member: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                           grammarEvaluator.const_member(id,expr);
                      
          }
          return;
                    case id_star_1_element: { // STAR_SINGLETON
                             java.util.ArrayList<String> list=
                     new java.util.ArrayList<String>();
                   list.add((String)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case id_star_1_rec: { // STAR_RECURSIVE_LEFT
                            
                    String id=(String)stack.pop_Object();
                    List<String> id_star_1_sub=(List<String>)stack.pop_Object();
                     id_star_1_sub.add(id);
                     stack.push_Object(id_star_1_sub);
                       
          }
          return;
                    case id_star_1_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case id_star_1_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case data_member: { // not synthetic
                                 List<String> id_star_1=(List<String>)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                           grammarEvaluator.data_member(id,id_star_1);
                      
          }
          return;
                    case id_star_2_element: { // STAR_SINGLETON
                             java.util.ArrayList<String> list=
                     new java.util.ArrayList<String>();
                   list.add((String)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case id_star_2_rec: { // STAR_RECURSIVE_LEFT
                            
                    String id=(String)stack.pop_Object();
                    List<String> id_star_2_sub=(List<String>)stack.pop_Object();
                     id_star_2_sub.add(id);
                     stack.push_Object(id_star_2_sub);
                       
          }
          return;
                    case id_star_2_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case id_star_2_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case instr_star_3_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case instr_star_3_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr instr=(Expr)stack.pop_Object();
                    List<Expr> instr_star_3=(List<Expr>)stack.pop_Object();
                     instr_star_3.add(instr);
                     stack.push_Object(instr_star_3);
                       
          }
          return;
                    case fun_member: { // not synthetic
                                 List<Expr> instr_star_3=(List<Expr>)stack.pop_Object();
                                          List<String> id_star_2=(List<String>)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                           grammarEvaluator.fun_member(id,id_star_2,instr_star_3);
                      
          }
          return;
                    case instr_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_expr(expr));
                      
          }
          return;
                    case expr_optional_4_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case expr_optional_4_expr: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_return: { // not synthetic
                                 Expr expr_optional_4=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_return(expr_optional_4));
                      
          }
          return;
                    case expr_optional_5_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case expr_optional_5_expr: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_break: { // not synthetic
                                 Expr expr_optional_5=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_break(expr_optional_5));
                      
          }
          return;
                    case expr_optional_6_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case expr_optional_6_expr: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_continue: { // not synthetic
                                 Expr expr_optional_6=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_continue(expr_optional_6));
                      
          }
          return;
                    case expr_plus_7_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_plus_7_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_plus_7=(List<Expr>)stack.pop_Object();
                     expr_plus_7.add(expr);
                     stack.push_Object(expr_plus_7);
                       
          }
          return;
                    case instr_print: { // not synthetic
                                 List<Expr> expr_plus_7=(List<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_print(expr_plus_7));
                      
          }
          return;
                    case instr_star_8_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case instr_star_8_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr instr=(Expr)stack.pop_Object();
                    List<Expr> instr_star_8=(List<Expr>)stack.pop_Object();
                     instr_star_8.add(instr);
                     stack.push_Object(instr_star_8);
                       
          }
          return;
                    case block: { // not synthetic
                                 List<Expr> instr_star_8=(List<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block(instr_star_8));
                      
          }
          return;
                    case expr_null: { // not synthetic
                                       stack.push_Object(grammarEvaluator.expr_null());
                      
          }
          return;
                    case expr_bool: { // not synthetic
                                 boolean bool=stack.pop_boolean();
                                                stack.push_Object(grammarEvaluator.expr_bool(bool));
                      
          }
          return;
                    case expr_integer: { // not synthetic
                                 int integer=stack.pop_int();
                                                stack.push_Object(grammarEvaluator.expr_integer(integer));
                      
          }
          return;
                    case expr_number: { // not synthetic
                                 double number=stack.pop_double();
                                                stack.push_Object(grammarEvaluator.expr_number(number));
                      
          }
          return;
                    case expr_text: { // not synthetic
                                 String text=(String)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_text(text));
                      
          }
          return;
                    case expr_parens: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_parens(expr));
                      
          }
          return;
                    case expr_var_access: { // not synthetic
                                 String id=(String)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_var_access(id));
                      
          }
          return;
                    case expr_var_assignment: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_var_assignment(id,expr));
                      
          }
          return;
                    case expr_attribute_access: { // not synthetic
                                 String id=(String)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_attribute_access(expr,id));
                      
          }
          return;
                    case expr_attribute_assignment: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_attribute_assignment(expr,id,expr2));
                      
          }
          return;
                    case expr_array_access: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_array_access(expr,expr2));
                      
          }
          return;
                    case expr_array_assignment: { // not synthetic
                                 Expr expr3=(Expr)stack.pop_Object();
                                          Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_array_assignment(expr,expr2,expr3));
                      
          }
          return;
                    case expr_star_9_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_9_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_9_sub=(List<Expr>)stack.pop_Object();
                     expr_star_9_sub.add(expr);
                     stack.push_Object(expr_star_9_sub);
                       
          }
          return;
                    case expr_star_9_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_9_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_fun_call: { // not synthetic
                                 List<Expr> expr_star_9=(List<Expr>)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_fun_call(id,expr_star_9));
                      
          }
          return;
                    case expr_star_10_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_10_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_10_sub=(List<Expr>)stack.pop_Object();
                     expr_star_10_sub.add(expr);
                     stack.push_Object(expr_star_10_sub);
                       
          }
          return;
                    case expr_star_10_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_10_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_method_call: { // not synthetic
                                 List<Expr> expr_star_10=(List<Expr>)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_method_call(expr,id,expr_star_10));
                      
          }
          return;
                    case expr_star_11_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_11_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_11_sub=(List<Expr>)stack.pop_Object();
                     expr_star_11_sub.add(expr);
                     stack.push_Object(expr_star_11_sub);
                       
          }
          return;
                    case expr_star_11_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_11_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_new_call: { // not synthetic
                                 List<Expr> expr_star_11=(List<Expr>)stack.pop_Object();
                                          String id=(String)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_new_call(id,expr_star_11));
                      
          }
          return;
                    case expr_if_else: { // not synthetic
                                 BlockExpr block2=(BlockExpr)stack.pop_Object();
                                          BlockExpr block=(BlockExpr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if_else(expr,block,block2));
                      
          }
          return;
                    case expr_if: { // not synthetic
                                 BlockExpr block=(BlockExpr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if(expr,block));
                      
          }
          return;
                    case expr_orif: { // not synthetic
                                 Expr expr3=(Expr)stack.pop_Object();
                                          Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_orif(expr,expr2,expr3));
                      
          }
          return;
                    case expr_while: { // not synthetic
                                 BlockExpr block=(BlockExpr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_while(expr,block));
                      
          }
          return;
                    case expr_while_else: { // not synthetic
                                 BlockExpr block2=(BlockExpr)stack.pop_Object();
                                          BlockExpr block=(BlockExpr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_while_else(expr,block,block2));
                      
          }
          return;
                    case expr_unary_minus: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_minus(expr));
                      
          }
          return;
                    case expr_unary_plus: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_plus(expr));
                      
          }
          return;
                    case expr_unary_not: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_not(expr));
                      
          }
          return;
                    case expr_unary_complement: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_complement(expr));
                      
          }
          return;
                    case expr_is_instance: { // not synthetic
                                 String id=(String)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_is_instance(expr,id));
                      
          }
          return;
                    case expr_binary_and: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_and(expr,expr2));
                      
          }
          return;
                    case expr_binary_or: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_or(expr,expr2));
                      
          }
          return;
                    case expr_binary_xor: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_xor(expr,expr2));
                      
          }
          return;
                    case expr_binary_add: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_add(expr,expr2));
                      
          }
          return;
                    case expr_binary_sub: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_sub(expr,expr2));
                      
          }
          return;
                    case expr_binary_mul: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_mul(expr,expr2));
                      
          }
          return;
                    case expr_binary_div: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_div(expr,expr2));
                      
          }
          return;
                    case expr_binary_mod: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_mod(expr,expr2));
                      
          }
          return;
                    case expr_binary_eq: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_eq(expr,expr2));
                      
          }
          return;
                    case expr_binary_ne: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_ne(expr,expr2));
                      
          }
          return;
                    case expr_binary_lt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_lt(expr,expr2));
                      
          }
          return;
                    case expr_binary_le: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_le(expr,expr2));
                      
          }
          return;
                    case expr_binary_gt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_gt(expr,expr2));
                      
          }
          return;
                    case expr_binary_ge: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_ge(expr,expr2));
                      
          }
          return;
                    case expr_binary_band: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_band(expr,expr2));
                      
          }
          return;
                    case expr_binary_bor: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_bor(expr,expr2));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(NonTerminalEnum nonterminal) {
       switch(nonterminal) {            case script:
             grammarEvaluator.acceptScript();
             return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(TerminalEnum terminal) {
        switch(terminal) {             case plus:
              
              return;
                         case minus:
              
              return;
                         case star:
              
              return;
                         case slash:
              
              return;
                         case mod:
              
              return;
                         case assign:
              
              return;
                         case eq:
              
              return;
                         case ne:
              
              return;
                         case lt:
              
              return;
                         case le:
              
              return;
                         case gt:
              
              return;
                         case ge:
              
              return;
                         case dot:
              
              return;
                         case bang:
              
              return;
                         case pipe:
              
              return;
                         case amp:
              
              return;
                         case xor:
              
              return;
                         case dpipe:
              
              return;
                         case damp:
              
              return;
                         case at:
              
              return;
                         case is:
              
              return;
                         case colon:
              
              return;
                         case comma:
              
              return;
                         case eol:
              
              return;
                         case lpar:
              
              return;
                         case rpar:
              
              return;
                         case lcurl:
              
              return;
                         case rcurl:
              
              return;
                         case lopt:
              
              return;
                         case ropt:
              
              return;
                         case use:
              
              return;
                         case data:
              
              return;
                         case def:
              
              return;
                         case _const:
              
              return;
                         case end:
              
              return;
                         case _new:
              
              return;
                         case _if:
              
              return;
                         case _else:
              
              return;
                         case or:
              
              return;
                         case print:
              
              return;
                         case _while:
              
              return;
                         case _return:
              
              return;
                         case _break:
              
              return;
                         case _continue:
              
              return;
                         case nulz:
              
              return;
                         case bool:
              stack.pop_boolean();
              return;
                         case id:
              stack.pop_Object();
              return;
                         case text:
              stack.pop_Object();
              return;
                         case integer:
              stack.pop_int();
              return;
                         case number:
              stack.pop_double();
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(NonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case script:
              
              return;
                         case member:
              
              return;
                         case instr:
              stack.pop_Object();
              return;
                         case block:
              stack.pop_Object();
              return;
                         case expr:
              stack.pop_Object();
              return;
                         case member_star_0:
              
              return;
                         case id_star_1:
              stack.pop_Object();
              return;
                         case id_star_1_sub:
              stack.pop_Object();
              return;
                         case id_star_2:
              stack.pop_Object();
              return;
                         case id_star_2_sub:
              stack.pop_Object();
              return;
                         case instr_star_3:
              stack.pop_Object();
              return;
                         case expr_optional_4:
              stack.pop_Object();
              return;
                         case expr_optional_5:
              stack.pop_Object();
              return;
                         case expr_optional_6:
              stack.pop_Object();
              return;
                         case expr_plus_7:
              stack.pop_Object();
              return;
                         case instr_star_8:
              stack.pop_Object();
              return;
                         case expr_star_9:
              stack.pop_Object();
              return;
                         case expr_star_9_sub:
              stack.pop_Object();
              return;
                         case expr_star_10:
              stack.pop_Object();
              return;
                         case expr_star_10_sub:
              stack.pop_Object();
              return;
                         case expr_star_11:
              stack.pop_Object();
              return;
                         case expr_star_11_sub:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}