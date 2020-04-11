/*
 * EPI page 16.12 - Longest Nondecreasing Subsequence using iterative algorithm 
 * Time complexity - O(n^2)
 *  Space complexity - O(n) for maxLength
 * 
 */

package com.leetcode.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestNonDecreasingSubSequenceDemo {

  public static int longestNondecreasingSubsequenceLength(List<Integer> A) {
    Integer[] maxLength = new Integer[A.size()];
    Arrays.fill(maxLength, 1); // all elements of maxLength are 1

    for (int i = 1; i < A.size(); ++i) {
      for (int j = 0; j < i; ++j) {
        if (A.get(i) >= A.get(j)) {
          maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
        }
      }
    }

    return Collections.max(List.of(maxLength));
  }

  public static void main(String[] args) {
    int maxLen = LongestNonDecreasingSubSequenceDemo
        .longestNondecreasingSubsequenceLength(List.of(0, 8, 4, 12, 2, 10, 6, 14, 1, 9));
    System.out.println("Length of longest non-decreasing subsequence is = " + maxLen);
  }

}
