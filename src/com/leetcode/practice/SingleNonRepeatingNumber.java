package com.leetcode.practice;

import java.util.Arrays;
import java.lang.Math;;

public class SingleNonRepeatingNumber {

  public int singleNumber(int[] nums) {
    return Arrays.stream(nums).reduce(0, (a,b) -> a^b);
  }
  
  public static void main(String[] args) {
    SingleNonRepeatingNumber s=new SingleNonRepeatingNumber();
    int ans = s.singleNumber(new int[] {4, 1, 2, 1, 2});
    System.out.println("Non-repeating no in array is = "+ans );
  }
  
  
  
}



