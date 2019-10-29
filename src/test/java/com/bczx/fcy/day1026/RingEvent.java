package com.bczx.fcy.day1026;

import java.util.EventObject;

class RingEvent extends EventObject
{
  private static final long serialVersionUID=1L;

  private boolean sound;

  public RingEvent(Object source,boolean sound) {
    super(source);
    this.sound=sound;
  }

  public void setSound(boolean sound) {
    this.sound=sound;
  }

  public boolean getSound() {
    return this.sound;
  }
}
