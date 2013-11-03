package com.github.kija.runtime;

import java.util.AbstractList;

/**
 * A kija polymorphic array.
 */
public class Array extends AbstractList<Object>{
  private final Object[] array;
  
  public Array(int length) {
    this.array = new Object[length];
  }
  
  public int length() {
    return array.length;
  }
  
  
  public Object getObjectElement(int index) {
    return array[index];
  }
  
  public void setObjectElement(int index, Object value) {
    array[index] = value;
  }
  
  
  // --- java.util.List API
  
  @Override
  public int size() {
    return array.length;
  }
  
  @Override
  public Object get(int index) {
    return array[index];
  }
  
  @Override
  public Object set(int index, Object element) {
    Object old = array[index];
    array[index] = element;
    return old;
  }
}
