package com.bczx.fcy.day8.one;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FebonacciTest {

  double first;

  double second;

  int calculateTimes;

  @Before
  public void setup() {
    first = 2.0;
    second = 3.0;
    calculateTimes = 100;
  }

  @Test
  public void testFibonacciRecursion() {
    Febonacci f = new Febonacci();
    List<Integer> test = Arrays.asList(0,1);
    test.forEach((Integer n) -> {
      if (n == 0) {
        Long start = System.currentTimeMillis();
        double febonacci = f.dealFebonacciWithArray(first, second,calculateTimes);
        System.out.println(febonacci);
        System.out.println("dealFebonacciWithArray");
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();
      } else {
        Long start = System.currentTimeMillis();
        double febonacci = f.febonacciPlus(first, second, calculateTimes);
        System.out.println(febonacci);
        System.out.println("febonacciPlus");
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();

      }
    });
  }

//  private Long febonacci(Long n) {
//    if (n <= 1) {
//      return n;
//    }
//    return febonacci(n - 1) + febonacci(n - 2);
//  }


}
