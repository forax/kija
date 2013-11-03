package com.github.kija.runtime;

import com.github.kija.parser.ast.Data;

public class DataMirror {
  private final MetaMirror meta;
  private final Data data;

  DataMirror(MetaMirror meta, Data data) {
    this.meta = meta;
    this.data = data;
  }

  public MetaMirror getMeta() {
    return meta;
  }
  
  public String getName() {
    return data.getName();
  }
}
