package com.bczx.fcy.day1025;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

  private Game g;

  @Before
  public void setUp() throws Exception {
    g = new Game();
  }

  @Test
  public void testGetGame() {
    rollMan(20, 0);
    assertEquals(0, g.score());
  }

  @Test
  public void testAllOnes() {
    int n = 20;
    int pins = 1;
    rollMan(n, pins);
    assertEquals(20, g.score());
  }

  private void rollMan(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }

  @Test
  public void testOneSpare() {
    rollSpare();
    g.roll(3);
    rollMan(17, 0);
    assertEquals(16, g.score());
  }

  private void rollSpare() {
    g.roll(5);
    g.roll(5);
  }

  @Test
  public void testOneStrike() {
    g.roll(10);
    g.roll(3);
    g.roll(4);
    rollMan(16, 0);
    assertEquals(24, g.score());
  }

  @Test
  public void testPerfectGame() {
    rollMan(12, 10);
    assertEquals(300, g.score());
  }
}
