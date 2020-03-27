/*
 * 
 * Leetcode prb 340 In this problem we use sliding window technique to maintain distinct character
 * count k Difficulty: hard
 * 
 */

package com.leetcode.practice;

import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringWithKDistinct {

  public static int lengthOfLongestSubstringKDistinct(String s, int k) {
    int n = s.length();
    if (n * k == 0)
      return 0;

    int l = 0;
    int r = 0;

    HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
    int max_len = 1;

    while (r < n) {
      hmap.put(s.charAt(r), r++);   //  {D:10,  O:9,  , C:8, E:11 } // L  O V   E L  E E  T     C O D E

      if (hmap.size() == k + 1) {
        // delete leftmost character

        int del_ix = Collections.min(hmap.values());
        hmap.remove(s.charAt(del_ix));

        l = del_ix + 1;
      }

      max_len = Math.max(max_len, r - l);

    }

    return max_len;

  }


  public static void main(String[] args) {
    int res = LongestSubstringWithKDistinct.lengthOfLongestSubstringKDistinct("LOVELEETCODE", 4);
    System.out.println(res);
  }

}
