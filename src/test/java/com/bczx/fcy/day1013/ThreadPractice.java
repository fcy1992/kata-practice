package com.bczx.fcy.day1013;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.*;

public class ThreadPractice {

  private ExecutorService executorService;

  @Before
  public void setUp() throws Exception {
    executorService = new ThreadPoolExecutor(20, 100, 0L,
            TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
  }

  @Test
  public void test() {
    for (int i = 0; i < 200; i++) {
      executorService.execute(new SingletonLazyRunner());
    }
  }
}
