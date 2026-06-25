package com.mrk.app.n169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public static int majorityElement2(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int half = nums.length / 2;

    for (int n : nums) {
      int cur = map.getOrDefault(n, 0) + 1;
      if (cur > half)
        return n;
      map.put(n, cur);
    }

    // Based on constraints, impossible
    return -1;
  }

  public static int majorityElement(int[] nums) {
    /*
     * Moore Voting Algorithm. Running count of majority leader. Set to new leader
     * when count is at 0.
     * Increment if current matches "leader". Decrement if current differs
     */
    int candidate = nums[0];
    int total = 0;

    for (int n : nums) {
      if (total == 0)
        candidate = n;
      total += n == candidate ? 1 : -1;
    }

    // Based on constraints, impossible
    return candidate;
  }

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[] { 3, 2, 3 }));
  }
}
