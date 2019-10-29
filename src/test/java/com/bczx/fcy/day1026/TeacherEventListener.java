package com.bczx.fcy.day1026;

class TeacherEventListener implements BellEventListener
{
  public void heardBell(RingEvent e)
  {
    if(e.getSound())
    {
      System.out.println("老师上课了...");
    }
    else
    {
      System.out.println("老师下课了...");
    }
  }
}
