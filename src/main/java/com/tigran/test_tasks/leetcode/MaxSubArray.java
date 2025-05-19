package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 5/19/25
 * Time: 3:20 PM
 */
class MaxSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));  //[4, -1, 2, 1]
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];  // This will hold the maximum sum
        int maxEndingHere = nums[0];  // This will hold the sum of the subarray ending at the current index

        for (int i = 1; i < nums.length; i++) {
            // Update the sum of the current subarray (either start new subarray or continue the current one)
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);

            // Update the global maximum sum if needed
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

