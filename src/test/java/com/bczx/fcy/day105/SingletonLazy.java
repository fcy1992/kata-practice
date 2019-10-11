package com.bczx.fcy.day105;

import java.util.Objects;

public class SingletonLazy {

  private volatile Integer initCount = 0;

  private SingletonLazy() {}

  private volatile static SingletonLazy singletonLazy;

  public synchronized static SingletonLazy getSingletonLazy() {
    if (Objects.isNull(singletonLazy)) {
//      synchronized (singletonLazy) {
        if (Objects.isNull(singletonLazy)) {
          singletonLazy = new SingletonLazy();
//          return singletonLazy;
        }
//      }
    }
    return singletonLazy;
  }

  public synchronized void print() {
//    synchronized (initCount) {
      initCount ++;
//      System.out.println(this.initCount);
//    }
    System.out.println(this.hashCode());
  }

  public synchronized Integer getInitCount() {
//    synchronized (SingletonLazy.class) {
      return initCount;
//    }
  }

  public void printInitCount() {
    System.out.println(initCount);
  }
}
