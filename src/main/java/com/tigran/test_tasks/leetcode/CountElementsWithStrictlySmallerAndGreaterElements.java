package com.tigran.test_tasks.leetcode;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 6/4/25
 * Time: 3:06 PM
 */
public class CountElementsWithStrictlySmallerAndGreaterElements {
    public static void main(String[] args) {
        System.out.println(countElements(new int[]{11, 7, 2, 15}));
        System.out.println(countElements(new int[]{-3, 3, 3, 15}));
    }

    public static int countElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        int l = nums[0];
        int r = nums[n - 1];

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > l && nums[i] < r) {
                res++;
            }
        }

        return res;
    }
}
