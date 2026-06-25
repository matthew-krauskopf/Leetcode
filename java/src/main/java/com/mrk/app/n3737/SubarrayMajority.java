package com.mrk.app.n3737;

public class SubarrayMajority {

  public static int countInstances(int[] nums, int l, int r, int target) {
    int count = 0;
    for (int i = l; i <= r; i++) {
      if (nums[i] == target) {
        count++;
      }
    }

    return count;
  }

  public static int countMajoritySubarrays(int[] nums, int target) {
    int ans = 0;
    int numsL = nums.length;
    for (int i = 0; i < numsL; i++) {
      int count = 0;
      for (int j = i; j < numsL; j++) {
        count += (nums[j] == target) ? 1 : -1;
        if (count > 0)
          ans++;
      }
    }
    return ans;
  }

  public static int countMajoritySubarrays2(int[] nums, int target) {
    // Idea: Start with whole array. Make shrinking window. That way total count is
    // only computed once
    int ans = 0;
    int numsSize = nums.length;
    int prev = 0;
    int currentCount = countInstances(nums, 0, (numsSize - 1), target);

    for (int l = 0; l < nums.length; l++) {
      if (l != 0 && nums[l - 1] == target)
        currentCount--;
      prev = currentCount;
      int runningCount = currentCount;

      for (int r = numsSize - 1; r >= l; r--) {
        // R sits right 1 of rest of array
        if (runningCount > ((r - l) + 1) / 2)
          ans++;
        if (nums[r] == target)
          runningCount--;
        if (runningCount == 0)
          break;
      }
      currentCount = prev;
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(countMajoritySubarrays(new int[] { 1, 2, 2, 3 }, 2));
  }
}
