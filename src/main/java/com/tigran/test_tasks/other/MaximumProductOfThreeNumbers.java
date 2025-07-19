package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 7/19/25
 * Time: 8:55 PM
 */
public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-10, -10, 1, 3, 2}));
        System.out.println(maximumProduct(new int[]{1, 2, 3}));
        System.out.println(maximumProduct(new int[]{-4, -3, -2, -1, 60}));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int case1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int case2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(case1, case2);
    }
}
