package com.bczx.fcy.day1027;

class ConcreteState2 extends ShareState {

  public void Handle(ShareContext context) {
    System.out.println("当前状态是： 状态2");
    context.setState(context.getState("2"));
  }

}
