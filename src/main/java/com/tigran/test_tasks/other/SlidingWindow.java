package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/9/25
 * Time: 6:08 PM
 */
public class SlidingWindow {
    public static void main(String[] args) {
        //Maximum sum of a subarray of size 3 is: 9 -> 5 +1 + 3
        System.out.println(maxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }

    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Invalid input: k should be less than or equal to the array length.");
            return -1;
        }

        int windowSum = 0;
        // take the sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window by one element at a time
        for (int i = k; i < n; i++) {
            // Slide the window: subtract the element going out of the window
            // and add the element coming into the window
            windowSum += arr[i] - arr[i - k];
            // Update maxSum if the new window has a larger sum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
