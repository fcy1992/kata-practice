package com.bczx.fcy.day106;

import com.bczx.fcy.day105.SingletonHunggerRunner;
import com.bczx.fcy.day105.SingletonLazy;
import com.bczx.fcy.day105.SingletonLazyRunner;
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
  public void testSingletonInnerClass() {
    for (int i = 0; i < 100; i++) {
      executorService.execute(new SingletonInnerClassRunner());
    }
  }

  @Test
  public void testHuggerSingleton() {
    for (int i = 0; i < 100; i++) {
      executorService.execute(new SingletonEnumRunner());
    }
  }
}
