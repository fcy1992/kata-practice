package com.bczx.fcy.day1026;

import org.junit.Test;

public class BellEventTest {

  @Test
  public void testBell() {
    BellEventSource bell=new BellEventSource();
    bell.addPersonListener(new TeacherEventListener());
    bell.addPersonListener(new StudentEventListener());
    bell.ring(true);
    System.out.println("\n");
    bell.ring(false);
  }
}
