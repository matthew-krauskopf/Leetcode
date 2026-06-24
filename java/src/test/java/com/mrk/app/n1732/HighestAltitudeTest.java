package com.mrk.app.n1732;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HighestAltitudeTest {

  @Test()
  public void test1() {
    assertEquals(1, HighestAltitude.largestAltitude(new int[] { -5, 1, 5, 0, -7 }));
  }

  @Test()
  public void test2() {
    assertEquals(0, HighestAltitude.largestAltitude(new int[] { -4, -3, -2, -1, 4, 3, 2 }));
  }
}
