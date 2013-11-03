package com.github.kija.runtime;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;

public class RT {
  public static Class<?> getRuntimeType(Object o) {
    if (o == null) {
      return Object.class;
    }
    Class<?> clazz = o.getClass();
    switch(clazz.getName()) {
    case "java/lang/Boolean":
      return boolean.class;
    case "java/lang/Integer":
      return int.class;
    case "java/lang/Double":
      return double.class;
    default:
      return clazz;
    }
  }
  
  /**
   * @param lookup lookup object.
   * @param name method name (always 'print')
   * @param methodType signature of the print method (print has a polymorphic signature!)
   * @return a callsite that will call printAll.
   */
  public static CallSite print(Lookup lookup, String name, MethodType methodType) {
    return new ConstantCallSite(PRINT_ALL.asCollector(Object[].class, methodType.parameterCount()).asType(methodType));  
  }
  
  private static final MethodHandle PRINT_ALL;
  private static final MethodHandle THROW_ERROR;
  static {
    Lookup lookup = MethodHandles.publicLookup();
    try {
      PRINT_ALL = lookup.findStatic(RT.class, "printAll", MethodType.methodType(void.class, Object[].class));
      THROW_ERROR = lookup.findStatic(RT.class, "throwError", MethodType.methodType(void.class, String.class));
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
  }
  
  
  public static void printAll(Object... values) {
    StringBuilder builder = new StringBuilder();
    for(Object value: values) {
      builder.append(value);
    }
    System.out.println(builder);
  }
  
  /**
   * @param lookup lookup object.
   * @param name method name (always 'print')
   * @param methodType signature of the print method (print has a polymorphic signature!)
   * @return a callsite that will call printAll.
   */
  public static CallSite convert(Lookup lookup, String name, MethodType methodType) {
    Class<?> to = methodType.returnType();
    Class<?> from = methodType.parameterType(0);
    if (to != Object.class && from != Object.class) {
      return new ConstantCallSite(MethodHandles.dropArguments(
          THROW_ERROR.bindTo("can't convert " + from + " to " + to),
          0, from).asType(methodType));
    }
    return new ConstantCallSite(MethodHandles.identity(from).asType(methodType));
  }
  
  public static void throwError(String message) {
    throw new RuntimeException(message);
  }
}
