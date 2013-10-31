package com.github.kija.compiler.ast;

import java.util.List;
import java.util.Objects;

public class Script {
  private final List<Use> uses;
  private final List<Const> consts;
  private final List<Data> datas;
  private final List<Function> functions;
  
  public Script(List<Use> uses, List<Const> consts, List<Data> datas, List<Function> functions) {
    this.uses = Objects.requireNonNull(uses);
    this.consts = Objects.requireNonNull(consts);
    this.datas = Objects.requireNonNull(datas);
    this.functions = Objects.requireNonNull(functions);
  }
  
  public List<Use> getUses() {
    return uses;
  }
  public List<Const> getConsts() {
    return consts;
  }
  public List<Data> getDatas() {
    return datas;
  }
  public List<Function> getFunctions() {
    return functions;
  }
}
