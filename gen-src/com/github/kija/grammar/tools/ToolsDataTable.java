package com.github.kija.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.github.kija.grammar.lexer.RuleEnum;
import com.github.kija.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.or,RuleEnum.plus,RuleEnum.lopt,RuleEnum.comment,RuleEnum.slash,RuleEnum._return,RuleEnum.lt,RuleEnum.use,RuleEnum.ne,RuleEnum.amp,RuleEnum.mod,RuleEnum.damp,RuleEnum.colon,RuleEnum.eol,RuleEnum.eq,RuleEnum.fail,RuleEnum._continue,RuleEnum.end,RuleEnum.bool,RuleEnum.lcurl,RuleEnum.ge,RuleEnum.pipe,RuleEnum._while,RuleEnum.at,RuleEnum._if,RuleEnum.dot,RuleEnum.nulz,RuleEnum.data,RuleEnum._new,RuleEnum.rcurl,RuleEnum.minus,RuleEnum.rpar,RuleEnum.gt,RuleEnum.assign,RuleEnum.ropt,RuleEnum.lpar,RuleEnum.dpipe,RuleEnum._else,RuleEnum.def,RuleEnum._const,RuleEnum.integer,RuleEnum.is,RuleEnum.le,RuleEnum.comma,RuleEnum.text,RuleEnum._break,RuleEnum.number,RuleEnum.xor,RuleEnum.id,RuleEnum.print,RuleEnum.star,RuleEnum.bang);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.or,TerminalEnum.or);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum._return,TerminalEnum._return);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.use,TerminalEnum.use);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.amp,TerminalEnum.amp);
              terminal.put(RuleEnum.mod,TerminalEnum.mod);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
              terminal.put(RuleEnum.damp,TerminalEnum.damp);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.end,TerminalEnum.end);
              terminal.put(RuleEnum._continue,TerminalEnum._continue);
              terminal.put(RuleEnum.fail,TerminalEnum.fail);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.bool,TerminalEnum.bool);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.at,TerminalEnum.at);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.nulz,TerminalEnum.nulz);
              terminal.put(RuleEnum.data,TerminalEnum.data);
              terminal.put(RuleEnum._new,TerminalEnum._new);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.dpipe,TerminalEnum.dpipe);
              terminal.put(RuleEnum._else,TerminalEnum._else);
              terminal.put(RuleEnum.def,TerminalEnum.def);
              terminal.put(RuleEnum._const,TerminalEnum._const);
              terminal.put(RuleEnum.integer,TerminalEnum.integer);
              terminal.put(RuleEnum.is,TerminalEnum.is);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum._break,TerminalEnum._break);
              terminal.put(RuleEnum.number,TerminalEnum.number);
              terminal.put(RuleEnum.xor,TerminalEnum.xor);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum.bang,TerminalEnum.bang);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.print,TerminalEnum.print);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space,RuleEnum.comment);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}