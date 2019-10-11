package com.bczx.fcy.day106;

import com.bczx.fcy.day105.SingletonLazy;

public class SingletonInnerClassRunner implements Runnable {

  @Override
  public void run() {
    SingletonInnerClass singletonLazy = SingletonInnerClass.getInstance();
    singletonLazy.print();
  }
}
