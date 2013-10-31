package com.github.kija.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.github.kija.grammar.lexer.RuleEnum;
import com.github.kija.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.id,RuleEnum.slash,RuleEnum._while,RuleEnum.print,RuleEnum.def,RuleEnum.integer,RuleEnum.eol,RuleEnum.mod,RuleEnum._continue,RuleEnum.bool,RuleEnum.ropt,RuleEnum.star,RuleEnum.eq,RuleEnum.end,RuleEnum.rcurl,RuleEnum._if,RuleEnum.comma,RuleEnum.ge,RuleEnum.at,RuleEnum.lpar,RuleEnum.data,RuleEnum.dot,RuleEnum.text,RuleEnum.plus,RuleEnum.assign,RuleEnum.comment,RuleEnum._break,RuleEnum.nulz,RuleEnum.use,RuleEnum.lt,RuleEnum.lcurl,RuleEnum._else,RuleEnum.dpipe,RuleEnum.or,RuleEnum.pipe,RuleEnum.bang,RuleEnum.rpar,RuleEnum.is,RuleEnum.ne,RuleEnum._new,RuleEnum.number,RuleEnum._return,RuleEnum.le,RuleEnum.minus,RuleEnum.damp,RuleEnum.colon,RuleEnum._const,RuleEnum.amp,RuleEnum.xor,RuleEnum.lopt,RuleEnum.gt);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum.def,TerminalEnum.def);
              terminal.put(RuleEnum.print,TerminalEnum.print);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum._continue,TerminalEnum._continue);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.at,TerminalEnum.at);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.nulz,TerminalEnum.nulz);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.dpipe,TerminalEnum.dpipe);
              terminal.put(RuleEnum.or,TerminalEnum.or);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum.bang,TerminalEnum.bang);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.is,TerminalEnum.is);
              terminal.put(RuleEnum._new,TerminalEnum._new);
              terminal.put(RuleEnum._return,TerminalEnum._return);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
              terminal.put(RuleEnum.damp,TerminalEnum.damp);
              terminal.put(RuleEnum.amp,TerminalEnum.amp);
              terminal.put(RuleEnum._const,TerminalEnum._const);
              terminal.put(RuleEnum.xor,TerminalEnum.xor);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum.integer,TerminalEnum.integer);
              terminal.put(RuleEnum.mod,TerminalEnum.mod);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum.bool,TerminalEnum.bool);
              terminal.put(RuleEnum.end,TerminalEnum.end);
              terminal.put(RuleEnum.data,TerminalEnum.data);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum._break,TerminalEnum._break);
              terminal.put(RuleEnum.use,TerminalEnum.use);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum._else,TerminalEnum._else);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.number,TerminalEnum.number);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.comment,RuleEnum.space);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}