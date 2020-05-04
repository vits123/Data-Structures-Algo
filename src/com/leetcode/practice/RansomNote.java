/*
   Leetcode 383 - Ransom Note: Hashmap approach
   Time Complexity - O(m)
   Space Complexity - O(n)
 */

package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> magM = new HashMap<>();
    for (char c : magazine.toCharArray()) {
      int newCount = magM.getOrDefault(c, 0) + 1;
      magM.put(c, newCount);
    }

    for (char c : ransomNote.toCharArray()) {
      int newCount = magM.getOrDefault(c, 0) - 1;
      if (newCount < 0) {
        return false;
      }
      magM.put(c, newCount);
    }

    return true;
  }

  public static void main(String[] args) {
    RansomNote rn = new RansomNote();
    boolean ans = rn.canConstruct(new String("aab"), new String("ab"));
    System.out.println(ans);
  }
}
