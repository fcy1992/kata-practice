package com.bczx.fcy.tues.two;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowingGameTest {

  @Test
  public void testGetGame() {
    int n = 20;
    int pins = 0;
    rollMany(n, pins);
    assertEquals(0, g.score());
  }

  void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }

  private Game g;

  @Before
  public void getGame() {
    g = new Game();
  }

  @Test
  public void testAllOnes() {
    rollMany(20, 1);
    assertEquals(20, g.score());
  }

  @Test
  public void testOneSpare() {
    rollSpare();
    g.roll(3);
    rollMany(17, 0);
    assertEquals(16, g.score());
  }

  void rollSpare() {
    g.roll(5);
    g.roll(5);
  }

  @Test
  public void testOneStrike() {
    rollStrike();
    g.roll(3);
    g.roll(4);
    rollMany(16, 0);
    assertEquals(24, g.score());
  }

  void rollStrike() {
    g.roll(10);
  }

  @Test
  public void testPerfectGame() {
    rollMany(12, 10);
    assertEquals(300, g.score());
  }
}
