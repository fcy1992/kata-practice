package com.bczx.fcy.day105;

public class SingletonLazyRunner implements Runnable {

  @Override
  public void run() {
    SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
    singletonLazy.print();
    System.out.println(singletonLazy.getInitCount());
  }
}
