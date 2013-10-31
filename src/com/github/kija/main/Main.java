package com.github.kija.main;

import com.github.kija.compiler.ASTCreator;
import com.github.kija.compiler.ast.Script;
import com.github.kija.grammar.tools.Analyzers;
import com.github.kija.grammar.tools.TerminalEvaluator;
import com.github.kija.printer.PrettyPrinter;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    java.io.Reader reader;
    if (args.length>0) {
      reader = new java.io.FileReader(args[0]);
    } else {
      reader = new java.io.InputStreamReader(System.in);
    }
    
    TerminalEvaluator<CharSequence> terminalEvaluator = new TerminalEvaluator<CharSequence>() {
      @Override
      public boolean bool(CharSequence data) {
        return Boolean.parseBoolean(data.toString());
      }
      @Override
      public int integer(CharSequence data) {
        return Integer.parseInt(data.toString());
      }
      @Override
      public double number(CharSequence data) {
        return Double.parseDouble(data.toString());
      }
      @Override
      public String text(CharSequence data) {
        return data.subSequence(1, data.length() - 1).toString();
      }
      
      @Override
      public String id(CharSequence data) {
        return data.toString();
      }
      
      @Override
      public void comment(CharSequence data) {
        // do nothing
      }
    };

    ASTCreator astCreator = new ASTCreator();
    Analyzers.run(reader, terminalEvaluator, astCreator, null, null);
    Script script = astCreator.createScript();
    
    System.out.println(new PrettyPrinter().prettyPrint(script));
  }
}
