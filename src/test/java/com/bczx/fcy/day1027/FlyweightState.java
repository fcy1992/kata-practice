package com.bczx.fcy.day1027;

public class FlyweightState {

  public static void main(String[] args)
  {
    ShareContext context=new ShareContext();
    context.Handle();
    context.Handle();
    context.Handle();
    context.Handle();
  }

}
