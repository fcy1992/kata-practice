package com.bczx.fcy.day8.three;

public class Game {

  private int[] rolls = new int[21];

  private int currentRoll = 0;

  public void roll(int pins) {
    rolls[currentRoll ++] = pins;
  }

  public int score() {
    int score = 0;
    int rollIndex = 0;
    for (int i = 0; i < 10; i++) {
      if (isaSpare(rollIndex)) {
        score += spareBonus(rollIndex);
        rollIndex += 2;
      } else if (isaStrike(rollIndex)) {
        score += strikeBonus(rollIndex);
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

  int strikeBonus(int rollIndex) {
    return 10 + rolls[rollIndex + 1] + rolls[rollIndex + 2];
  }

  boolean isaStrike(int rollIndex) {
    return rolls[rollIndex] == 10;
  }

  int spareBonus(int rollIndex) {
    return 10 + rolls[rollIndex + 2];
  }

  boolean isaSpare(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
  }
}
