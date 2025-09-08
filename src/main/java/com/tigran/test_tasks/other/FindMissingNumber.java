package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 4/27/25
 * Time: 10:00 PM
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{3, 7, 1, 2, 8, 4, 5}));
        System.out.println(findMissingNumber(new int[]{1, 5, 7, 9}));
    }

    public static int findMissingNumber(int[] arr) {
        int res = 0;
        Arrays.sort(arr);

        int expectedDiff = Integer.MAX_VALUE;
        
        for (int i = 1; i < arr.length; i++) {
            expectedDiff = Math.min(expectedDiff, arr[i] - arr[i - 1]);
        }

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff != expectedDiff) {
                res = arr[i - 1] + expectedDiff;
            }
        }
        return res;
    }
}
