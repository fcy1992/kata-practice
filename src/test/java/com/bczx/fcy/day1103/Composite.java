package com.bczx.fcy.day1103;

import java.util.ArrayList;

class Composite implements Component {

  private ArrayList<Component> children=new ArrayList<>();

  public void add(Component c) {
    children.add(c);
  }

  public void remove(Component c) {
    children.remove(c);
  }

  public Component getChild(int i) {
    return children.get(i);
  }

  public void operation() {
    for(Object obj:children)
    {
      ((Component)obj).operation();
    }
  }
}
