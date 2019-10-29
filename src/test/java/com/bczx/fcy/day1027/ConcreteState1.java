package com.bczx.fcy.day1027;

class ConcreteState1 extends ShareState {

  public void Handle(ShareContext context) {
    System.out.println("当前状态是： 状态1");
    context.setState(context.getState("2"));
  }

}
