package com.mrk.app.n3020;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxPowerSubsetTest {

  @Test()
  public void test1() {
    assertEquals(3, MaxPowerSubset.maximumLength(new int[] { 5, 4, 1, 2, 2 }));
  }

  @Test()
  public void test2() {
    assertEquals(1, MaxPowerSubset.maximumLength(new int[] { 1, 3, 2, 4 }));
  }

  @Test()
  public void test3() {
    assertEquals(1, MaxPowerSubset.maximumLength(new int[] { 1, 1 }));
  }
}
