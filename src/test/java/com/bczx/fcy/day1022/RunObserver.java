package com.bczx.fcy.day1022;

import org.junit.Test;

public class RunObserver {

  @Test
  public void testObserver() throws InterruptedException {
    Press<String> press = new Press<>();
    Bob<String> bob = new Bob<>();
    bob.setObserverName("Bob");
    press.registerObserver(bob);
    Alice<String> alice = new Alice<>();
    alice.setObserverName("Alice");
    press.registerObserver(alice);
//    press.setBreakingNews("China has become the most powerful country of the world!!!");
    for (int i = 0; i < 10; i++) {
      press.setBreakingNews(String.valueOf(Math.random()));
      Thread.sleep(1000);
    }
  }
}
