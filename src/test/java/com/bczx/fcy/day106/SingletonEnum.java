package com.bczx.fcy.day106;

public enum SingletonEnum {

  INSTANCE;

  public void print() {
    System.out.println(this.hashCode());
  }
}
