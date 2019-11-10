package com.bczx.fcy.day1110;

public class SingletonLazy {

  private SingletonLazy() {}

  private static volatile SingletonLazy instance;

  public SingletonLazy getInstance() {
    SingletonLazy singletonLazy = instance;
    if (singletonLazy == null) {
      synchronized (SingletonLazy.class) {
        singletonLazy = instance;
        if(singletonLazy == null){
          singletonLazy = instance = new SingletonLazy();
        }
      }
    }
    return singletonLazy;
  }
}
