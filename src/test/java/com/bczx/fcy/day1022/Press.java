package com.bczx.fcy.day1022;

import java.util.HashMap;
import java.util.Map;

public class Press<T> implements Observable{

  public T getBreakingNews() {
    return breakingNews;
  }

  public void setBreakingNews(T breakingNews) {
    this.breakingNews = breakingNews;
    notifyObserver();
  }

  private T breakingNews;

  private Map<String, AbstractObserver> observers = new HashMap<>();

  @Override
  public void registerObserver(AbstractObserver observer) {
    if (observers.containsKey(observer.getObserverName())) {
      return;
    }
    observers.put(observer.getObserverName(), observer);
  }

  @Override
  public void removeObserver(AbstractObserver observer) {
    if (observers.containsKey(observer.getObserverName())) {
      observers.remove(observer.getObserverName());
    }
  }

  @Override
  public void notifyObserver() {
    if (observers.isEmpty()) {
      return;
    }
    observers.forEach((observerName, observer) -> {
      System.out.println(observerName + " is running");
      observer.getNews(getBreakingNews());
      System.out.println("\n");
    });
  }
}
