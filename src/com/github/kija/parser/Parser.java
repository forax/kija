package com.github.kija.parser;

import java.io.Reader;

import com.github.kija.grammar.tools.Analyzers;
import com.github.kija.grammar.tools.TerminalEvaluator;
import com.github.kija.parser.ast.Script;

import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;

public class Parser {
  public static Script parse(Reader reader) {
    LocationTracker tracker = new LocationTracker();
    ReaderWrapper buffer = new ReaderWrapper(reader, tracker);
    TerminalEvaluator<CharSequence> terminalEvaluator = new TerminalEvaluator<CharSequence>() {
      @Override
      public Token<Boolean> bool(CharSequence data) {
        return new Token<>(Boolean.parseBoolean(data.toString()), 1 + tracker.getLineNumber());
      }
      @Override
      public Token<Integer> integer(CharSequence data) {
        return new Token<>(Integer.parseInt(data.toString()), 1 + tracker.getLineNumber());
      }
      @Override
      public Token<Double> number(CharSequence data) {
        return new Token<>(Double.parseDouble(data.toString()), 1 + tracker.getLineNumber());
      }
      @Override
      public Token<String> text(CharSequence data) {
        return new Token<>(data.subSequence(1, data.length() - 1).toString(), 1 + tracker.getLineNumber());
      }
      
      @Override
      public Token<String> id(CharSequence data) {
        return new Token<>(data.toString(), 1 + tracker.getLineNumber());
      }
      
      @Override
      public void comment(CharSequence data) {
        // do nothing
      }
    };

    ASTCreator astCreator = new ASTCreator(tracker);
    Analyzers.run(buffer, terminalEvaluator, astCreator, null, null);
    return astCreator.createScript();
  }
}
