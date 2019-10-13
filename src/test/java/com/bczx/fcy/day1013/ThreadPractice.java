package com.bczx.fcy.day1013;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPractice {

  private ExecutorService executorService;

  @Before
  public void setUp() throws Exception {
    executorService = Executors.newFixedThreadPool(1000);
  }

  @Test
  public void test() {
    for (int i = 0; i < 200; i++) {
      executorService.execute(new SingletonLazyRunner());
    }
  }
}
