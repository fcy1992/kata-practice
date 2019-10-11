package com.bczx.fcy.day105;

import java.util.Objects;

public class Singleton1 {

  private Singleton1() {}

  private static Singleton1 singleton1;

  public static Singleton1 getSingleton1() {
    if (Objects.isNull(singleton1)) {
      singleton1 = new Singleton1();
    }
    return singleton1;
  }
}
