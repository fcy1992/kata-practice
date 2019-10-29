package com.bczx.fcy.day1027;

import java.util.HashMap;

class ShareContext
{
  private ShareState state;

  private HashMap<String, ShareState> stateSet=new HashMap<String, ShareState>();

  public ShareContext() {
    state=new ConcreteState1();
    stateSet.put("1", state);
    state=new ConcreteState2();
    stateSet.put("2", state);
    state=getState("1");
  }

  public void setState(ShareState state) {
    this.state=state;
  }

  public ShareState getState(String key) {
    ShareState s=(ShareState)stateSet.get(key);
    return s;
  }

  public void Handle() {
    state.Handle(this);
  }
}
