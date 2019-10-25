package com.bczx.fcy.day1022;

public class Bob<T> extends AbstractObserver<T> {

  @Override
  public void getNews(T t) {
    String data = (String) t;
    System.out.println("I'm " + getObserverName() + ", I had subscribed a newspaper in this press");
    System.out.println("Latest News:" + t);
  }

}
