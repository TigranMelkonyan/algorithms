package com.tigran.test_tasks.leetcode.dp;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 1/31/25
 * Time: 1:16 PM
 */

// Problem: Determine if an array can be partitioned into two subsets with equal sum.
public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums)); 
    }

    public static boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[target];
    }
}
