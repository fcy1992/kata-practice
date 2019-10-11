package com.bczx.fcy.day104;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPress implements KeyListener {

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    for (;;) {
      if (e.isAltDown()) {
        break;
      }
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {

  }
}
