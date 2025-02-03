package com.tigran.test_tasks.leetcode.dp;

/**
 * Created by Tigran Melkonyan
 * Date: 1/31/25
 * Time: 12:33 PM
 */

// Problem: Given N items, each with a weight and value, and a bag with max weight W, find the max value you can carry.
// We can take an item multiple times, similar to picking coins in coin change.
public class UnboundedKnapsack {

    public static void main(String[] args) {
        int[] values = {20, 5, 10};
        int[] weights = {5, 4, 3};
        int W = 10;
        System.out.println(unboundedKnapsack(W, weights, values, 3));
    }

    public static int unboundedKnapsack(int W, int[] weights, int[] values, int n) {
        int[] dp = new int[W + 1];

        for (int i = 0; i <= W; i++) {
            for (int j = 0; j < n; j++) {
                if (weights[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - weights[j]] + values[j]);
                }
            }
        }

        return dp[W];
    }
}
