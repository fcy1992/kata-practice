package com.bczx.fcy.day105;

import java.util.Objects;

public class SingletonLazy {

  private SingletonLazy() {}

  private static SingletonLazy singletonLazy;

  public static SingletonLazy getSingletonLazy() {
    if (Objects.isNull(singletonLazy)) {
      singletonLazy = new SingletonLazy();
    }
    return singletonLazy;
  }

  public void print() {
    System.out.println(this.hashCode());
  }
}
