package com.bczx.fcy.day3.two;

public class Game {

  private int[] rolls = new int[21];

  private int currentRoll = 0;

  public void roll(int i) {
    rolls[currentRoll ++] = i;
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
        score += normalScore(rollIndex);
        rollIndex += 2;
      }
    }
    return score;
  }

  private int strikeBonus(int rollIndex) {
    return rolls[rollIndex + 1] + rolls[rollIndex + 2];
  }

  boolean isaStrike(int rollIndex) {
    return rolls[rollIndex] == 10;
  }

  int normalScore(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1];
  }

  int spareBonus(int rollIndex) {
    return rolls[rollIndex + 2];
  }

  boolean isaSpare(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
  }
}
