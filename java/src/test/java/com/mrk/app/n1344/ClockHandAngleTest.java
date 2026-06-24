package com.mrk.app.n1344;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClockHandAngleTest {

  @Test()
  public void test1() {
    assertEquals(165, ClockHandAngle.angleClock(12, 30));
  }

  @Test()
  public void test2() {
    assertEquals(75, ClockHandAngle.angleClock(3, 30));
  }

  @Test()
  public void test3() {
    assertEquals(7.5, ClockHandAngle.angleClock(3, 15));
  }

  @Test()
  public void test4() {
    assertEquals(155, ClockHandAngle.angleClock(4, 50));
  }

  @Test()
  public void test5() {
    assertEquals(0, ClockHandAngle.angleClock(12, 0));
  }
}
