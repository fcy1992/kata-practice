package com.bczx.fcy.day1104;

class Context {
  private Strategy strategy;

  public Strategy getStrategy() {
    return strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy=strategy;
  }

  public void strategyMethod() {
    strategy.strategyMethod();
  }
}
