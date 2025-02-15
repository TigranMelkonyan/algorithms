package com.tigran.test_tasks.other.sort;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 2/15/25
 * Time: 1:26 PM
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 3, 4, 2};
        sort(arr);
        
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void sort(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
