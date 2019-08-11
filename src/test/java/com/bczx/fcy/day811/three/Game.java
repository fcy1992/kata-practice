package com.bczx.fcy.day811.three;

public class Game {

  private int[] rolls = new int[21];

  private int currentRoll;

  public void roll(int i) {
    rolls[currentRoll ++] = i;
  }

  public int score() {
    int score = 0;
    int rollIndex = 0;
    for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
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

  private int normalScore(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1];
  }

  private int strikeBonus(int rollIndex) {
    return 10 + rolls[rollIndex + 1] + rolls[rollIndex + 2];
  }

  private boolean isaStrike(int rollIndex) {
    return rolls[rollIndex] == 10;
  }

  private int spareBonus(int rollIndex) {
    return 10 + rolls[rollIndex + 2];
  }

  private boolean isaSpare(int rollIndex) {
    return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
  }
}
