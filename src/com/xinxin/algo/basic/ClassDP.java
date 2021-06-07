package com.xinxin.algo.basic;

public class ClassDP {
    public static void main(String[] args) {
        int[] arr = {0, 2,4,7, 10};
        int res = minCutsWood(arr, 10);
        System.out.println(res);
//        System.out.println(res);
    }
    //   [i, k] [k, j] + presum[i:j]
    //   0 2  4  7 10
    // 0 0 0  4
    // 2   0
    // 4      0
    // 7
    // 10
    public static int minCutsWood(int[] arr, int len) {

        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int l = 3; l <= n; ++ l) {
            for (int i = 0; i + l - 1 < n; ++ i) {
                int j = i + l - 1;
                dp[i][j] = 0x3FFFFFFF;
                for (int k = i + 1; k < j; ++ k) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + arr[j] - arr[i]);
                }
            }
        }
        return dp[0][n - 1];
    }

//    i i + 1, j - 1, j
//    i+1, j-1
//    a  b  a  b
// a  0  1  0  1
// b     0  1  0
// a        0  1
// b           0

    public static int minCuts(String s) {

        int n = s.length();
        int[][] dp = new int[n][n];
        for (int len  = 1; len <= n; ++ len) {
            for (int i = 0; i < n - len + 1; ++ i) {
                // i, i + len - 1
                int j = i + len - 1;

                if (len == 1) {dp[i][j] = 0;}
                else {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                        dp[i][j] = Math.min(dp[i + 1][j - 1] + 2, dp[i][j]);
                    }
                }

            }
        }

        return dp[0][n - 1];
    }
}
