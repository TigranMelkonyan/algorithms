package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 10/1/25
 * Time: 5:43 PM
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Arrays.stream(productExceptSelf(new int[]{1, 2, 3, 4})).forEach(System.out::println);
    }

    //suffix is a running product of all numbers to the right of the current index.
    //and prefix respectively left side that already get using prefix sum technique 
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
