package com.github.kija.runtime;

import java.lang.invoke.MethodHandle;

import com.github.kija.compiler.Compiler;
import com.github.kija.compiler.Compiler.CompilerResult;
import com.github.kija.compiler.Type;
import com.github.kija.parser.ast.Function;

public class FunctionMirror {
  private final UnitMirror unit;
  private final Function function;
  private MethodHandle invoker;
  
  FunctionMirror(UnitMirror unit, Function function) {
    this.unit = unit;
    this.function = function;
  }
  
  public UnitMirror getUnit() {
    return unit;
  }
  
  public Function getFunction() {
    return function;
  }
  
  public MethodHandle getInvoker(Type returnType, Type... parameterTypes) {
    if (invoker != null) {
      return invoker;
    }
    CompilerResult result = new Compiler().compile(unit.getUnitName(), function, returnType, parameterTypes);
    MetaMirror.registerClass(result.getGeneratedClass(), this);
    return this.invoker = result.getInvoker();
  }
}
