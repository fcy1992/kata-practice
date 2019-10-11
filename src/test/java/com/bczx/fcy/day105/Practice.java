package com.bczx.fcy.day105;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice {

  private ExecutorService executorService;

  @Before
  public void setUp() throws Exception {
    executorService = Executors.newFixedThreadPool(1000);
  }

  @Test
  public void testLazySingleton() {
    for (int j = 0; j < 100; j++) {
      for (int i = 0; i < 100; i++) {
//        System.out.println("thread-" + i);
        executorService.execute(new SingletonLazyRunner());
      }
      try {
        Thread.sleep(20);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      SingletonLazy.getSingletonLazy().printInitCount();
    }
  }

  @Test
  public void testHuggerSingleton() {
    for (int i = 0; i < 100; i++) {
      System.out.println("thread-" + i);
      executorService.execute(new SingletonHunggerRunner());
    }
  }
}
