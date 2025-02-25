package com.bczx.fcy.day905.two;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

  private Game g;

  @Before
  public void setUp() {
    g = new Game();
  }

  @Test
  public void testGetGame() {
    rollMany(20, 0);
    assertEquals(0, g.score());
  }

  @Test
  public void testAllOnes() {
    int n = 20;
    int pins = 1;
    rollMany(n, pins);
    assertEquals(20, g.score());
  }

  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }

  @Test
  public void testOneSpare() {
    rollSpare();
    g.roll(3);
    rollMany(17, 0);
    assertEquals(16, g.score());
  }

  private void rollSpare() {
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

  private void rollStrike() {
    g.roll(10);
  }

  @Test
  public void testPerfectGame() {
    rollMany(12, 10);
    assertEquals(300, g.score());
  }
}
