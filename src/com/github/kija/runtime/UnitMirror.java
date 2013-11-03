package com.github.kija.runtime;

import java.util.HashMap;

public class UnitMirror {
  private final MetaMirror meta;
  private final String unitName;
  private final HashMap<String, FunctionMirror> functionMap;
  
  UnitMirror(MetaMirror meta, String unitName, HashMap<String, FunctionMirror> functionMap) {
    this.meta = meta;
    this.unitName = unitName;
    this.functionMap = functionMap;
  }
  
  public MetaMirror getMeta() {
    return meta;
  }
  
  public String getUnitName() {
    return unitName;
  }
  
  public FunctionMirror getFunction(String name) {
    return functionMap.get(name);
  }
}