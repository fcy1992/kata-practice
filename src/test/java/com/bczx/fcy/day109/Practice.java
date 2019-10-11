package com.bczx.fcy.day109;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Practice {

  @Test
  public void testRandom() {
//    int[] figures = new int[25];
    List<Integer> figures = new ArrayList<>();
    for (int i = 0; i < 25; i++) {
      double number = Math.random() * 100;
      String str = String.valueOf(number);
      String[] numberArray = str.split("\\.");
      int intFigure = Integer.parseInt(numberArray[0]);
      figures.add(intFigure);
      System.out.println(intFigure);
    }
    System.out.println();
    List<Integer> gt = new ArrayList<>();
    List<Integer> lt = new ArrayList<>();
    List<Integer> eq = new ArrayList<>();

    for (int i = 0; i < 24; i++) {
      Integer integer = figures.get(i);
      if (integer > figures.get(i + 1)) {
        gt.add(integer);
      } else if (integer < figures.get(i + 1)) {
        lt.add(integer);
      } else if (Objects.equals(integer, figures.get(i + 1))) {
        eq.add(integer);
      }
    }

    gt.forEach(figure -> System.out.println(figure));
    System.out.println();
    lt.forEach(figure -> System.out.println(figure));
    System.out.println();
    eq.forEach(figure -> System.out.println(figure));
  }

}
