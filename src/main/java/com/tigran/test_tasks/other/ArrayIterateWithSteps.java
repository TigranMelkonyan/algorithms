package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/7/25
 * Time: 4:41 PM
 */
public class ArrayIterateWithSteps {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int step = 4;

        for (int i = 0; i < step; i++) {
            for (int j = i; j < arr.length; j += step) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
