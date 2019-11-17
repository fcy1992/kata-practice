package com.bczx.fcy.day1117;

public class Base16Factory implements CoderFactory<Object> {

  @Override
  public BaseEncoder<Object> getCoder(Object coderType) {
    return new Base16(4);
  }
}
