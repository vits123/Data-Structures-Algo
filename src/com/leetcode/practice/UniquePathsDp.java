/*
   Leetcode 62 - Unique Paths
   Time Complexity - O(M x N)
   Space Complexity - O(M x N)
   Use Dynamic programming to overcome overflow and pass all tests
   Asked By - Amazon, Google, Goldman Sachs, Mathworks, Facebook, Walmart labs, Microsoft
 */

package com.leetcode.practice;

import java.util.Arrays;

public class UniquePathsDp {

  // m is column and n is row
  public int uniquePath(int m, int n) {
    int[][] d = new int[m][n];

    for (int[] arr : d) {
      Arrays.fill(arr, 1);
    }

    for (int col = 1; col < m; ++col) {
      for (int row = 1; row < n; ++row) {
        d[col][row] = d[col - 1][row] + d[col][row - 1];
      }
    }
    return d[m - 1][n - 1];
  }

  public static void main(String[] args) {
    UniquePathsDp dpObject = new UniquePathsDp();
    int result = dpObject.uniquePath(7, 3);
    System.out.println("Total unique paths = " + result);
  }
}
