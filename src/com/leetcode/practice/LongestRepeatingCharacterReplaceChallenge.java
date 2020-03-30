/*
 * 
 * - Leetcode prb 424 -
 * 
 */


package com.leetcode.practice;


public class LongestRepeatingCharacterReplaceChallenge {


  public static int characterReplacement(String s, int k) {
    int N = s.length();
    int left = 0;
    int max_count = 0;
    int max_length = 0;
    int[] char_counts = new int[26];

    for (int right = 0; right < N; right++) {
      char_counts[s.charAt(right) - 'A']++;
      int cur_char_count = char_counts[s.charAt(right) - 'A'];
      max_count = Math.max(max_count, cur_char_count);

      while (right - left - max_count + 1 > k) {
        char_counts[s.charAt(left) - 'A']--;
        left++;
      }

      max_length = Math.max(max_length, right - left + 1);
    }

    return max_length;
  }



  public static void main(String[] args) {
    int max_length = LongestRepeatingCharacterReplaceChallenge.characterReplacement("AABABBA", 1);
    System.out.println(max_length);
  }


}
