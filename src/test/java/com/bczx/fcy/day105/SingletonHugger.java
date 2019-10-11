package com.bczx.fcy.day105;

public class SingletonHugger {

  private volatile Integer initCount = 0;

  private SingletonHugger() {}

  private static SingletonHugger singletonHugger = new SingletonHugger();

  public static SingletonHugger getInstance() {
    return singletonHugger;
  }

  public synchronized void print() {
    initCount ++;
    System.out.println(initCount);
  }
}
