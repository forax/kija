package com.github.kija.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.github.kija.grammar.lexer.RuleEnum;
import com.github.kija.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.dot,RuleEnum.print,RuleEnum.lpar,RuleEnum.eol,RuleEnum.minus,RuleEnum.lt,RuleEnum.dpipe,RuleEnum.is,RuleEnum.comma,RuleEnum.end,RuleEnum.comment,RuleEnum.at,RuleEnum._else,RuleEnum.colon,RuleEnum.ne,RuleEnum.eq,RuleEnum.bool,RuleEnum.pipe,RuleEnum._break,RuleEnum.def,RuleEnum.text,RuleEnum.damp,RuleEnum.slash,RuleEnum._const,RuleEnum.rpar,RuleEnum.assign,RuleEnum.gt,RuleEnum._continue,RuleEnum.mod,RuleEnum.or,RuleEnum.id,RuleEnum.use,RuleEnum.data,RuleEnum.lcurl,RuleEnum.bang,RuleEnum._while,RuleEnum.integer,RuleEnum.dcolon,RuleEnum.xor,RuleEnum.ge,RuleEnum.ropt,RuleEnum._new,RuleEnum.fail,RuleEnum.le,RuleEnum.amp,RuleEnum._return,RuleEnum.star,RuleEnum.rcurl,RuleEnum._if,RuleEnum.plus,RuleEnum.nulz,RuleEnum.lopt,RuleEnum.number);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.print,TerminalEnum.print);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.dpipe,TerminalEnum.dpipe);
              terminal.put(RuleEnum.is,TerminalEnum.is);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum.end,TerminalEnum.end);
              terminal.put(RuleEnum.at,TerminalEnum.at);
              terminal.put(RuleEnum._else,TerminalEnum._else);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.bool,TerminalEnum.bool);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum._break,TerminalEnum._break);
              terminal.put(RuleEnum.def,TerminalEnum.def);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.damp,TerminalEnum.damp);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum._const,TerminalEnum._const);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
              terminal.put(RuleEnum._continue,TerminalEnum._continue);
              terminal.put(RuleEnum.mod,TerminalEnum.mod);
              terminal.put(RuleEnum.or,TerminalEnum.or);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum.use,TerminalEnum.use);
              terminal.put(RuleEnum.data,TerminalEnum.data);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.bang,TerminalEnum.bang);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum.integer,TerminalEnum.integer);
              terminal.put(RuleEnum.dcolon,TerminalEnum.dcolon);
              terminal.put(RuleEnum.xor,TerminalEnum.xor);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum._new,TerminalEnum._new);
              terminal.put(RuleEnum.fail,TerminalEnum.fail);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.amp,TerminalEnum.amp);
              terminal.put(RuleEnum._return,TerminalEnum._return);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.nulz,TerminalEnum.nulz);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
              terminal.put(RuleEnum.number,TerminalEnum.number);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.comment,RuleEnum.space);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}