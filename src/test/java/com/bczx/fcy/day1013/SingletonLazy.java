package com.bczx.fcy.day1013;

import java.util.Objects;

public class SingletonLazy {

  private Integer initCount = 0;

  private SingletonLazy() {
  }

  private static SingletonLazy singletonLazy;

  public static SingletonLazy getSingletonLazy() {
    if (Objects.isNull(singletonLazy)) {
      singletonLazy = new SingletonLazy();
    }
    return singletonLazy;
  }

  public synchronized void print() {
    initCount++;
    System.out.println(this.hashCode());
  }

  public synchronized Integer getInitCount() {
    return initCount;
  }

  public void printInitCount() {
    System.out.println(initCount);
  }
}
