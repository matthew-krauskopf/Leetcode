package com.mrk.app.n1967;

public class Substrings {

  public static int numOfStrings(String[] patterns, String word) {
    int ans = 0;
    for (String pattern : patterns) {
      if (word.contains(pattern))
        ans++;
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(numOfStrings(new String[] { "a", "abc", "bc", "d" }, "abc"));
  }
}
