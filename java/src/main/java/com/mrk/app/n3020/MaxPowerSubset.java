package com.mrk.app.n3020;

import java.util.HashMap;
import java.util.Map;

public class MaxPowerSubset {

  private static Map<Integer, Integer> getCount(int[] nums) {
    Map<Integer, Integer> m = new HashMap<>();
    for (int num : nums) {
      m.put(num, m.getOrDefault(num, 0) + 1);
    }
    return m;
  }

  private static int checkLength(Map<Integer, Integer> countMap, int target) {
    int count = countMap.getOrDefault(target, 0);
    if (count < 2)
      return count;
    else
      return 1 + checkLength(countMap, target * target);
  }

  private static int calc(int i) {
    return (i > 1 && i % 2 == 0) ? i - 1 : i;
  }

  public static int maximumLength(int[] nums) {
    Map<Integer, Integer> countMap = getCount(nums);
    int max = 0;

    // Fringe cases 0 and 1
    max = Math.max(max, calc(countMap.getOrDefault(0, 0)));
    max = Math.max(max, calc(countMap.getOrDefault(1, 0)));

    for (int cur : countMap.keySet()) {
      if (cur < 2)
        continue;
      max = Math.max(max, (2 * checkLength(countMap, cur)) - 1);
    }

    return max;
  }
}
