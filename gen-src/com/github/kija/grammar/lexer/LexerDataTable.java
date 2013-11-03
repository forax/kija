package com.github.kija.grammar.lexer;

import com.github.kija.grammar.lexer.RuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.rules.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;
/** 
 *  This class is generated - please do not edit it 
 */
public class LexerDataTable {

  public static LexerTable<RuleEnum> createTable() {
    return new LexerDataTable().table;
  }

  private LexerDataTable() {
    initplusMainAccepts();
    initplusMainTransitions();
    CharRegexTable plusMain = new CharRegexTable(1, plusMainTransitions, plusMainAccepts);
    RuleData plus = new RuleData(plusMain, null, 0, false);
    initminusMainAccepts();
    initminusMainTransitions();
    CharRegexTable minusMain = new CharRegexTable(1, minusMainTransitions, minusMainAccepts);
    RuleData minus = new RuleData(minusMain, null, 1, false);
    initstarMainAccepts();
    initstarMainTransitions();
    CharRegexTable starMain = new CharRegexTable(1, starMainTransitions, starMainAccepts);
    RuleData star = new RuleData(starMain, null, 2, false);
    initslashMainAccepts();
    initslashMainTransitions();
    CharRegexTable slashMain = new CharRegexTable(1, slashMainTransitions, slashMainAccepts);
    RuleData slash = new RuleData(slashMain, null, 3, false);
    initmodMainAccepts();
    initmodMainTransitions();
    CharRegexTable modMain = new CharRegexTable(1, modMainTransitions, modMainAccepts);
    RuleData mod = new RuleData(modMain, null, 4, false);
    initassignMainAccepts();
    initassignMainTransitions();
    CharRegexTable assignMain = new CharRegexTable(1, assignMainTransitions, assignMainAccepts);
    RuleData assign = new RuleData(assignMain, null, 5, false);
    initeqMainAccepts();
    initeqMainTransitions();
    CharRegexTable eqMain = new CharRegexTable(2, eqMainTransitions, eqMainAccepts);
    RuleData eq = new RuleData(eqMain, null, 6, false);
    initneMainAccepts();
    initneMainTransitions();
    CharRegexTable neMain = new CharRegexTable(2, neMainTransitions, neMainAccepts);
    RuleData ne = new RuleData(neMain, null, 7, false);
    initltMainAccepts();
    initltMainTransitions();
    CharRegexTable ltMain = new CharRegexTable(1, ltMainTransitions, ltMainAccepts);
    RuleData lt = new RuleData(ltMain, null, 8, false);
    initleMainAccepts();
    initleMainTransitions();
    CharRegexTable leMain = new CharRegexTable(2, leMainTransitions, leMainAccepts);
    RuleData le = new RuleData(leMain, null, 9, false);
    initgtMainAccepts();
    initgtMainTransitions();
    CharRegexTable gtMain = new CharRegexTable(1, gtMainTransitions, gtMainAccepts);
    RuleData gt = new RuleData(gtMain, null, 10, false);
    initgeMainAccepts();
    initgeMainTransitions();
    CharRegexTable geMain = new CharRegexTable(2, geMainTransitions, geMainAccepts);
    RuleData ge = new RuleData(geMain, null, 11, false);
    initdotMainAccepts();
    initdotMainTransitions();
    CharRegexTable dotMain = new CharRegexTable(1, dotMainTransitions, dotMainAccepts);
    RuleData dot = new RuleData(dotMain, null, 12, false);
    initbangMainAccepts();
    initbangMainTransitions();
    CharRegexTable bangMain = new CharRegexTable(1, bangMainTransitions, bangMainAccepts);
    RuleData bang = new RuleData(bangMain, null, 13, false);
    initpipeMainAccepts();
    initpipeMainTransitions();
    CharRegexTable pipeMain = new CharRegexTable(1, pipeMainTransitions, pipeMainAccepts);
    RuleData pipe = new RuleData(pipeMain, null, 14, false);
    initampMainAccepts();
    initampMainTransitions();
    CharRegexTable ampMain = new CharRegexTable(1, ampMainTransitions, ampMainAccepts);
    RuleData amp = new RuleData(ampMain, null, 15, false);
    initxorMainAccepts();
    initxorMainTransitions();
    CharRegexTable xorMain = new CharRegexTable(1, xorMainTransitions, xorMainAccepts);
    RuleData xor = new RuleData(xorMain, null, 16, false);
    initdpipeMainAccepts();
    initdpipeMainTransitions();
    CharRegexTable dpipeMain = new CharRegexTable(1, dpipeMainTransitions, dpipeMainAccepts);
    RuleData dpipe = new RuleData(dpipeMain, null, 17, false);
    initdampMainAccepts();
    initdampMainTransitions();
    CharRegexTable dampMain = new CharRegexTable(1, dampMainTransitions, dampMainAccepts);
    RuleData damp = new RuleData(dampMain, null, 18, false);
    initatMainAccepts();
    initatMainTransitions();
    CharRegexTable atMain = new CharRegexTable(1, atMainTransitions, atMainAccepts);
    RuleData at = new RuleData(atMain, null, 19, false);
    initisMainAccepts();
    initisMainTransitions();
    CharRegexTable isMain = new CharRegexTable(1, isMainTransitions, isMainAccepts);
    RuleData is = new RuleData(isMain, null, 20, false);
    initcolonMainAccepts();
    initcolonMainTransitions();
    CharRegexTable colonMain = new CharRegexTable(1, colonMainTransitions, colonMainAccepts);
    RuleData colon = new RuleData(colonMain, null, 21, false);
    initcommaMainAccepts();
    initcommaMainTransitions();
    CharRegexTable commaMain = new CharRegexTable(1, commaMainTransitions, commaMainAccepts);
    RuleData comma = new RuleData(commaMain, null, 22, false);
    initeolMainAccepts();
    initeolMainTransitions();
    CharRegexTable eolMain = new CharRegexTable(1, eolMainTransitions, eolMainAccepts);
    RuleData eol = new RuleData(eolMain, null, 23, false);
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 24, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(1, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 25, false);
    initlcurlMainAccepts();
    initlcurlMainTransitions();
    CharRegexTable lcurlMain = new CharRegexTable(1, lcurlMainTransitions, lcurlMainAccepts);
    RuleData lcurl = new RuleData(lcurlMain, null, 26, false);
    initrcurlMainAccepts();
    initrcurlMainTransitions();
    CharRegexTable rcurlMain = new CharRegexTable(1, rcurlMainTransitions, rcurlMainAccepts);
    RuleData rcurl = new RuleData(rcurlMain, null, 27, false);
    initloptMainAccepts();
    initloptMainTransitions();
    CharRegexTable loptMain = new CharRegexTable(1, loptMainTransitions, loptMainAccepts);
    RuleData lopt = new RuleData(loptMain, null, 28, false);
    initroptMainAccepts();
    initroptMainTransitions();
    CharRegexTable roptMain = new CharRegexTable(1, roptMainTransitions, roptMainAccepts);
    RuleData ropt = new RuleData(roptMain, null, 29, false);
    inituseMainAccepts();
    inituseMainTransitions();
    CharRegexTable useMain = new CharRegexTable(1, useMainTransitions, useMainAccepts);
    RuleData use = new RuleData(useMain, null, 30, false);
    initdataMainAccepts();
    initdataMainTransitions();
    CharRegexTable dataMain = new CharRegexTable(3, dataMainTransitions, dataMainAccepts);
    RuleData data = new RuleData(dataMain, null, 31, false);
    initdefMainAccepts();
    initdefMainTransitions();
    CharRegexTable defMain = new CharRegexTable(3, defMainTransitions, defMainAccepts);
    RuleData def = new RuleData(defMain, null, 32, false);
    init_constMainAccepts();
    init_constMainTransitions();
    CharRegexTable _constMain = new CharRegexTable(4, _constMainTransitions, _constMainAccepts);
    RuleData _const = new RuleData(_constMain, null, 33, false);
    initendMainAccepts();
    initendMainTransitions();
    CharRegexTable endMain = new CharRegexTable(2, endMainTransitions, endMainAccepts);
    RuleData end = new RuleData(endMain, null, 34, false);
    init_newMainAccepts();
    init_newMainTransitions();
    CharRegexTable _newMain = new CharRegexTable(2, _newMainTransitions, _newMainAccepts);
    RuleData _new = new RuleData(_newMain, null, 35, false);
    init_ifMainAccepts();
    init_ifMainTransitions();
    CharRegexTable _ifMain = new CharRegexTable(2, _ifMainTransitions, _ifMainAccepts);
    RuleData _if = new RuleData(_ifMain, null, 36, false);
    init_elseMainAccepts();
    init_elseMainTransitions();
    CharRegexTable _elseMain = new CharRegexTable(3, _elseMainTransitions, _elseMainAccepts);
    RuleData _else = new RuleData(_elseMain, null, 37, false);
    initorMainAccepts();
    initorMainTransitions();
    CharRegexTable orMain = new CharRegexTable(1, orMainTransitions, orMainAccepts);
    RuleData or = new RuleData(orMain, null, 38, false);
    initprintMainAccepts();
    initprintMainTransitions();
    CharRegexTable printMain = new CharRegexTable(5, printMainTransitions, printMainAccepts);
    RuleData print = new RuleData(printMain, null, 39, false);
    init_whileMainAccepts();
    init_whileMainTransitions();
    CharRegexTable _whileMain = new CharRegexTable(1, _whileMainTransitions, _whileMainAccepts);
    RuleData _while = new RuleData(_whileMain, null, 40, false);
    init_returnMainAccepts();
    init_returnMainTransitions();
    CharRegexTable _returnMain = new CharRegexTable(5, _returnMainTransitions, _returnMainAccepts);
    RuleData _return = new RuleData(_returnMain, null, 41, false);
    init_breakMainAccepts();
    init_breakMainTransitions();
    CharRegexTable _breakMain = new CharRegexTable(1, _breakMainTransitions, _breakMainAccepts);
    RuleData _break = new RuleData(_breakMain, null, 42, false);
    init_continueMainAccepts();
    init_continueMainTransitions();
    CharRegexTable _continueMain = new CharRegexTable(7, _continueMainTransitions, _continueMainAccepts);
    RuleData _continue = new RuleData(_continueMain, null, 43, false);
    initfailMainAccepts();
    initfailMainTransitions();
    CharRegexTable failMain = new CharRegexTable(1, failMainTransitions, failMainAccepts);
    RuleData fail = new RuleData(failMain, null, 44, false);
    initnulzMainAccepts();
    initnulzMainTransitions();
    CharRegexTable nulzMain = new CharRegexTable(1, nulzMainTransitions, nulzMainAccepts);
    RuleData nulz = new RuleData(nulzMain, null, 45, false);
    initboolMainAccepts();
    initboolMainTransitions();
    CharRegexTable boolMain = new CharRegexTable(1, boolMainTransitions, boolMainAccepts);
    RuleData bool = new RuleData(boolMain, null, 46, false);
    initidMainAccepts();
    initidMainTransitions();
    CharRegexTable idMain = new CharRegexTable(3, idMainTransitions, idMainAccepts);
    RuleData id = new RuleData(idMain, null, 47, false);
    inittextMainAccepts();
    inittextMainTransitions();
    CharRegexTable textMain = new CharRegexTable(1, textMainTransitions, textMainAccepts);
    RuleData text = new RuleData(textMain, null, 48, false);
    initintegerMainAccepts();
    initintegerMainTransitions();
    CharRegexTable integerMain = new CharRegexTable(1, integerMainTransitions, integerMainAccepts);
    RuleData integer = new RuleData(integerMain, null, 49, false);
    initnumberMainAccepts();
    initnumberMainTransitions();
    CharRegexTable numberMain = new CharRegexTable(1, numberMainTransitions, numberMainAccepts);
    RuleData number = new RuleData(numberMain, null, 50, false);
    initspaceMainAccepts();
    initspaceMainTransitions();
    CharRegexTable spaceMain = new CharRegexTable(1, spaceMainTransitions, spaceMainAccepts);
    RuleData space = new RuleData(spaceMain, null, 51, false);
    initcommentMainAccepts();
    initcommentMainTransitions();
    CharRegexTable commentMain = new CharRegexTable(2, commentMainTransitions, commentMainAccepts);
    RuleData comment = new RuleData(commentMain, null, 52, false);

    EnumMap<RuleEnum,RuleData> datas = new EnumMap<RuleEnum,RuleData>(RuleEnum.class);
    datas.put(RuleEnum.plus, plus);
    datas.put(RuleEnum.minus, minus);
    datas.put(RuleEnum.star, star);
    datas.put(RuleEnum.slash, slash);
    datas.put(RuleEnum.mod, mod);
    datas.put(RuleEnum.assign, assign);
    datas.put(RuleEnum.eq, eq);
    datas.put(RuleEnum.ne, ne);
    datas.put(RuleEnum.lt, lt);
    datas.put(RuleEnum.le, le);
    datas.put(RuleEnum.gt, gt);
    datas.put(RuleEnum.ge, ge);
    datas.put(RuleEnum.dot, dot);
    datas.put(RuleEnum.bang, bang);
    datas.put(RuleEnum.pipe, pipe);
    datas.put(RuleEnum.amp, amp);
    datas.put(RuleEnum.xor, xor);
    datas.put(RuleEnum.dpipe, dpipe);
    datas.put(RuleEnum.damp, damp);
    datas.put(RuleEnum.at, at);
    datas.put(RuleEnum.is, is);
    datas.put(RuleEnum.colon, colon);
    datas.put(RuleEnum.comma, comma);
    datas.put(RuleEnum.eol, eol);
    datas.put(RuleEnum.lpar, lpar);
    datas.put(RuleEnum.rpar, rpar);
    datas.put(RuleEnum.lcurl, lcurl);
    datas.put(RuleEnum.rcurl, rcurl);
    datas.put(RuleEnum.lopt, lopt);
    datas.put(RuleEnum.ropt, ropt);
    datas.put(RuleEnum.use, use);
    datas.put(RuleEnum.data, data);
    datas.put(RuleEnum.def, def);
    datas.put(RuleEnum._const, _const);
    datas.put(RuleEnum.end, end);
    datas.put(RuleEnum._new, _new);
    datas.put(RuleEnum._if, _if);
    datas.put(RuleEnum._else, _else);
    datas.put(RuleEnum.or, or);
    datas.put(RuleEnum.print, print);
    datas.put(RuleEnum._while, _while);
    datas.put(RuleEnum._return, _return);
    datas.put(RuleEnum._break, _break);
    datas.put(RuleEnum._continue, _continue);
    datas.put(RuleEnum.fail, fail);
    datas.put(RuleEnum.nulz, nulz);
    datas.put(RuleEnum.bool, bool);
    datas.put(RuleEnum.id, id);
    datas.put(RuleEnum.text, text);
    datas.put(RuleEnum.integer, integer);
    datas.put(RuleEnum.number, number);
    datas.put(RuleEnum.space, space);
    datas.put(RuleEnum.comment, comment);
    table = new LexerTable<RuleEnum>(datas);
  }

  
  private boolean[] plusMainAccepts;
  private void initplusMainAccepts() {
    plusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] plusMainTransitions;
  private void initplusMainTransitions() {
    plusMainTransitions = new int[][] {{0,-1},{0,-1,43,0,44,-1}};
  }
  
  private boolean[] minusMainAccepts;
  private void initminusMainAccepts() {
    minusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] minusMainTransitions;
  private void initminusMainTransitions() {
    minusMainTransitions = new int[][] {{0,-1},{0,-1,45,0,46,-1}};
  }
  
  private boolean[] starMainAccepts;
  private void initstarMainAccepts() {
    starMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] starMainTransitions;
  private void initstarMainTransitions() {
    starMainTransitions = new int[][] {{0,-1},{0,-1,42,0,43,-1}};
  }
  
  private boolean[] slashMainAccepts;
  private void initslashMainAccepts() {
    slashMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] slashMainTransitions;
  private void initslashMainTransitions() {
    slashMainTransitions = new int[][] {{0,-1},{0,-1,47,0,48,-1}};
  }
  
  private boolean[] modMainAccepts;
  private void initmodMainAccepts() {
    modMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] modMainTransitions;
  private void initmodMainTransitions() {
    modMainTransitions = new int[][] {{0,-1},{0,-1,37,0,38,-1}};
  }
  
  private boolean[] assignMainAccepts;
  private void initassignMainAccepts() {
    assignMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] assignMainTransitions;
  private void initassignMainTransitions() {
    assignMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] eqMainAccepts;
  private void initeqMainAccepts() {
    eqMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] eqMainTransitions;
  private void initeqMainTransitions() {
    eqMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,61,1,62,-1}};
  }
  
  private boolean[] neMainAccepts;
  private void initneMainAccepts() {
    neMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] neMainTransitions;
  private void initneMainTransitions() {
    neMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,33,1,34,-1}};
  }
  
  private boolean[] ltMainAccepts;
  private void initltMainAccepts() {
    ltMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] ltMainTransitions;
  private void initltMainTransitions() {
    ltMainTransitions = new int[][] {{0,-1},{0,-1,60,0,61,-1}};
  }
  
  private boolean[] leMainAccepts;
  private void initleMainAccepts() {
    leMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] leMainTransitions;
  private void initleMainTransitions() {
    leMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,60,1,61,-1}};
  }
  
  private boolean[] gtMainAccepts;
  private void initgtMainAccepts() {
    gtMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] gtMainTransitions;
  private void initgtMainTransitions() {
    gtMainTransitions = new int[][] {{0,-1},{0,-1,62,0,63,-1}};
  }
  
  private boolean[] geMainAccepts;
  private void initgeMainAccepts() {
    geMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] geMainTransitions;
  private void initgeMainTransitions() {
    geMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,62,1,63,-1}};
  }
  
  private boolean[] dotMainAccepts;
  private void initdotMainAccepts() {
    dotMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] dotMainTransitions;
  private void initdotMainTransitions() {
    dotMainTransitions = new int[][] {{0,-1},{0,-1,46,0,47,-1}};
  }
  
  private boolean[] bangMainAccepts;
  private void initbangMainAccepts() {
    bangMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] bangMainTransitions;
  private void initbangMainTransitions() {
    bangMainTransitions = new int[][] {{0,-1},{0,-1,33,0,34,-1}};
  }
  
  private boolean[] pipeMainAccepts;
  private void initpipeMainAccepts() {
    pipeMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] pipeMainTransitions;
  private void initpipeMainTransitions() {
    pipeMainTransitions = new int[][] {{0,-1},{0,-1,124,0,125,-1}};
  }
  
  private boolean[] ampMainAccepts;
  private void initampMainAccepts() {
    ampMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] ampMainTransitions;
  private void initampMainTransitions() {
    ampMainTransitions = new int[][] {{0,-1},{0,-1,38,0,39,-1}};
  }
  
  private boolean[] xorMainAccepts;
  private void initxorMainAccepts() {
    xorMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] xorMainTransitions;
  private void initxorMainTransitions() {
    xorMainTransitions = new int[][] {{0,-1},{0,-1,94,0,95,-1}};
  }
  
  private boolean[] dpipeMainAccepts;
  private void initdpipeMainAccepts() {
    dpipeMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] dpipeMainTransitions;
  private void initdpipeMainTransitions() {
    dpipeMainTransitions = new int[][] {{0,-1},{0,-1,124,2,125,-1},{0,-1,124,0,125,-1}};
  }
  
  private boolean[] dampMainAccepts;
  private void initdampMainAccepts() {
    dampMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] dampMainTransitions;
  private void initdampMainTransitions() {
    dampMainTransitions = new int[][] {{0,-1},{0,-1,38,2,39,-1},{0,-1,38,0,39,-1}};
  }
  
  private boolean[] atMainAccepts;
  private void initatMainAccepts() {
    atMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] atMainTransitions;
  private void initatMainTransitions() {
    atMainTransitions = new int[][] {{0,-1},{0,-1,64,0,65,-1}};
  }
  
  private boolean[] isMainAccepts;
  private void initisMainAccepts() {
    isMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] isMainTransitions;
  private void initisMainTransitions() {
    isMainTransitions = new int[][] {{0,-1},{0,-1,126,0,127,-1}};
  }
  
  private boolean[] colonMainAccepts;
  private void initcolonMainAccepts() {
    colonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] colonMainTransitions;
  private void initcolonMainTransitions() {
    colonMainTransitions = new int[][] {{0,-1},{0,-1,58,0,59,-1}};
  }
  
  private boolean[] commaMainAccepts;
  private void initcommaMainAccepts() {
    commaMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] commaMainTransitions;
  private void initcommaMainTransitions() {
    commaMainTransitions = new int[][] {{0,-1},{0,-1,44,0,45,-1}};
  }
  
  private boolean[] eolMainAccepts;
  private void initeolMainAccepts() {
    eolMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] eolMainTransitions;
  private void initeolMainTransitions() {
    eolMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1}};
  }
  
  private boolean[] lparMainAccepts;
  private void initlparMainAccepts() {
    lparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lparMainTransitions;
  private void initlparMainTransitions() {
    lparMainTransitions = new int[][] {{0,-1},{0,-1,40,0,41,-1}};
  }
  
  private boolean[] rparMainAccepts;
  private void initrparMainAccepts() {
    rparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rparMainTransitions;
  private void initrparMainTransitions() {
    rparMainTransitions = new int[][] {{0,-1},{0,-1,41,0,42,-1}};
  }
  
  private boolean[] lcurlMainAccepts;
  private void initlcurlMainAccepts() {
    lcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lcurlMainTransitions;
  private void initlcurlMainTransitions() {
    lcurlMainTransitions = new int[][] {{0,-1},{0,-1,123,0,124,-1}};
  }
  
  private boolean[] rcurlMainAccepts;
  private void initrcurlMainAccepts() {
    rcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rcurlMainTransitions;
  private void initrcurlMainTransitions() {
    rcurlMainTransitions = new int[][] {{0,-1},{0,-1,125,0,126,-1}};
  }
  
  private boolean[] loptMainAccepts;
  private void initloptMainAccepts() {
    loptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] loptMainTransitions;
  private void initloptMainTransitions() {
    loptMainTransitions = new int[][] {{0,-1},{0,-1,91,0,92,-1}};
  }
  
  private boolean[] roptMainAccepts;
  private void initroptMainAccepts() {
    roptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] roptMainTransitions;
  private void initroptMainTransitions() {
    roptMainTransitions = new int[][] {{0,-1},{0,-1,93,0,94,-1}};
  }
  
  private boolean[] useMainAccepts;
  private void inituseMainAccepts() {
    useMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] useMainTransitions;
  private void inituseMainTransitions() {
    useMainTransitions = new int[][] {{0,-1},{0,-1,117,2,118,-1},{0,-1,115,3,116,-1},{0,-1,101,0,102,-1}};
  }
  
  private boolean[] dataMainAccepts;
  private void initdataMainAccepts() {
    dataMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] dataMainTransitions;
  private void initdataMainTransitions() {
    dataMainTransitions = new int[][] {{0,-1},{0,-1,97,0,98,-1},{0,-1,97,4,98,-1},{0,-1,100,2,101,-1},{0,-1,116,1,117,-1}};
  }
  
  private boolean[] defMainAccepts;
  private void initdefMainAccepts() {
    defMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] defMainTransitions;
  private void initdefMainTransitions() {
    defMainTransitions = new int[][] {{0,-1},{0,-1,102,0,103,-1},{0,-1,101,1,102,-1},{0,-1,100,2,101,-1}};
  }
  
  private boolean[] _constMainAccepts;
  private void init_constMainAccepts() {
    _constMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _constMainTransitions;
  private void init_constMainTransitions() {
    _constMainTransitions = new int[][] {{0,-1},{0,-1,110,2,111,-1},{0,-1,115,5,116,-1},{0,-1,111,1,112,-1},{0,-1,99,3,100,-1},{0,-1,116,0,117,-1}};
  }
  
  private boolean[] endMainAccepts;
  private void initendMainAccepts() {
    endMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] endMainTransitions;
  private void initendMainTransitions() {
    endMainTransitions = new int[][] {{0,-1},{0,-1,110,3,111,-1},{0,-1,101,1,102,-1},{0,-1,100,0,101,-1}};
  }
  
  private boolean[] _newMainAccepts;
  private void init_newMainAccepts() {
    _newMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] _newMainTransitions;
  private void init_newMainTransitions() {
    _newMainTransitions = new int[][] {{0,-1},{0,-1,119,0,120,-1},{0,-1,110,3,111,-1},{0,-1,101,1,102,-1}};
  }
  
  private boolean[] _ifMainAccepts;
  private void init_ifMainAccepts() {
    _ifMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] _ifMainTransitions;
  private void init_ifMainTransitions() {
    _ifMainTransitions = new int[][] {{0,-1},{0,-1,102,0,103,-1},{0,-1,105,1,106,-1}};
  }
  
  private boolean[] _elseMainAccepts;
  private void init_elseMainAccepts() {
    _elseMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] _elseMainTransitions;
  private void init_elseMainTransitions() {
    _elseMainTransitions = new int[][] {{0,-1},{0,-1,115,2,116,-1},{0,-1,101,0,102,-1},{0,-1,101,4,102,-1},{0,-1,108,1,109,-1}};
  }
  
  private boolean[] orMainAccepts;
  private void initorMainAccepts() {
    orMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] orMainTransitions;
  private void initorMainTransitions() {
    orMainTransitions = new int[][] {{0,-1},{0,-1,111,2,112,-1},{0,-1,114,0,115,-1}};
  }
  
  private boolean[] printMainAccepts;
  private void initprintMainAccepts() {
    printMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] printMainTransitions;
  private void initprintMainTransitions() {
    printMainTransitions = new int[][] {{0,-1},{0,-1,110,4,111,-1},{0,-1,105,1,106,-1},{0,-1,114,2,115,-1},{0,-1,116,0,117,-1},{0,-1,112,3,113,-1}};
  }
  
  private boolean[] _whileMainAccepts;
  private void init_whileMainAccepts() {
    _whileMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _whileMainTransitions;
  private void init_whileMainTransitions() {
    _whileMainTransitions = new int[][] {{0,-1},{0,-1,119,5,120,-1},{0,-1,105,4,106,-1},{0,-1,101,0,102,-1},{0,-1,108,3,109,-1},{0,-1,104,2,105,-1}};
  }
  
  private boolean[] _returnMainAccepts;
  private void init_returnMainAccepts() {
    _returnMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] _returnMainTransitions;
  private void init_returnMainTransitions() {
    _returnMainTransitions = new int[][] {{0,-1},{0,-1,117,4,118,-1},{0,-1,110,0,111,-1},{0,-1,101,6,102,-1},{0,-1,114,2,115,-1},{0,-1,114,3,115,-1},{0,-1,116,1,117,-1}};
  }
  
  private boolean[] _breakMainAccepts;
  private void init_breakMainAccepts() {
    _breakMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _breakMainTransitions;
  private void init_breakMainTransitions() {
    _breakMainTransitions = new int[][] {{0,-1},{0,-1,98,3,99,-1},{0,-1,107,0,108,-1},{0,-1,114,4,115,-1},{0,-1,101,5,102,-1},{0,-1,97,2,98,-1}};
  }
  
  private boolean[] _continueMainAccepts;
  private void init_continueMainAccepts() {
    _continueMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false};
  }
    
  private int[][] _continueMainTransitions;
  private void init_continueMainTransitions() {
    _continueMainTransitions = new int[][] {{0,-1},{0,-1,110,3,111,-1},{0,-1,110,8,111,-1},{0,-1,117,6,118,-1},{0,-1,105,1,106,-1},{0,-1,111,2,112,-1},{0,-1,101,0,102,-1},{0,-1,99,5,100,-1},{0,-1,116,4,117,-1}};
  }
  
  private boolean[] failMainAccepts;
  private void initfailMainAccepts() {
    failMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] failMainTransitions;
  private void initfailMainTransitions() {
    failMainTransitions = new int[][] {{0,-1},{0,-1,102,3,103,-1},{0,-1,105,4,106,-1},{0,-1,97,2,98,-1},{0,-1,108,0,109,-1}};
  }
  
  private boolean[] nulzMainAccepts;
  private void initnulzMainAccepts() {
    nulzMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] nulzMainTransitions;
  private void initnulzMainTransitions() {
    nulzMainTransitions = new int[][] {{0,-1},{0,-1,110,2,111,-1},{0,-1,117,3,118,-1},{0,-1,108,4,109,-1},{0,-1,108,0,109,-1}};
  }
  
  private boolean[] boolMainAccepts;
  private void initboolMainAccepts() {
    boolMainAccepts = new boolean[] {true,false,false,false,false,false,false,false};
  }
    
  private int[][] boolMainTransitions;
  private void initboolMainTransitions() {
    boolMainTransitions = new int[][] {{0,-1},{0,-1,102,5,103,-1,116,6,117,-1},{0,-1,115,4,116,-1},{0,-1,117,4,118,-1},{0,-1,101,0,102,-1},{0,-1,97,7,98,-1},{0,-1,114,3,115,-1},{0,-1,108,2,109,-1}};
  }
  
  private boolean[] idMainAccepts;
  private void initidMainAccepts() {
    idMainAccepts = new boolean[] {true,true,true,false};
  }
    
  private int[][] idMainTransitions;
  private void initidMainTransitions() {
    idMainTransitions = new int[][] {{0,-1,63,1,64,-1},{0,-1},{0,-1,39,0,40,-1,48,2,58,-1,63,1,64,-1,65,2,91,-1,95,2,96,-1,97,2,123,-1},{0,-1,65,2,91,-1,95,2,96,-1,97,2,123,-1}};
  }
  
  private boolean[] textMainAccepts;
  private void inittextMainAccepts() {
    textMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] textMainTransitions;
  private void inittextMainTransitions() {
    textMainTransitions = new int[][] {{0,-1},{0,-1,34,2,35,-1},{0,2,34,0,35,2}};
  }
  
  private boolean[] integerMainAccepts;
  private void initintegerMainAccepts() {
    integerMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] integerMainTransitions;
  private void initintegerMainTransitions() {
    integerMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,48,0,58,-1}};
  }
  
  private boolean[] numberMainAccepts;
  private void initnumberMainAccepts() {
    numberMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] numberMainTransitions;
  private void initnumberMainTransitions() {
    numberMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,46,2,47,-1,48,1,58,-1},{0,-1,48,0,58,-1}};
  }
  
  private boolean[] spaceMainAccepts;
  private void initspaceMainAccepts() {
    spaceMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] spaceMainTransitions;
  private void initspaceMainTransitions() {
    spaceMainTransitions = new int[][] {{0,-1},{0,-1,9,0,11,-1,13,0,14,-1,32,0,33,-1}};
  }
  
  private boolean[] commentMainAccepts;
  private void initcommentMainAccepts() {
    commentMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] commentMainTransitions;
  private void initcommentMainTransitions() {
    commentMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1},{0,-1,47,3,48,-1},{0,-1,47,4,48,-1},{0,4,10,0,11,4,13,1,14,4}};
  }
  
  private final LexerTable<RuleEnum> table;
}
