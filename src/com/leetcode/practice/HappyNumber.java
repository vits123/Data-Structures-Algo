
/*
 * Leetcode 202 Floyd cycle finding -Best approach, if we use Hashset then space required is O(log
 * n) Time - O(log n) Space- O(1)
 */


package com.leetcode.practice;

public class HappyNumber {


  public boolean isHappy(int n) {
    int slowRunner = n;
    int fastRunner = getNext(n);

    while (fastRunner != 1 && slowRunner != fastRunner) {
      slowRunner = getNext(slowRunner);
      fastRunner = getNext(getNext(fastRunner));
    }

    return fastRunner == 1;
  }

  private int getNext(int n) {
    int sum = 0;

    while (n > 0) {
      int d = n % 10;
      n = n / 10;
      sum += d * d;

    }
    return sum;
  }


  public static void main(String[] args) {
    HappyNumber hn = new HappyNumber();
    System.out.println(hn.isHappy(134));
  }


}
