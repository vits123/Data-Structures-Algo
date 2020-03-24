/*
  abcabcbb -> 3
  Time complexity - O(n)
  Space Complexity - O(n)
  For more concise solution look into Sliding Window technique using Hashset and Hashmap  


*/

package com.leetcode.practice;

public class LongestSubStr {

  static final int NO_OF_CHARS = 256;


  public static int lengthOfLongestSubString(String s) {
    int n = s.length();
    int cur_len = 1;
    int max_len = 1;
    int prv_idx;

    int visited[] = new int[NO_OF_CHARS]; // 0-255

    for (int i = 0; i < NO_OF_CHARS; i++) {
      visited[i] = -1;
    }

    visited[s.charAt(0)] = 0;

    for (int i = 1; i < n; i++) {
      prv_idx = visited[s.charAt(i)];

      if (prv_idx == -1 || i - cur_len > prv_idx) {  // if(-1 ==-1 || 0 > -1)
        cur_len++;
      } else {
        if (cur_len > max_len)
          max_len = cur_len;

        cur_len = i - prv_idx;
      }

      visited[s.charAt(i)] = i;

    }

    if (cur_len > max_len)
      max_len = cur_len;

    return max_len;
  }



  public static void main(String[] args) {
    int len = lengthOfLongestSubString("pwwkew");
    System.out.println("Out = "+len);


  }

}
