package com.tigran.test_tasks.other.sort;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 2/15/25
 * Time: 2:03 PM
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 3, 4, 2};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
