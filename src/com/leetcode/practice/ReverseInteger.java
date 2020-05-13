/*
   Leetcode 7: Reverse Integer
   Time complexity - O(log(x))
   Space Complexity - O(1)

   Reversed integer should be between int range -2147483648 to 2147483647 which can be also written as -2^31 to 2^31 - 1 which means
   2^31 = 2,147,483,648 which causes overflow
 */

package com.leetcode.practice;

public class ReverseInteger {

  public int reverse(int x) {
    int result = 0;
    while (x != 0) {
      int lastDigit = x % 10;
      int newResult = result * 10 + lastDigit;
      if ((newResult - lastDigit) / 10 != result) {
        return 0;
      }
      x /= 10;
      result = newResult;

    }
    return result;
  }

  public static void main(String[] args) {
    ReverseInteger rint = new ReverseInteger();
    int output = rint.reverse(2147483569);
    System.out.println(output);
  }
}
