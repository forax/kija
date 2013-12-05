package com.github.kija.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.github.kija.compiler.Type;
import com.github.kija.interpreter.Interpreter;
import com.github.kija.parser.Parser;
import com.github.kija.parser.ast.Script;
import com.github.kija.parser.ast.Use;

public class Engine {
  private final MetaMirror metaMirror = new MetaMirror();

  public void run(Path scriptPath, String[] args) throws Throwable {
    try(BufferedReader reader = Files.newBufferedReader(scriptPath, StandardCharsets.UTF_8)) {
      UnitMirror unit = loadUnit(metaMirror, scriptPath.getParent(), scriptPath.getFileName().toString(), reader);
      runUnit(unit, args);
    }
  }

  public void run(String scriptName, Reader reader, String[] args) throws Throwable {
    UnitMirror unit = loadUnit(metaMirror, Paths.get("."), scriptName, reader);
    runUnit(unit, args);
  }
  
  private static void runUnit(UnitMirror unit, String[] args) throws Throwable {
    FunctionMirror main = unit.getFunction("main");
    if (main == null) {
      throw new RuntimeException("no function main");
    }
    
    Array array = new Array(args.length);
    for(int i=0; i<args.length; i++) {
      array.setObjectElement(i, args[i]);
    }
    main.getInvoker(Type.VOID, Type.OBJ).invokeWithArguments(new Object[]{array});
  }
  
  private static UnitMirror loadUnit(MetaMirror metaMirror, Path currentPath, String scriptName, Reader reader) throws IOException {
    Script script = Parser.parse(reader);
    UnitMirror unit = metaMirror.addUnit(scriptName, script);
    for(Use use: script.getUses()) {
      // already imported ?
      String unitName = use.getName();
      if (metaMirror.getUnitMirror(unitName) != null) {
        continue;
      }
      Path path = currentPath.resolve(unitName);
      try(BufferedReader unitReader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
        loadUnit(metaMirror, currentPath, unitName, unitReader);
      }
    }
    return unit;
  }
}
