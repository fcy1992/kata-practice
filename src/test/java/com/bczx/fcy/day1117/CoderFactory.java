package com.bczx.fcy.day1117;

public interface CoderFactory<T> {

  BaseEncoder<T> getCoder(T coderType);
}
