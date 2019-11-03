package com.bczx.fcy.day1102;

public class SingletonInnerClass {

  private SingletonInnerClass() {}

  private static class SingletonHolder {
    private static final SingletonInnerClass instance = new SingletonInnerClass();
  }

  public SingletonInnerClass getInstance() {
    return SingletonHolder.instance;
  }
}
