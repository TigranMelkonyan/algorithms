package com.tigran.test_tasks.other.search;

/**
 * Created by Tigran Melkonyan
 * Date: 2/14/25
 * Time: 4:08 PM
 */
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{5, 2, 1, 3, 6, 7}, 1));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
