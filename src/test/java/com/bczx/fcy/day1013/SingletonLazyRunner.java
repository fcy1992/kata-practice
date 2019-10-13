package com.bczx.fcy.day1013;

import com.bczx.fcy.day105.SingletonLazy;

public class SingletonLazyRunner implements Runnable {

  @Override
  public void run() {
    SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
    singletonLazy.print();
    System.out.println(singletonLazy.getInitCount());
  }
}
