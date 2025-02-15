package com.tigran.test_tasks.other.sort;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 2/15/25
 * Time: 2:16 PM
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 3, 4, 2};
        sort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
