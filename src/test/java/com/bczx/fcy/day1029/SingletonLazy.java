package com.bczx.fcy.day1029;

public class SingletonLazy {

  private SingletonLazy(){}

  private static volatile SingletonLazy instance;

  public static SingletonLazy getInstance(){
    if(instance == null){
      synchronized(SingletonLazy.class){
        if(instance == null){
          instance = new SingletonLazy();
        }
      }
    }
    return instance;
  }
}
