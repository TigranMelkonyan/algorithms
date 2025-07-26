package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 7/26/25
 * Time: 6:24 PM
 */
public class SquareOfASortedArray {
    public static void main(String[] args) {
        int[] res = squareOfArray(new int[]{-4, -1, 0, 3, 10});
        Arrays.stream(res).forEach(System.out::println);
        System.out.println();
        res = squareOfArray(new int[]{-10, -1, 0, 3, 5});
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] squareOfArray(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                res[index] = leftSquare;
                left++;
            } else {
                res[index] = rightSquare;
                right--;
            }

            index--;
        }

        return res;
    }
}
