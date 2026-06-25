package com.mrk.app.n169;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MajorityElementTest {

  @Test
  public void test1() {
    assertEquals(3, MajorityElement.majorityElement(new int[] { 3, 2, 3 }));
  }

  @Test
  public void test2() {
    assertEquals(2, MajorityElement.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
  }

  @Test
  public void test3() {
    assertEquals(3, MajorityElement.majorityElement(new int[] { 3, 3, 4 }));
  }
}
