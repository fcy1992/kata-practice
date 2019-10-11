package com.bczx.fcy.day105;

public class SingletonHunggerRunner implements Runnable {

  @Override
  public void run() {
    SingletonHugger singletonHugger = SingletonHugger.getInstance();
    singletonHugger.print();
  }
}
