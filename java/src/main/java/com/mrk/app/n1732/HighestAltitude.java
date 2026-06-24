package com.mrk.app.n1732;

public class HighestAltitude {

  public static int largestAltitude(int[] gain) {
    int current = 0;
    int max = 0;

    for (int num : gain) {
      current += num;
      max = max > current ? max : current;
    }

    return max;
  }
}
