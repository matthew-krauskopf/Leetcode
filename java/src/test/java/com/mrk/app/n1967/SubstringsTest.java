package com.mrk.app.n1967;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubstringsTest {

  @Test
  public void test1() {
    assertEquals(3, Substrings.numOfStrings(new String[] { "a", "abc", "bc", "d" }, "abc"));
  }

  @Test
  public void test2() {
    assertEquals(2, Substrings.numOfStrings(new String[] { "a", "b", "c" }, "aaaaabbbbb"));
  }

  @Test
  public void test3() {
    assertEquals(3, Substrings.numOfStrings(new String[] { "a", "a", "a" }, "ab"));
  }
}
