package com.github.kija.runtime;

import java.util.HashMap;

import com.github.kija.parser.ast.Data;
import com.github.kija.parser.ast.Function;
import com.github.kija.parser.ast.Script;

public class MetaMirror {
  private final HashMap<String, DataMirror> dataMap = new HashMap<>();
  private final HashMap<String, UnitMirror> unitMap = new HashMap<>();
  private final static ClassValue<FunctionMirror> functionClassValue = new ClassValue<FunctionMirror>() {
    @Override
    protected FunctionMirror computeValue(Class<?> type) {
      FunctionMirror functionMirror = injecter.get();
      if (functionMirror == null) {
        throw new IllegalArgumentException("try to find a function mirror of a non generated class");
      }
      return functionMirror;
    }
  };
  static final ThreadLocal<FunctionMirror> injecter = new ThreadLocal<>();
  
  MetaMirror() {
   
  }

  static void registerClass(Class<?> generatedClass, FunctionMirror functionMirror) {
    injecter.set(functionMirror);
    FunctionMirror mirror;
    try {
      mirror = functionClassValue.get(generatedClass); 
    } finally {
      injecter.set(null);
    }
    if (functionMirror != mirror) {
      throw new AssertionError("try to register a class twice");
    }
  }
  
  public static FunctionMirror getFunctionForClass(Class<?> generatedClass) {
    return functionClassValue.get(generatedClass);
  }
  
  public DataMirror getDataMirror(String name) {
    return dataMap.get(name);
  }
  
  public UnitMirror getUnitMirror(String name) {
    return unitMap.get(name);
  }
  
  public UnitMirror addUnit(String unitName, Script script) {
    for(Data data: script.getDatas()) {
      dataMap.put(data.getName(), new DataMirror(this, data));
    }
    
    HashMap<String, FunctionMirror> functionMap = new HashMap<>();
    UnitMirror unit = new UnitMirror(this, unitName, functionMap);
    for(Function function: script.getFunctions()) {
      FunctionMirror entry = new FunctionMirror(unit, function);
      functionMap.put(function.getName(), entry);
    }
    
    unitMap.put(unitName, unit);
    return unit;
  }
}
