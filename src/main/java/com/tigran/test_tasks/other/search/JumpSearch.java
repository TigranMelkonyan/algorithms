package com.tigran.test_tasks.other.search;

/**
 * Created by Tigran Melkonyan
 * Date: 2/14/25
 * Time: 4:32 PM
 */
public class JumpSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 5, 6, 4, 3, 2, 7}, 5));
    }

    public static int search(int[] arr, int target) {
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(blockSize, n) - 1] < target) {
            prev = blockSize;
            blockSize += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;
            }
        }

        for (int i = prev; i < Math.min(blockSize, n); i++) {
            if (arr[i] == target) {
                return i;  // Target found
            }
        }

        return -1;
    }
}
