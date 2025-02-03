package com.tigran.test_tasks.leetcode.dp;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 1/31/25
 * Time: 1:02 PM
 */

// Problem: Given an array where each element represents the max jumps you can make, find the minimum jumps needed to reach the last index.
// Similar to coin change: We check previous positions to determine the fewest jumps.
public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(minJumps(arr));
    }

    public static int minJumps(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= arr[i] && i + j < n; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
        return dp[n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1];
    }
}
