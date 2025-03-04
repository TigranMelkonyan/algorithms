package com.tigran.test_tasks.leetcode.dp;

/**
 * Created by Tigran Melkonyan
 * Date: 3/3/25
 * Time: 5:39 PM
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairsRecursive(4));
        System.out.println(climbStairs(4));
    }

    public static int climbStairsRecursive(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
