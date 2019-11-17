package com.bczx.fcy.day1117;

public class Base32Factory implements CoderFactory<Base32.CoderType> {

  @Override
  public BaseEncoder<Base32.CoderType> getCoder(Base32.CoderType coderType) {
    return new Base32(5, coderType);
  }
}
