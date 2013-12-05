package com.github.kija.main;

import java.nio.file.Paths;

import com.github.kija.interpreter.Interpreter;
import com.github.kija.runtime.Engine;

public class Main {
  public static void main(String[] args) throws Throwable {
    Engine engine = new Engine();
    if (args.length > 1) {
      if (args[0].equals("-i")) {
        Interpreter interpreter = new Interpreter(Paths.get(args[1]), args);
        interpreter.interpret();
      } else {
        engine.run(Paths.get(args[0]), args);
      }
    } else {
      engine.run("<stdin>", new java.io.InputStreamReader(System.in), args);
    }
  }
}
