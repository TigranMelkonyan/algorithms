package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/7/25
 * Time: 4:41 PM
 */
public class LimitArrayStepsExceed {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0;
        int step = 4;

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i] + " ");

            // Update the index using modular arithmetic
            i = (i + step) % arr.length;
        }
    }
}
