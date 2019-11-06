package com.bczx.fcy.day1106;

public class SingletonHunger {

  private SingletonHunger() {}

  private static final SingletonHunger instance = new SingletonHunger();

  public static SingletonHunger getInstance() {
    return instance;
  }

}
