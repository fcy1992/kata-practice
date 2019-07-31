package com.bczx.fcy.wed.one;

public class Game {

  private int[] rolls = new int[21];

  private int currentRoll = 0;

  public void roll(int pins) {
    rolls[currentRoll ++] = pins;
  }

  public int score() {
    int score = 0;
    int rollIndex = 0;
    for (int frame = 0; frame < 10; frame++) {
      if (isaSpare(rollIndex)) {
        score += 10 + spareBonus(rollIndex);
        rollIndex += 2;
      } else if (isaStrike(rollIndex)) {
        score += 10 + strikeBonus(rollIndex);
        rollIndex += 1;
      } else {
        score += normalBonus(rollIndex);
        rollIndex += 2;
      }
    }
    return score;
  }

  int normalBonus(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1];
  }

  private int strikeBonus(int rollIndex) {
    return rolls[rollIndex + 1] + rolls[rollIndex + 2];
  }

  int spareBonus(int rollIndex) {
    return rolls[rollIndex + 2];
  }

  boolean isaStrike(int rollIndex) {
    return rolls[rollIndex] == 10;
  }

  boolean isaSpare(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
  }
}
