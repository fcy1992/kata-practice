package com.bczx.fcy.day1103;

interface Component {
  public void add(Component c);
  public void remove(Component c);
  public Component getChild(int i);
  public void operation();
}
