/*
 * Max subarray sum using Greedy approach
 * Time - O(N)
 * Space - O(1)
 * 
 */


package com.leetcode.practice;

public class MaxSubarraySumPrb {
  
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int cursum = nums[0], maxsum = nums[0];
    
    for(int i = 1; i<n; i++) {
      cursum = Math.max(nums[i], cursum + nums[i]);
      maxsum = Math.max(maxsum, cursum);
    }
    return maxsum;
  }
  
  public static void main(String[] args) {
    MaxSubarraySumPrb sum1 = new MaxSubarraySumPrb();
    int maxsum = sum1.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
    System.out.println("Maxsum is = "+maxsum);
  }

}
