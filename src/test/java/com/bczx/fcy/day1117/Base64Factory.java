package com.bczx.fcy.day1117;

public class Base64Factory implements CoderFactory<Base64.CoderType> {

  @Override
  public BaseEncoder<Base64.CoderType> getCoder(Base64.CoderType coderType) {
    return new Base64(6, coderType);
  }
}
