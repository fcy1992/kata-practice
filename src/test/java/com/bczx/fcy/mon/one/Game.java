package com.bczx.fcy.mon.one;

public class Game {

  private int[] rolls = new int[21];

  private int currentRoll = 0;

  public void roll(int pins) {
    rolls[currentRoll ++] = pins;
  }

  public int score() {
    int score = 0;
    int rollIndex = 0;
    for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
      if (isaSpare(rollIndex)) {
        score += 10 + spareBonus(rollIndex);
        rollIndex += 2;
      } else if (isaStrike(rolls[rollIndex])) {
        score += 10 + strikeBonus(rollIndex);
        rollIndex += 1;
      } else {
        score += normalScore(rollIndex);
        rollIndex += 2;
      }
    }
    return score;
  }

  int normalScore(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1];
  }

  private int strikeBonus(int rollIndex) {
    return rolls[rollIndex + 1] + rolls[rollIndex + 2];
  }

  int spareBonus(int rollIndex) {
    return rolls[rollIndex + 2];
  }

  boolean isaStrike(int roll) {
    return roll == 10;
  }

  private boolean isaSpare(int i) {
    return rolls[i] + rolls[i + 1] == 10;
  }
}
