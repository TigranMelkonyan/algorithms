package com.tigran.test_tasks.leetcode.dp;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 1/31/25
 * Time: 1:10 PM
 */

// Problem: Given an array, find the length of the longest increasing subsequence.
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLIS = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }
        return maxLIS;
    }
}
