package com.github.kija.compiler;

import static org.objectweb.asm.Opcodes.ALOAD;
import static org.objectweb.asm.Opcodes.ARETURN;
import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.DLOAD;
import static org.objectweb.asm.Opcodes.DRETURN;
import static org.objectweb.asm.Opcodes.DSTORE;
import static org.objectweb.asm.Opcodes.ILOAD;
import static org.objectweb.asm.Opcodes.IRETURN;
import static org.objectweb.asm.Opcodes.ISTORE;
import static org.objectweb.asm.Opcodes.RETURN;

import java.util.HashMap;

import com.github.kija.runtime.FunctionMirror;

public enum Type {
  BOOL(boolean.class,       ISTORE, ILOAD, IRETURN),
  INT(int.class,            ISTORE, ILOAD, IRETURN),
  NUM(double.class,         DSTORE, DLOAD, DRETURN),
  STR(String.class,         ASTORE, ALOAD, ARETURN),
  FUN(FunctionMirror.class, ASTORE, ALOAD, ARETURN),
  OBJ(Object.class,         ASTORE, ALOAD, ARETURN),
  ANY(Object.class,         ASTORE, ALOAD, ARETURN),
  VOID(void.class,          -1,     -1,    RETURN),
  DEAD(void.class,          -1,     -1,    RETURN);  // should be used as return type only !
  
  final Class<?> type;
  final int storeOp;
  final int loadOp;
  final int returnOp;
  
  private Type(Class<?> type, int storeOp, int loadOp, int returnOp) {
    this.type = type;
    this.storeOp = storeOp;
    this.loadOp = loadOp;
    this.returnOp = returnOp;
  }
  
  int slotSize() {
    return (type == double.class)? 2: 1;
  }
  
  Type expectedTypeAsStackType() {
    return (this == VOID)? ANY: this;
  }
  
  static Type asType(Class<?> clazz) {
    return MAP.getOrDefault(clazz, ANY);
  }
  private static final HashMap<Class<?>, Type> MAP;
  static {
    HashMap<Class<?>, Type> map = new HashMap<>();
    for(Type type: Type.values()) {
      map.put(type.type, type);
    }
    MAP = map;
  }
}