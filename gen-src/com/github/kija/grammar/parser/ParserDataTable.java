package com.github.kija.grammar.parser;

import com.github.kija.grammar.parser.NonTerminalEnum;
import com.github.kija.grammar.parser.ProductionEnum;
import com.github.kija.grammar.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class ParserDataTable {
  private ParserDataTable() {
   accept = AcceptAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
   exit = ExitAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
    initexpr_optional_4Gotoes();
    initinstrGotoes();
    initexpr_optional_6Gotoes();
    initinstr_star_8Gotoes();
    initinstr_star_3Gotoes();
    initexpr_optional_5Gotoes();
    initexpr_star_10Gotoes();
    initexpr_star_11_subGotoes();
    initid_star_1Gotoes();
    initexprGotoes();
    initmember_star_0Gotoes();
    initexpr_plus_7Gotoes();
    initmemberGotoes();
    initexpr_star_9Gotoes();
    initscriptGotoes();
    initexpr_star_9_subGotoes();
    initid_star_1_subGotoes();
    initid_star_2_subGotoes();
    initexpr_star_11Gotoes();
    initid_star_2Gotoes();
    initblockGotoes();
    initexpr_star_10_subGotoes();
    reduceconst_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.const_member,4,memberGotoes);
    reduceexpr_array_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_array_access,4,exprGotoes);
    reduceinstr_star_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_3_rec,2,instr_star_3Gotoes);
    reduceinstr_break = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_break,3,instrGotoes);
    reduceid_star_2_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_element,1,id_star_2_subGotoes);
    reduceexpr_unary_minus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_minus,2,exprGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_star_10_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_rec,3,expr_star_10_subGotoes);
    reduceid_star_2_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_rec,3,id_star_2_subGotoes);
    reduceexpr_binary_bor = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_bor,3,exprGotoes);
    reducemember_star_0_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.member_star_0_rec,2,member_star_0Gotoes);
    reduceexpr_number = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_number,1,exprGotoes);
    reducefun_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.fun_member,7,memberGotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,1,blockGotoes);
    reduceexpr_optional_4_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_4_empty,0,expr_optional_4Gotoes);
    reduceexpr_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_text,1,exprGotoes);
    reduceexpr_optional_5_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_5_expr,1,expr_optional_5Gotoes);
    reduceid_star_1_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_empty,0,id_star_1Gotoes);
    reduceuse_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.use_member,2,memberGotoes);
    reducedata_member = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.data_member,5,memberGotoes);
    reduceexpr_star_10_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_element,1,expr_star_10_subGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceexpr_star_11_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_11_rec,3,expr_star_11_subGotoes);
    reduceexpr_unary_complement = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_complement,2,exprGotoes);
    reduceexpr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while,5,exprGotoes);
    reduceexpr_new_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_new_call,5,exprGotoes);
    reduceexpr_while_else = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while_else,7,exprGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceexpr_fun_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_fun_call,4,exprGotoes);
    reduceexpr_star_10_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_empty,0,expr_star_10Gotoes);
    reduceexpr_star_9_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_element,1,expr_star_9_subGotoes);
    reduceinstr_star_8_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_8_rec,2,instr_star_8Gotoes);
    reduceexpr_binary_or = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_or,3,exprGotoes);
    reduceexpr_plus_7_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_plus_7_rec,3,expr_plus_7Gotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    reduceexpr_plus_7_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_plus_7_element,1,expr_plus_7Gotoes);
    reduceexpr_star_11_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_11_empty,0,expr_star_11Gotoes);
    reduceexpr_star_11_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_11_element,1,expr_star_11_subGotoes);
    reduceexpr_binary_band = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_band,3,exprGotoes);
    reduceid_star_2_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_through,1,id_star_2Gotoes);
    reduceid_star_1_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_through,1,id_star_1Gotoes);
    reduceid_star_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_empty,0,id_star_2Gotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceexpr_optional_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_5_empty,0,expr_optional_5Gotoes);
    reduceexpr_binary_and = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_and,3,exprGotoes);
    reduceexpr_orif = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_orif,5,exprGotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceexpr_null = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_null,1,exprGotoes);
    reduceid_star_1_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_rec,3,id_star_1_subGotoes);
    reducemember_star_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.member_star_0_empty,0,member_star_0Gotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceexpr_optional_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_6_empty,0,expr_optional_6Gotoes);
    reduceinstr_star_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_3_empty,0,instr_star_3Gotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceexpr_star_9_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_rec,3,expr_star_9_subGotoes);
    reduceexpr_star_9_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_empty,0,expr_star_9Gotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,2,instrGotoes);
    reduceexpr_array_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_array_assignment,6,exprGotoes);
    reduceinstr_star_8_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_8_empty,0,instr_star_8Gotoes);
    reduceexpr_method_call = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_method_call,6,exprGotoes);
    reduceexpr_is_instance = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_is_instance,3,exprGotoes);
    reduceexpr_optional_4_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_4_expr,1,expr_optional_4Gotoes);
    reduceid_star_1_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_element,1,id_star_1_subGotoes);
    reduceexpr_attribute_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_attribute_assignment,5,exprGotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,5,exprGotoes);
    reduceexpr_optional_6_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_optional_6_expr,1,expr_optional_6Gotoes);
    reduceexpr_attribute_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_attribute_access,3,exprGotoes);
    reduceinstr_continue = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_continue,3,instrGotoes);
    reduceexpr_star_10_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_10_through,1,expr_star_10Gotoes);
    reduceexpr_unary_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_plus,2,exprGotoes);
    reduceinstr_print = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_print,3,instrGotoes);
    reduceexpr_integer = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_integer,1,exprGotoes);
    reduceexpr_binary_xor = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_xor,3,exprGotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,3,instrGotoes);
    reduceexpr_star_11_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_11_through,1,expr_star_11Gotoes);
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reduceexpr_if_else = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if_else,8,exprGotoes);
    reduceexpr_star_9_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_through,1,expr_star_9Gotoes);
    reduceexpr_bool = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_bool,1,exprGotoes);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift53 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(53);
    shift67 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(67);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift156 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(156);
    shift130 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(130);
    shift79 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(79);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift83 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(83);
    shift106 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(106);
    shift32 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(32);
    shift81 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(81);
    shift47 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(47);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift34 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(34);
    shift26 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(26);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift143 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(143);
    shift115 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(115);
    shift155 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(155);
    shift117 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(117);
    shift92 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(92);
    shift42 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(42);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift134 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(134);
    shift147 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(147);
    shift49 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(49);
    shift88 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(88);
    shift95 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(95);
    shift59 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(59);
    shift145 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(145);
    shift86 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(86);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift40 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(40);
    shift84 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(84);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift55 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(55);
    shift122 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(122);
    shift71 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(71);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift39 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(39);
    shift65 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(65);
    shift24 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(24);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift75 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(75);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift110 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(110);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift140 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(140);
    shift69 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(69);
    shift90 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(90);
    shift126 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(126);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    shift108 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(108);
    shift120 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(120);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift128 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(128);
    shift102 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(102);
    shift73 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(73);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift123 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(123);
    shift41 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(41);
    shift77 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(77);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift63 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(63);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift51 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(51);
    shift112 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(112);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift97 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(97);
    shift152 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(152);
    shift36 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(36);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift99 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(99);
    shift125 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(125);
    shift61 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(61);
    shift104 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(104);
    shift57 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(57);
    shift142 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(142);
    shift138 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(138);
    shift157 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(157);
    shift70 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(70);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    init_breakArray();
    initassignArray();
    initcommaArray();
    init_continueArray();
    initorArray();
    initstarArray();
    initpipeArray();
    init_newArray();
    initslashArray();
    initdefArray();
    initneArray();
    initgeArray();
    initampArray();
    initroptArray();
    initdpipeArray();
    initdataArray();
    initeqArray();
    initintegerArray();
    inittextArray();
    initidArray();
    init_ifArray();
    initloptArray();
    initeolArray();
    initnulzArray();
    init_constArray();
    initboolArray();
    initisArray();
    initgtArray();
    initxorArray();
    init_elseArray();
    initcolonArray();
    init_whileArray();
    initendArray();
    initplusArray();
    init_returnArray();
    init__eof__Array();
    initdotArray();
    initmodArray();
    inituseArray();
    initltArray();
    initbangArray();
    initdampArray();
    initnumberArray();
    initleArray();
    initminusArray();
    initprintArray();
    initrparArray();
    initlparArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum._break,_breakArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum._continue,_continueArray);
    tableMap.put(TerminalEnum.or,orArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum._new,_newArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.def,defArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.amp,ampArray);
    tableMap.put(TerminalEnum.ropt,roptArray);
    tableMap.put(TerminalEnum.dpipe,dpipeArray);
    tableMap.put(TerminalEnum.data,dataArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.integer,integerArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.lopt,loptArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.nulz,nulzArray);
    tableMap.put(TerminalEnum._const,_constArray);
    tableMap.put(TerminalEnum.bool,boolArray);
    tableMap.put(TerminalEnum.is,isArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.xor,xorArray);
    tableMap.put(TerminalEnum._else,_elseArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.end,endArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum.use,useArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum.damp,dampArray);
    tableMap.put(TerminalEnum.number,numberArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.print,printArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),160,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0id_metadata0reduceexpr_is_instance = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_is_instance);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0expr_star_9_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9_sub,null);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0rpar_metadata0reducedata_member = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reducedata_member);
    metadata0expr_star_9_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9,null);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0expr_plus_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_plus_7,null);
    metadata0end_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_if);
    metadata0expr_star_10_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_10_sub,null);
    metadata0id_metadata0reduceuse_member = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceuse_member);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0end_metadata0reduceexpr_if_else = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_if_else);
    metadata0damp_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.damp,null);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0_const_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._const,null);
    metadata0eol_metadata0reduceinstr_expr = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_expr);
    metadata0eol_metadata0reduceinstr_continue = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_continue);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0print_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.print,null);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0id_metadata0reduceid_star_1_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_1_element);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0eol_metadata0reduceinstr_break = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_break);
    metadata0id_star_2_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2_sub,null);
    metadata0expr_optional_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_optional_5,null);
    metadata0id_metadata0reduceid_star_2_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_element);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0use_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.use,null);
    metadata0id_star_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_1,null);
    metadata0expr_optional_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_optional_6,null);
    metadata0bool_metadata0reduceexpr_bool = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bool,reduceexpr_bool);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0_new_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._new,null);
    metadata0_break_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._break,null);
    metadata0instr_metadata0reduceinstr_star_8_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_star_8_rec);
    metadata0_continue_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._continue,null);
    metadata0expr_star_10_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_10,null);
    metadata0instr_metadata0reduceinstr_star_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_star_3_rec);
    metadata0nulz_metadata0reduceexpr_null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.nulz,reduceexpr_null);
    metadata0eol_metadata0reduceinstr_return = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_return);
    metadata0rpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,null);
    metadata0rpar_metadata0reduceexpr_fun_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_fun_call);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0rpar_metadata0reduceexpr_new_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_new_call);
    metadata0instr_star_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_star_3,null);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0xor_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.xor,null);
    metadata0id_star_1_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_1_sub,null);
    metadata0amp_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.amp,null);
    metadata0end_metadata0reduceexpr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_while);
    metadata0rpar_metadata0reduceexpr_method_call = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_method_call);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0instr_star_8_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_star_8,null);
    metadata0is_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.is,null);
    metadata0number_metadata0reduceexpr_number = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.number,reduceexpr_number);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0dpipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dpipe,null);
    metadata0data_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.data,null);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0colon_metadata0reduceinstr_star_3_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceinstr_star_3_empty);
    metadata0id_metadata0reduceid_star_2_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_rec);
    metadata0integer_metadata0reduceexpr_integer = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.integer,reduceexpr_integer);
    metadata0def_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.def,null);
    metadata0_else_metadata0reduceinstr_star_8_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._else,reduceinstr_star_8_empty);
    metadata0lopt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lopt,null);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0member_star_0_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.member_star_0,null);
    metadata0or_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.or,null);
    metadata0text_metadata0reduceexpr_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reduceexpr_text);
    metadata0expr_star_11_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_11_sub,null);
    metadata0_else_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._else,null);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0null_metadata0reducemember_star_0_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,reducemember_star_0_empty);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0expr_star_11_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_11,null);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0eol_metadata0reduceinstr_print = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceinstr_print);
    metadata0colon_metadata0reduceinstr_star_8_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceinstr_star_8_empty);
    metadata0ropt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ropt,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0end_metadata0reduceexpr_while_else = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceexpr_while_else);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0expr_optional_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_optional_4,null);
    metadata0id_metadata0reduceid_star_1_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_1_rec);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0member_metadata0reducemember_star_0_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.member,reducemember_star_0_rec);
    metadata0id_star_2_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0reducemember_star_0_empty,metadata0script_metadata0null,metadata0__eof___metadata0null,metadata0member_star_0_metadata0null,metadata0data_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0reduceid_star_1_element,metadata0id_star_1_sub_metadata0null,metadata0comma_metadata0null,metadata0id_metadata0reduceid_star_1_rec,metadata0id_star_1_metadata0null,metadata0rpar_metadata0reducedata_member,metadata0use_metadata0null,metadata0id_metadata0reduceuse_member,metadata0def_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0reduceid_star_2_element,metadata0id_star_2_sub_metadata0null,metadata0comma_metadata0null,metadata0id_metadata0reduceid_star_2_rec,metadata0id_star_2_metadata0null,metadata0rpar_metadata0null,metadata0colon_metadata0reduceinstr_star_3_empty,metadata0instr_star_3_metadata0null,metadata0_break_metadata0null,metadata0bool_metadata0reduceexpr_bool,metadata0is_metadata0null,metadata0_new_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0_while_metadata0null,metadata0plus_metadata0null,metadata0integer_metadata0reduceexpr_integer,metadata0text_metadata0reduceexpr_text,metadata0bang_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0number_metadata0reduceexpr_number,metadata0_if_metadata0null,metadata0minus_metadata0null,metadata0nulz_metadata0reduceexpr_null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0is_metadata0null,metadata0id_metadata0reduceexpr_is_instance,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0or_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0pipe_metadata0null,metadata0expr_metadata0null,metadata0xor_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0amp_metadata0null,metadata0expr_metadata0null,metadata0dpipe_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0damp_metadata0null,metadata0expr_metadata0null,metadata0lopt_metadata0null,metadata0expr_metadata0null,metadata0ropt_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_10_metadata0null,metadata0rpar_metadata0reduceexpr_method_call,metadata0expr_metadata0null,metadata0expr_star_10_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0_if_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0colon_metadata0reduceinstr_star_8_empty,metadata0instr_star_8_metadata0null,metadata0_continue_metadata0null,metadata0expr_optional_6_metadata0null,metadata0eol_metadata0reduceinstr_continue,metadata0expr_metadata0null,metadata0_return_metadata0null,metadata0expr_optional_4_metadata0null,metadata0eol_metadata0reduceinstr_return,metadata0expr_metadata0null,metadata0print_metadata0null,metadata0expr_metadata0null,metadata0expr_plus_7_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0eol_metadata0reduceinstr_print,metadata0instr_metadata0reduceinstr_star_8_rec,metadata0expr_metadata0null,metadata0eol_metadata0reduceinstr_expr,metadata0block_metadata0null,metadata0_else_metadata0null,metadata0colon_metadata0reduceinstr_star_8_empty,metadata0block_metadata0null,metadata0end_metadata0reduceexpr_if_else,metadata0end_metadata0reduceexpr_if,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_9_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_star_9_metadata0null,metadata0rpar_metadata0reduceexpr_fun_call,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0colon_metadata0reduceinstr_star_8_empty,metadata0block_metadata0null,metadata0_else_metadata0reduceinstr_star_8_empty,metadata0block_metadata0null,metadata0end_metadata0reduceexpr_while_else,metadata0end_metadata0reduceexpr_while,metadata0expr_star_11_metadata0null,metadata0rpar_metadata0reduceexpr_new_call,metadata0expr_star_11_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_optional_5_metadata0null,metadata0eol_metadata0reduceinstr_break,metadata0expr_metadata0null,metadata0instr_metadata0reduceinstr_star_3_rec,metadata0_const_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0member_metadata0reducemember_star_0_rec};
  }

  
  private int[] expr_optional_4Gotoes;

  private void initexpr_optional_4Gotoes() {
    expr_optional_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,154,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,118,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_optional_6Gotoes;

  private void initexpr_optional_6Gotoes() {
    expr_optional_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,105,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_star_8Gotoes;

  private void initinstr_star_8Gotoes() {
    instr_star_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,103,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,103,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,103,-1,103,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_star_3Gotoes;

  private void initinstr_star_3Gotoes() {
    instr_star_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_optional_5Gotoes;

  private void initexpr_optional_5Gotoes() {
    expr_optional_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_10Gotoes;

  private void initexpr_star_10Gotoes() {
    expr_star_10Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,91,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_11_subGotoes;

  private void initexpr_star_11_subGotoes() {
    expr_star_11_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,146,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_1Gotoes;

  private void initid_star_1Gotoes() {
    id_star_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,119,153,-1,150,-1,-1,149,137,136,-1,-1,135,-1,127,-1,101,100,-1,44,-1,-1,-1,48,-1,50,-1,52,-1,54,-1,56,-1,58,-1,60,-1,62,-1,64,-1,66,-1,68,-1,-1,-1,72,-1,74,-1,76,-1,78,-1,80,-1,82,-1,-1,85,-1,87,-1,89,-1,93,-1,-1,-1,-1,96,-1,98,-1,-1,-1,-1,-1,119,107,-1,-1,-1,111,-1,-1,-1,113,-1,-1,116,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,132,-1,131,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,148,-1,-1,-1,-1,-1,-1,-1,-1,-1,158,-1,-1};
  }
  
  private int[] member_star_0Gotoes;

  private void initmember_star_0Gotoes() {
    member_star_0Gotoes = 
      new int[]{3,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_plus_7Gotoes;

  private void initexpr_plus_7Gotoes() {
    expr_plus_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,114,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] memberGotoes;

  private void initmemberGotoes() {
    memberGotoes = 
      new int[]{-1,-1,-1,159,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9Gotoes;

  private void initexpr_star_9Gotoes() {
    expr_star_9Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,133,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9_subGotoes;

  private void initexpr_star_9_subGotoes() {
    expr_star_9_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,129,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_1_subGotoes;

  private void initid_star_1_subGotoes() {
    id_star_1_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,8,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2_subGotoes;

  private void initid_star_2_subGotoes() {
    id_star_2_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_11Gotoes;

  private void initexpr_star_11Gotoes() {
    expr_star_11Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,144,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2Gotoes;

  private void initid_star_2Gotoes() {
    id_star_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,22,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,121,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,124,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,139,-1,141,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_10_subGotoes;

  private void initexpr_star_10_subGotoes() {
    expr_star_10_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _breakArray;
  @SuppressWarnings("unchecked")
  private void init_breakArray() {
    _breakArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift26,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift26,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift71,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift84,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift157,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceid_star_1_element,shift9,branch0,reduceid_star_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceid_star_2_element,shift20,branch0,reduceid_star_2_rec,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,reduceexpr_star_10_element,shift95,branch0,reduceexpr_star_10_rec,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_plus_7_element,shift115,branch0,reduceexpr_plus_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,shift130,branch0,reduceexpr_star_9_rec,reduceexpr_star_9_element,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,shift147,branch0,reduceexpr_star_11_rec,reduceexpr_star_11_element,reduceexpr_unary_complement,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _continueArray;
  @SuppressWarnings("unchecked")
  private void init_continueArray() {
    _continueArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift104,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift104,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] orArray;
  @SuppressWarnings("unchecked")
  private void initorArray() {
    orArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift49,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift49,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,shift49,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,shift49,reduceexpr_array_access,branch0,shift49,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift49,branch0,branch0,shift49,branch0,shift49,reduceexpr_parens,reduceexpr_unary_minus,shift49,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,shift49,branch0,shift49,branch0,branch0,shift49,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift49,branch0,branch0,branch0,shift49,shift49,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift49,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift49,shift49,reduceexpr_unary_complement,branch0,branch0,shift49,branch0,branch0,branch0,branch0,shift49,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift51,branch0,reduceexpr_is_instance,branch0,shift51,branch0,shift51,branch0,reduceexpr_binary_mul,branch0,shift51,branch0,shift51,branch0,reduceexpr_binary_div,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,reduceexpr_attribute_access,branch0,shift51,branch0,reduceexpr_binary_mod,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,reduceexpr_array_access,branch0,shift51,branch0,shift51,branch0,shift51,branch0,branch0,reduceexpr_method_call,shift51,branch0,branch0,shift51,branch0,shift51,reduceexpr_parens,reduceexpr_unary_minus,shift51,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,shift51,branch0,shift51,branch0,branch0,shift51,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift51,branch0,branch0,branch0,shift51,shift51,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift51,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift51,shift51,reduceexpr_unary_complement,branch0,branch0,shift51,branch0,branch0,branch0,branch0,shift51,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift53,branch0,reduceexpr_is_instance,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift53,branch0,reduceexpr_attribute_access,branch0,shift53,branch0,reduceexpr_binary_mod,branch0,shift53,branch0,shift53,branch0,shift53,branch0,shift53,reduceexpr_array_access,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift53,branch0,branch0,shift53,branch0,shift53,reduceexpr_parens,reduceexpr_unary_minus,shift53,branch0,branch0,branch0,branch0,branch0,shift53,branch0,branch0,branch0,shift53,branch0,shift53,branch0,branch0,shift53,branch0,branch0,shift53,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift53,branch0,branch0,branch0,shift53,shift53,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift53,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift53,shift53,reduceexpr_unary_complement,branch0,branch0,shift53,branch0,branch0,branch0,branch0,shift53,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _newArray;
  @SuppressWarnings("unchecked")
  private void init_newArray() {
    _newArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift29,shift29,branch0,shift29,branch0,branch0,shift29,shift29,shift29,branch0,branch0,shift29,branch0,shift29,branch0,shift29,shift29,branch0,shift29,branch0,branch0,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,branch0,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,branch0,branch0,branch0,shift29,branch0,shift29,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift29,shift29,branch0,reduceinstr_continue,branch0,shift29,branch0,reduceinstr_return,branch0,shift29,branch0,branch0,shift29,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift29,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift29,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift57,branch0,reduceexpr_is_instance,branch0,shift57,branch0,shift57,branch0,reduceexpr_binary_mul,branch0,shift57,branch0,shift57,branch0,reduceexpr_binary_div,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,reduceexpr_attribute_access,branch0,shift57,branch0,reduceexpr_binary_mod,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,reduceexpr_array_access,branch0,shift57,branch0,shift57,branch0,shift57,branch0,branch0,reduceexpr_method_call,shift57,branch0,branch0,shift57,branch0,shift57,reduceexpr_parens,reduceexpr_unary_minus,shift57,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,shift57,branch0,shift57,branch0,branch0,shift57,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift57,branch0,branch0,branch0,shift57,shift57,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift57,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift57,shift57,reduceexpr_unary_complement,branch0,branch0,shift57,branch0,branch0,branch0,branch0,shift57,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] defArray;
  @SuppressWarnings("unchecked")
  private void initdefArray() {
    defArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,reduceconst_member,reducemember_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift59,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift59,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift59,branch0,reduceexpr_attribute_access,branch0,shift59,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,shift59,branch0,shift59,reduceexpr_array_access,branch0,shift59,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift59,branch0,branch0,shift59,branch0,shift59,reduceexpr_parens,reduceexpr_unary_minus,shift59,branch0,branch0,branch0,branch0,branch0,shift59,branch0,branch0,branch0,shift59,branch0,shift59,branch0,branch0,shift59,branch0,branch0,shift59,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift59,branch0,branch0,branch0,shift59,shift59,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift59,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift59,shift59,reduceexpr_unary_complement,branch0,branch0,shift59,branch0,branch0,branch0,branch0,shift59,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift61,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift61,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift61,branch0,reduceexpr_attribute_access,branch0,shift61,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,shift61,branch0,shift61,reduceexpr_array_access,branch0,shift61,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift61,branch0,branch0,shift61,branch0,shift61,reduceexpr_parens,reduceexpr_unary_minus,shift61,branch0,branch0,branch0,branch0,branch0,shift61,branch0,branch0,branch0,shift61,branch0,shift61,branch0,branch0,shift61,branch0,branch0,shift61,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift61,branch0,branch0,branch0,shift61,shift61,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift61,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift61,shift61,reduceexpr_unary_complement,branch0,branch0,shift61,branch0,branch0,branch0,branch0,shift61,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ampArray;
  @SuppressWarnings("unchecked")
  private void initampArray() {
    ampArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift65,branch0,reduceexpr_is_instance,branch0,shift65,branch0,shift65,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,shift65,branch0,shift65,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift65,branch0,reduceexpr_attribute_access,branch0,shift65,branch0,reduceexpr_binary_mod,branch0,shift65,branch0,shift65,branch0,shift65,branch0,shift65,reduceexpr_array_access,branch0,shift65,branch0,shift65,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift65,branch0,branch0,shift65,branch0,shift65,reduceexpr_parens,reduceexpr_unary_minus,shift65,branch0,branch0,branch0,branch0,branch0,shift65,branch0,branch0,branch0,shift65,branch0,shift65,branch0,branch0,shift65,branch0,branch0,shift65,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift65,branch0,branch0,branch0,shift65,shift65,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift65,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift65,shift65,reduceexpr_unary_complement,branch0,branch0,shift65,branch0,branch0,branch0,branch0,shift65,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] roptArray;
  @SuppressWarnings("unchecked")
  private void initroptArray() {
    roptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,shift83,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dpipeArray;
  @SuppressWarnings("unchecked")
  private void initdpipeArray() {
    dpipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift67,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift67,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,shift67,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,shift67,reduceexpr_array_access,branch0,shift67,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift67,branch0,branch0,shift67,branch0,shift67,reduceexpr_parens,reduceexpr_unary_minus,shift67,branch0,branch0,branch0,branch0,branch0,shift67,branch0,branch0,branch0,shift67,branch0,shift67,branch0,branch0,shift67,branch0,branch0,shift67,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift67,branch0,branch0,branch0,shift67,shift67,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift67,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift67,shift67,reduceexpr_unary_complement,branch0,branch0,shift67,branch0,branch0,branch0,branch0,shift67,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dataArray;
  @SuppressWarnings("unchecked")
  private void initdataArray() {
    dataArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,reduceconst_member,reducemember_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift75,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift75,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift75,branch0,reduceexpr_attribute_access,branch0,shift75,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,shift75,branch0,shift75,reduceexpr_array_access,branch0,shift75,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift75,branch0,branch0,shift75,branch0,shift75,reduceexpr_parens,reduceexpr_unary_minus,shift75,branch0,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,shift75,branch0,shift75,branch0,branch0,shift75,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift75,branch0,branch0,branch0,shift75,shift75,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift75,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift75,shift75,reduceexpr_unary_complement,branch0,branch0,shift75,branch0,branch0,branch0,branch0,shift75,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] integerArray;
  @SuppressWarnings("unchecked")
  private void initintegerArray() {
    integerArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift34,shift34,branch0,shift34,branch0,branch0,shift34,shift34,shift34,branch0,branch0,shift34,branch0,shift34,branch0,shift34,shift34,branch0,shift34,branch0,branch0,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,branch0,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,branch0,shift34,branch0,shift34,branch0,shift34,branch0,shift34,branch0,branch0,branch0,branch0,shift34,branch0,shift34,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift34,shift34,branch0,reduceinstr_continue,branch0,shift34,branch0,reduceinstr_return,branch0,shift34,branch0,branch0,shift34,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift34,branch0,shift34,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift34,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift34,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift35,shift35,branch0,shift35,branch0,branch0,shift35,shift35,shift35,branch0,branch0,shift35,branch0,shift35,branch0,shift35,shift35,branch0,shift35,branch0,branch0,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,branch0,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,branch0,branch0,branch0,shift35,branch0,shift35,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift35,shift35,branch0,reduceinstr_continue,branch0,shift35,branch0,reduceinstr_return,branch0,shift35,branch0,branch0,shift35,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift35,branch0,shift35,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift35,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift35,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,shift5,branch0,shift7,branch0,branch0,shift10,branch0,branch0,branch0,shift14,branch0,shift16,branch0,shift18,branch0,branch0,shift21,branch0,branch0,branch0,reduceinstr_star_3_empty,shift37,shift37,branch0,shift37,shift30,branch0,shift37,shift37,shift37,branch0,branch0,shift37,branch0,shift37,branch0,shift37,shift37,branch0,shift37,branch0,shift46,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift70,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,branch0,shift37,branch0,shift37,branch0,shift37,branch0,shift37,branch0,branch0,branch0,branch0,shift37,branch0,shift37,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift37,shift37,branch0,reduceinstr_continue,branch0,shift37,branch0,reduceinstr_return,branch0,shift37,branch0,branch0,shift37,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift37,branch0,shift37,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift37,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,shift156,branch0,shift37,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift40,shift40,reduceexpr_bool,shift40,branch0,branch0,shift40,shift40,shift40,reduceexpr_integer,reduceexpr_text,shift40,reduceexpr_var_access,shift40,reduceexpr_number,shift40,shift40,reduceexpr_null,shift40,branch0,branch0,reduceexpr_is_instance,shift40,reduceexpr_binary_gt,shift40,shift97,shift40,reduceexpr_binary_mul,shift40,reduceexpr_binary_or,shift40,reduceexpr_binary_xor,shift40,reduceexpr_binary_div,shift40,reduceexpr_binary_ne,shift40,reduceexpr_binary_ge,shift40,reduceexpr_binary_add,shift40,reduceexpr_binary_and,shift40,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,shift40,reduceexpr_attribute_assignment,shift40,reduceexpr_binary_mod,shift40,reduceexpr_binary_eq,shift40,reduceexpr_binary_lt,shift40,reduceexpr_binary_band,shift40,branch0,reduceexpr_array_access,shift40,reduceexpr_array_assignment,shift40,reduceexpr_binary_le,shift40,reduceexpr_binary_sub,shift40,branch0,reduceexpr_method_call,branch0,branch0,shift40,branch0,shift40,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,reduceinstr_star_8_empty,shift40,shift40,branch0,reduceinstr_continue,branch0,shift40,branch0,reduceinstr_return,branch0,shift40,branch0,branch0,shift40,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,shift40,branch0,shift40,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,shift40,branch0,branch0,reduceexpr_unary_complement,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift40,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] loptArray;
  @SuppressWarnings("unchecked")
  private void initloptArray() {
    loptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift81,branch0,reduceexpr_is_instance,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,reduceexpr_attribute_access,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,reduceexpr_array_access,branch0,shift81,branch0,shift81,branch0,shift81,branch0,branch0,reduceexpr_method_call,shift81,branch0,branch0,shift81,branch0,shift81,reduceexpr_parens,shift81,shift81,branch0,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,shift81,branch0,shift81,branch0,branch0,shift81,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift81,branch0,branch0,branch0,shift81,shift81,branch0,reduceexpr_fun_call,shift81,shift81,shift81,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift81,shift81,shift81,branch0,branch0,shift81,branch0,branch0,branch0,branch0,shift81,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_optional_5_empty,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,reduceexpr_optional_6_empty,shift106,branch0,reduceexpr_optional_6_expr,reduceexpr_optional_4_empty,shift110,branch0,reduceexpr_optional_4_expr,branch0,reduceexpr_plus_7_element,shift117,branch0,reduceexpr_plus_7_rec,branch0,branch0,shift120,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,shift152,branch0,reduceexpr_optional_5_expr,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] nulzArray;
  @SuppressWarnings("unchecked")
  private void initnulzArray() {
    nulzArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift42,shift42,branch0,shift42,branch0,branch0,shift42,shift42,shift42,branch0,branch0,shift42,branch0,shift42,branch0,shift42,shift42,branch0,shift42,branch0,branch0,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,branch0,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,branch0,branch0,branch0,shift42,branch0,shift42,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift42,shift42,branch0,reduceinstr_continue,branch0,shift42,branch0,reduceinstr_return,branch0,shift42,branch0,branch0,shift42,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift42,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift42,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _constArray;
  @SuppressWarnings("unchecked")
  private void init_constArray() {
    _constArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,branch0,branch0,shift155,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,reduceconst_member,reducemember_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] boolArray;
  @SuppressWarnings("unchecked")
  private void initboolArray() {
    boolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift27,shift27,branch0,shift27,branch0,branch0,shift27,shift27,shift27,branch0,branch0,shift27,branch0,shift27,branch0,shift27,shift27,branch0,shift27,branch0,branch0,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,branch0,branch0,shift27,branch0,shift27,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift27,shift27,branch0,reduceinstr_continue,branch0,shift27,branch0,reduceinstr_return,branch0,shift27,branch0,branch0,shift27,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift27,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift27,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] isArray;
  @SuppressWarnings("unchecked")
  private void initisArray() {
    isArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift28,shift28,reduceexpr_bool,shift28,branch0,branch0,shift28,shift28,shift28,reduceexpr_integer,reduceexpr_text,shift28,reduceexpr_var_access,shift28,reduceexpr_number,shift28,shift28,reduceexpr_null,shift28,shift45,branch0,reduceexpr_is_instance,shift28,reduceexpr_binary_gt,shift28,shift45,shift28,reduceexpr_binary_mul,shift28,reduceexpr_binary_or,shift28,reduceexpr_binary_xor,shift28,reduceexpr_binary_div,shift28,reduceexpr_binary_ne,shift28,reduceexpr_binary_ge,shift28,reduceexpr_binary_add,shift28,reduceexpr_binary_and,shift28,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,shift28,shift45,shift28,reduceexpr_binary_mod,shift28,reduceexpr_binary_eq,shift28,reduceexpr_binary_lt,shift28,reduceexpr_binary_band,shift28,shift45,reduceexpr_array_access,shift28,shift45,shift28,reduceexpr_binary_le,shift28,reduceexpr_binary_sub,shift28,branch0,reduceexpr_method_call,shift45,branch0,shift28,shift45,shift28,shift45,reduceexpr_parens,reduceexpr_unary_minus,shift45,reduceinstr_star_8_empty,shift28,shift28,branch0,reduceinstr_continue,shift45,shift28,branch0,reduceinstr_return,shift45,shift28,shift45,branch0,shift28,shift45,reduceinstr_print,reduceinstr_star_8_rec,shift45,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_if_else,reduceexpr_if,shift45,shift28,branch0,shift28,shift45,shift45,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift45,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,shift28,shift45,shift45,reduceexpr_unary_complement,branch0,reduceinstr_break,shift45,reduceinstr_star_3_rec,branch0,branch0,shift28,shift45,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift47,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift47,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift47,branch0,reduceexpr_attribute_access,branch0,shift47,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,shift47,branch0,shift47,reduceexpr_array_access,branch0,shift47,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift47,branch0,branch0,shift47,branch0,shift47,reduceexpr_parens,reduceexpr_unary_minus,shift47,branch0,branch0,branch0,branch0,branch0,shift47,branch0,branch0,branch0,shift47,branch0,shift47,branch0,branch0,shift47,branch0,branch0,shift47,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift47,branch0,branch0,branch0,shift47,shift47,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift47,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift47,shift47,reduceexpr_unary_complement,branch0,branch0,shift47,branch0,branch0,branch0,branch0,shift47,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] xorArray;
  @SuppressWarnings("unchecked")
  private void initxorArray() {
    xorArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift55,branch0,reduceexpr_is_instance,branch0,shift55,branch0,shift55,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,shift55,branch0,shift55,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift55,branch0,reduceexpr_attribute_access,branch0,shift55,branch0,reduceexpr_binary_mod,branch0,shift55,branch0,shift55,branch0,shift55,branch0,shift55,reduceexpr_array_access,branch0,shift55,branch0,shift55,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift55,branch0,branch0,shift55,branch0,shift55,reduceexpr_parens,reduceexpr_unary_minus,shift55,branch0,branch0,branch0,branch0,branch0,shift55,branch0,branch0,branch0,shift55,branch0,shift55,branch0,branch0,shift55,branch0,branch0,shift55,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift55,branch0,branch0,branch0,shift55,shift55,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift55,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift55,shift55,reduceexpr_unary_complement,branch0,branch0,shift55,branch0,branch0,branch0,branch0,shift55,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _elseArray;
  @SuppressWarnings("unchecked")
  private void init_elseArray() {
    _elseArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,reduceblock,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,shift122,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift140,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift24,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,shift102,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift123,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift138,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift32,shift32,branch0,shift32,branch0,branch0,shift32,shift32,shift32,branch0,branch0,shift32,branch0,shift32,branch0,shift32,shift32,branch0,shift32,branch0,branch0,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,branch0,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,branch0,shift32,branch0,shift32,branch0,shift32,branch0,shift32,branch0,branch0,branch0,branch0,shift32,branch0,shift32,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift32,shift32,branch0,reduceinstr_continue,branch0,shift32,branch0,reduceinstr_return,branch0,shift32,branch0,branch0,shift32,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift32,branch0,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift32,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift32,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] endArray;
  @SuppressWarnings("unchecked")
  private void initendArray() {
    endArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,reduceblock,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,shift126,branch0,reduceinstr_star_8_empty,shift125,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift143,reduceinstr_star_8_empty,shift142,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift33,shift33,reduceexpr_bool,shift33,branch0,branch0,shift33,shift33,shift33,reduceexpr_integer,reduceexpr_text,shift33,reduceexpr_var_access,shift33,reduceexpr_number,shift33,shift33,reduceexpr_null,shift33,shift63,branch0,reduceexpr_is_instance,shift33,shift63,shift33,shift63,shift33,reduceexpr_binary_mul,shift33,reduceexpr_binary_or,shift33,reduceexpr_binary_xor,shift33,reduceexpr_binary_div,shift33,shift63,shift33,shift63,shift33,reduceexpr_binary_add,shift33,reduceexpr_binary_and,shift33,shift63,branch0,reduceexpr_attribute_access,shift33,shift63,shift33,reduceexpr_binary_mod,shift33,shift63,shift33,shift63,shift33,shift63,shift33,shift63,reduceexpr_array_access,shift33,shift63,shift33,shift63,shift33,reduceexpr_binary_sub,shift33,branch0,reduceexpr_method_call,shift63,branch0,shift33,shift63,shift33,shift63,reduceexpr_parens,reduceexpr_unary_minus,shift63,reduceinstr_star_8_empty,shift33,shift33,branch0,reduceinstr_continue,shift63,shift33,branch0,reduceinstr_return,shift63,shift33,shift63,branch0,shift33,shift63,reduceinstr_print,reduceinstr_star_8_rec,shift63,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_if_else,reduceexpr_if,shift63,shift33,branch0,shift33,shift63,shift63,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift63,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,shift33,shift63,shift63,reduceexpr_unary_complement,branch0,reduceinstr_break,shift63,reduceinstr_star_3_rec,branch0,branch0,shift33,shift63,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift108,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift108,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,accept,accept,reducescript,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,reduceconst_member,reducemember_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift69,branch0,reduceexpr_is_instance,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,reduceexpr_attribute_access,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,branch0,shift69,reduceexpr_array_access,branch0,shift69,branch0,shift69,branch0,shift69,branch0,branch0,reduceexpr_method_call,shift69,branch0,branch0,shift69,branch0,shift69,reduceexpr_parens,shift69,shift69,branch0,branch0,branch0,branch0,branch0,shift69,branch0,branch0,branch0,shift69,branch0,shift69,branch0,branch0,shift69,branch0,branch0,shift69,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift69,branch0,branch0,branch0,shift69,shift69,branch0,reduceexpr_fun_call,shift69,shift69,shift69,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift69,shift69,shift69,branch0,branch0,shift69,branch0,branch0,branch0,branch0,shift69,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift73,branch0,reduceexpr_is_instance,branch0,shift73,branch0,shift73,branch0,reduceexpr_binary_mul,branch0,shift73,branch0,shift73,branch0,reduceexpr_binary_div,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,branch0,reduceexpr_attribute_access,branch0,shift73,branch0,reduceexpr_binary_mod,branch0,shift73,branch0,shift73,branch0,shift73,branch0,shift73,reduceexpr_array_access,branch0,shift73,branch0,shift73,branch0,shift73,branch0,branch0,reduceexpr_method_call,shift73,branch0,branch0,shift73,branch0,shift73,reduceexpr_parens,reduceexpr_unary_minus,shift73,branch0,branch0,branch0,branch0,branch0,shift73,branch0,branch0,branch0,shift73,branch0,shift73,branch0,branch0,shift73,branch0,branch0,shift73,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift73,branch0,branch0,branch0,shift73,shift73,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift73,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift73,shift73,reduceexpr_unary_complement,branch0,branch0,shift73,branch0,branch0,branch0,branch0,shift73,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] useArray;
  @SuppressWarnings("unchecked")
  private void inituseArray() {
    useArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedata_member,branch0,reduceuse_member,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,reducefun_member,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,branch0,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,branch0,branch0,branch0,branch0,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,branch0,branch0,reduceexpr_unary_complement,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,reduceconst_member,reducemember_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift77,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift77,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift77,branch0,reduceexpr_attribute_access,branch0,shift77,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,shift77,branch0,shift77,reduceexpr_array_access,branch0,shift77,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift77,branch0,branch0,shift77,branch0,shift77,reduceexpr_parens,reduceexpr_unary_minus,shift77,branch0,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,shift77,branch0,shift77,branch0,branch0,shift77,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift77,branch0,branch0,branch0,shift77,shift77,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift77,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift77,shift77,reduceexpr_unary_complement,branch0,branch0,shift77,branch0,branch0,branch0,branch0,shift77,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift36,shift36,branch0,shift36,branch0,branch0,shift36,shift36,shift36,branch0,branch0,shift36,branch0,shift36,branch0,shift36,shift36,branch0,shift36,branch0,branch0,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,branch0,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,branch0,shift36,branch0,shift36,branch0,shift36,branch0,shift36,branch0,branch0,branch0,branch0,shift36,branch0,shift36,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift36,shift36,branch0,reduceinstr_continue,branch0,shift36,branch0,reduceinstr_return,branch0,shift36,branch0,branch0,shift36,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift36,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift36,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dampArray;
  @SuppressWarnings("unchecked")
  private void initdampArray() {
    dampArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift79,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift79,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,shift79,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,shift79,reduceexpr_array_access,branch0,shift79,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift79,branch0,branch0,shift79,branch0,shift79,reduceexpr_parens,reduceexpr_unary_minus,shift79,branch0,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,shift79,branch0,shift79,branch0,branch0,shift79,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift79,branch0,branch0,branch0,shift79,shift79,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift79,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift79,shift79,reduceexpr_unary_complement,branch0,branch0,shift79,branch0,branch0,branch0,branch0,shift79,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] numberArray;
  @SuppressWarnings("unchecked")
  private void initnumberArray() {
    numberArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift39,shift39,branch0,shift39,branch0,branch0,shift39,shift39,shift39,branch0,branch0,shift39,branch0,shift39,branch0,shift39,shift39,branch0,shift39,branch0,branch0,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,branch0,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,branch0,shift39,branch0,shift39,branch0,shift39,branch0,shift39,branch0,branch0,branch0,branch0,shift39,branch0,shift39,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift39,shift39,branch0,reduceinstr_continue,branch0,shift39,branch0,reduceinstr_return,branch0,shift39,branch0,branch0,shift39,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift39,branch0,shift39,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift39,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift39,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift86,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,shift86,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,shift86,branch0,reduceexpr_attribute_access,branch0,shift86,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,shift86,branch0,shift86,reduceexpr_array_access,branch0,shift86,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,branch0,branch0,reduceexpr_method_call,shift86,branch0,branch0,shift86,branch0,shift86,reduceexpr_parens,reduceexpr_unary_minus,shift86,branch0,branch0,branch0,branch0,branch0,shift86,branch0,branch0,branch0,shift86,branch0,shift86,branch0,branch0,shift86,branch0,branch0,shift86,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,shift86,branch0,branch0,branch0,shift86,shift86,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift86,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,branch0,shift86,shift86,reduceexpr_unary_complement,branch0,branch0,shift86,branch0,branch0,branch0,branch0,shift86,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift41,shift41,reduceexpr_bool,shift41,branch0,branch0,shift41,shift41,shift41,reduceexpr_integer,reduceexpr_text,shift41,reduceexpr_var_access,shift41,reduceexpr_number,shift41,shift41,reduceexpr_null,shift41,shift88,branch0,reduceexpr_is_instance,shift41,shift88,shift41,shift88,shift41,reduceexpr_binary_mul,shift41,reduceexpr_binary_or,shift41,reduceexpr_binary_xor,shift41,reduceexpr_binary_div,shift41,shift88,shift41,shift88,shift41,reduceexpr_binary_add,shift41,reduceexpr_binary_and,shift41,shift88,branch0,reduceexpr_attribute_access,shift41,shift88,shift41,reduceexpr_binary_mod,shift41,shift88,shift41,shift88,shift41,shift88,shift41,shift88,reduceexpr_array_access,shift41,shift88,shift41,shift88,shift41,reduceexpr_binary_sub,shift41,branch0,reduceexpr_method_call,shift88,branch0,shift41,shift88,shift41,shift88,reduceexpr_parens,reduceexpr_unary_minus,shift88,reduceinstr_star_8_empty,shift41,shift41,branch0,reduceinstr_continue,shift88,shift41,branch0,reduceinstr_return,shift88,shift41,shift88,branch0,shift41,shift88,reduceinstr_print,reduceinstr_star_8_rec,shift88,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_if_else,reduceexpr_if,shift88,shift41,branch0,shift41,shift88,shift88,branch0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,shift88,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,reduceexpr_while_else,reduceexpr_while,branch0,reduceexpr_new_call,branch0,shift41,shift88,shift88,reduceexpr_unary_complement,branch0,reduceinstr_break,shift88,reduceinstr_star_3_rec,branch0,branch0,shift41,shift88,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] printArray;
  @SuppressWarnings("unchecked")
  private void initprintArray() {
    printArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift112,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift112,branch0,branch0,reduceinstr_continue,branch0,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceid_star_1_empty,reduceid_star_1_element,reduceid_star_1_through,branch0,reduceid_star_1_rec,shift12,branch0,branch0,branch0,branch0,branch0,reduceid_star_2_empty,reduceid_star_2_element,reduceid_star_2_through,branch0,reduceid_star_2_rec,shift23,branch0,branch0,branch0,branch0,reduceexpr_bool,branch0,branch0,branch0,reduceexpr_star_11_empty,branch0,branch0,reduceexpr_integer,reduceexpr_text,branch0,reduceexpr_var_access,branch0,reduceexpr_number,branch0,branch0,reduceexpr_null,branch0,shift99,branch0,reduceexpr_is_instance,branch0,reduceexpr_binary_gt,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_or,branch0,reduceexpr_binary_xor,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_and,branch0,reduceexpr_binary_bor,branch0,reduceexpr_attribute_access,branch0,reduceexpr_attribute_assignment,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_band,branch0,branch0,reduceexpr_array_access,branch0,reduceexpr_array_assignment,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_sub,reduceexpr_star_10_empty,shift92,reduceexpr_method_call,reduceexpr_star_10_element,reduceexpr_star_10_through,branch0,reduceexpr_star_10_rec,branch0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,reduceexpr_star_9_empty,reduceexpr_star_9_through,branch0,reduceexpr_star_9_rec,reduceexpr_star_9_element,shift134,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_while_else,reduceexpr_while,shift145,reduceexpr_new_call,reduceexpr_star_11_through,branch0,reduceexpr_star_11_rec,reduceexpr_star_11_element,reduceexpr_unary_complement,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift17,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_3_empty,shift43,shift43,branch0,shift43,branch0,shift31,shift43,shift43,shift43,branch0,branch0,shift43,shift128,shift43,branch0,shift43,shift43,branch0,shift43,branch0,branch0,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,branch0,shift90,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,branch0,shift43,branch0,shift43,branch0,shift43,branch0,shift43,branch0,branch0,branch0,branch0,shift43,branch0,shift43,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,shift43,shift43,branch0,reduceinstr_continue,branch0,shift43,branch0,reduceinstr_return,branch0,shift43,branch0,branch0,shift43,branch0,reduceinstr_print,reduceinstr_star_8_rec,branch0,reduceinstr_expr,branch0,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,shift43,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_8_empty,branch0,reduceinstr_star_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,reduceinstr_break,branch0,reduceinstr_star_3_rec,branch0,branch0,shift43,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducemember_star_0_empty,exit,exit,reducescript,error0,error0,error0,error0,error0,error0,error0,error0,reducedata_member,error0,reduceuse_member,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr_star_3_empty,reducefun_member,error0,reduceexpr_bool,error0,error0,error0,error0,error0,error0,reduceexpr_integer,reduceexpr_text,error0,reduceexpr_var_access,error0,reduceexpr_number,error0,error0,reduceexpr_null,error0,error0,error0,reduceexpr_is_instance,error0,reduceexpr_binary_gt,error0,error0,error0,reduceexpr_binary_mul,error0,reduceexpr_binary_or,error0,reduceexpr_binary_xor,error0,reduceexpr_binary_div,error0,reduceexpr_binary_ne,error0,reduceexpr_binary_ge,error0,reduceexpr_binary_add,error0,reduceexpr_binary_and,error0,reduceexpr_binary_bor,error0,reduceexpr_attribute_access,error0,reduceexpr_attribute_assignment,error0,reduceexpr_binary_mod,error0,reduceexpr_binary_eq,error0,reduceexpr_binary_lt,error0,reduceexpr_binary_band,error0,error0,reduceexpr_array_access,error0,reduceexpr_array_assignment,error0,reduceexpr_binary_le,error0,reduceexpr_binary_sub,error0,error0,reduceexpr_method_call,error0,error0,error0,error0,error0,reduceexpr_orif,reduceexpr_parens,reduceexpr_unary_minus,error0,error0,error0,error0,error0,reduceinstr_continue,error0,error0,error0,reduceinstr_return,error0,error0,error0,error0,error0,error0,reduceinstr_print,error0,error0,reduceinstr_expr,error0,error0,error0,error0,reduceexpr_if_else,reduceexpr_if,reduceexpr_var_assignment,error0,error0,error0,error0,error0,error0,reduceexpr_fun_call,reduceexpr_unary_not,reduceexpr_unary_plus,error0,error0,error0,error0,error0,reduceexpr_while_else,reduceexpr_while,error0,reduceexpr_new_call,error0,error0,error0,error0,reduceexpr_unary_complement,error0,reduceinstr_break,error0,reduceinstr_star_3_rec,error0,error0,error0,reduceconst_member,reducemember_star_0_rec};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceconst_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_array_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_3_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_break;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_minus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_bor;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemember_star_0_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_number;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefun_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_4_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_5_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceuse_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedata_member;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_11_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_complement;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_new_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while_else;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_fun_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_8_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_or;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_plus_7_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_plus_7_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_11_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_11_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_band;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_and;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_orif;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_null;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemember_star_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_array_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_8_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_method_call;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_is_instance;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_4_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_attribute_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_optional_6_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_attribute_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_continue;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_10_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_print;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_integer;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_xor;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_11_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if_else;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_bool;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift53;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift67;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift156;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift130;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift79;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift83;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift106;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift32;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift81;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift47;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift34;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift26;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift143;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift115;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift155;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift117;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift92;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift42;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift134;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift147;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift49;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift88;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift95;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift59;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift145;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift86;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift40;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift84;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift55;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift122;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift71;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift39;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift65;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift24;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift75;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift110;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift140;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift69;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift90;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift126;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift108;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift120;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift128;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift102;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift73;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift123;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift41;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift77;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift63;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift51;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift112;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift97;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift152;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift36;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift99;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift125;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift61;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift104;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift57;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift142;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift138;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift157;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift70;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_is_instance;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reducedata_member;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_plus_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_10_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceuse_member;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_if_else;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0damp_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_const_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_expr;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_continue;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0print_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_1_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_break;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_optional_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0use_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_optional_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bool_metadata0reduceexpr_bool;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_new_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_break_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_star_8_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_continue_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_10_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_star_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0nulz_metadata0reduceexpr_null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_return;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_fun_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_new_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_star_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0xor_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_1_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0amp_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_method_call;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_star_8_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0is_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0number_metadata0reduceexpr_number;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dpipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0data_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceinstr_star_3_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0integer_metadata0reduceexpr_integer;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0def_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_else_metadata0reduceinstr_star_8_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lopt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0member_star_0_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0or_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reduceexpr_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_11_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_else_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0reducemember_star_0_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_11_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceinstr_print;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceinstr_star_8_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ropt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceexpr_while_else;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_optional_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_1_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0member_metadata0reducemember_star_0_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_metadata0null;
}
