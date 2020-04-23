package com.codeforces.solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class EugeneArray_1333C {

  static int mod = (int) 1e9 + 7;

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    StringBuilder sb = new StringBuilder();
    System.out.println("Take n");
    int n = sc.nextInt();
    long[] arr = new long[n + 1];

    System.out.println("Take array of size n");

    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    long last = 0;
    long ans = 0;
    long prefix = 0;

    HashMap<Long, Long> hm = new HashMap<>();
    hm.put(0L, 0L);
    for (int i = 1; i <= n; i++) {
      prefix += arr[i];
      if (arr[i] == 0) {
        last = i;
      } else {
        if (hm.containsKey(prefix)) {
          long temp = hm.get(prefix);
          last = Math.max(last, temp + 1);
        }
        ans += (i - last);
      }
      hm.put(prefix, (long) i);

    }

    System.out.println(ans);

  }
}


class FastReader {

  BufferedReader br;
  StringTokenizer st;

  public FastReader() {
    br = new BufferedReader(new InputStreamReader(System.in));
  }

  String next() {
    while (st == null || !st.hasMoreElements()) {
      try {
        st = new StringTokenizer(br.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return st.nextToken();
  }

  int nextInt() {
    return Integer.parseInt(next());
  }

  long nextLong() {
    return Long.parseLong(next());
  }

  double nextDouble() {
    return Double.parseDouble(next());
  }

  String nextLine() {
    String str = "";
    try {
      str = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return str;
  }


}
