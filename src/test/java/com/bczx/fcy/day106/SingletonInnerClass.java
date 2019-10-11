package com.bczx.fcy.day106;

public class SingletonInnerClass {

  private SingletonInnerClass() {}

  private static class SingletonHolder {
    static final SingletonInnerClass SINGLETON_INNER_CLASS = new SingletonInnerClass();
  }

  public static SingletonInnerClass getInstance() {
    return SingletonHolder.SINGLETON_INNER_CLASS;
  }

  public void print() {
    System.out.println(this.hashCode());
  }
}
