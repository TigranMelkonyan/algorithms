package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 10/3/25
 * Time: 2:36 PM
 */
public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int curMax = nums[0];
        int curMin = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];

            // When x is negative, curMax and curMin will swap roles after multiplication
            if (x < 0) {
                int tmp = curMax;
                curMax = curMin;
                curMin = tmp;
            }

            // Either start fresh at x, or extend previous product
            curMax = Math.max(x, curMax * x);
            curMin = Math.min(x, curMin * x);

            ans = Math.max(ans, curMax);
        }
        
        return ans;
    }

    public static int maxProductBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                max = Math.max(max, product);
            }
        }

        return max;
    }

}
