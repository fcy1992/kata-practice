package com.bczx.fcy.day1026;

import java.util.ArrayList;
import java.util.List;

class BellEventSource
{
  private List<BellEventListener> listeners;

  public BellEventSource() {
    listeners =new ArrayList<BellEventListener>();
  }

  public void addPersonListener(BellEventListener ren) {
    listeners.add(ren);
  }

  public void ring(boolean sound) {
    String type=sound?"上课铃":"下课铃";
    System.out.println(type+"响！");
    RingEvent event=new RingEvent(this, sound);
    notifies(event);
  }

  protected void notifies(RingEvent e) {
    listeners.forEach(listener -> listener.heardBell(e) );
  }
}