package com.bczx.fcy.day1029;

public class SingletonInnerClass {

  private SingletonInnerClass() {}

  private static class SingletonHolder {
    private static final SingletonInnerClass instance = new SingletonInnerClass();
  }

  public static SingletonInnerClass getInstance(){
    return SingletonHolder.instance;
  }
}