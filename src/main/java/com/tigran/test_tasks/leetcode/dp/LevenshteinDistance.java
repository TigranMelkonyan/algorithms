package com.tigran.test_tasks.leetcode.dp;

/**
 * Created by Tigran Melkonyan
 * Date: 1/31/25
 * Time: 1:11 PM
 */
// Problem: Convert one string to another using insert, delete, replace operations.
public class LevenshteinDistance {
    public static void main(String[] args) {
        System.out.println(editDistance("horse", "ros"));
    }

    public static int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
            }
        }
        return dp[m][n];
    }
}
