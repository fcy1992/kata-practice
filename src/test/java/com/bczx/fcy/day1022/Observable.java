package com.bczx.fcy.day1022;

public interface Observable {

  void registerObserver(AbstractObserver observer);

  void removeObserver(AbstractObserver observer);

  void notifyObserver();
}
