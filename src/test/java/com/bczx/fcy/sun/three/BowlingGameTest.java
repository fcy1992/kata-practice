package com.bczx.fcy.sun.three;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
  private Game g;

  @Before
  public void getGame() {
    g = new Game();
  }

  @Test
  public void testGetGame() {
    rollMany(20, 0);
    assertEquals(0, g.score());
  }

  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }

  @Test
  public void testAllOnes() {
    rollMany(20, 1);
    assertEquals(20, g.score());
  }

  @Test
  public void testOneSpare() {
    rollSpare(); // spare
    g.roll(3);
    rollMany(17,1);
    assertEquals(33, g.score());
  }

  private void rollSpare() {
    g.roll(5);
    g.roll(5);
  }

  private void rollStrike() {
    g.roll(10);
  }

  @Test
  public void testOneStrike() {
    rollStrike();
    g.roll(3);
    g.roll(4);
    rollMany(16,0);
    assertEquals(24, g.score());
  }
}
