package com.bczx.fcy.day8.one;

public class Febonacci {
  
  public double dealFebonacciWithArray(double first, double second, int calculateTimes) {
    Double[] fib = new Double[calculateTimes + 1];
    if (calculateTimes == 0) {
      return first + second;
    }
    fib[0] = first;
    fib[1] = second;
    for (int i = 1; i < calculateTimes; i++) {
      fib[i + 1] = fib[i - 1] + fib[i];
    }
    return fib[calculateTimes - 1] + fib[calculateTimes];
  }

  public double febonacciPlus(double first, double second, int calculateTimes) {
    if (calculateTimes == 0) {
      return first + second;
    }
    Double febonacci = first + second;
    for (int i = 1; i < calculateTimes; i++) {
      Double last = first;
      second= febonacci;
      first = febonacci - last;
      febonacci = first + second;
    }
    return febonacci;
  }
}
