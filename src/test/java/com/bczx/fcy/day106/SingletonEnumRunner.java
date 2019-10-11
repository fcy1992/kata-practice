package com.bczx.fcy.day106;

public class SingletonEnumRunner implements Runnable {

  @Override
  public void run() {
    SingletonEnum.INSTANCE.print();
  }
}
