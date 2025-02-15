package com.tigran.test_tasks.other.search;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 2/14/25
 * Time: 4:10 PM
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 5, 6, 4, 3, 2, 7}, 5));
    }

    public static int search(int[] arr, int target) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}