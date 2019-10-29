package com.bczx.fcy.day1026;

import java.util.EventListener;

interface BellEventListener extends EventListener {
  void heardBell(RingEvent e);
}
