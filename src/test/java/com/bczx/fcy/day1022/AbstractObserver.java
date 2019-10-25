package com.bczx.fcy.day1022;

public class AbstractObserver<T> implements Observer<T> {

  public String getObserverName() {
    return observerName;
  }

  public void setObserverName(String observerName) {
    this.observerName = observerName;
  }

  private String observerName;

  @Override
  public void getNews(T t) {

  }
}
