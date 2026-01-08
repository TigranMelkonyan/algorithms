package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 7/28/25
 * Time: 5:22 PM
 */
public class DifferenceArraySolution {
    public static void main(String[] args) {
        Arrays.stream(getModifiedArray(5, new int[][] {
            {1, 3, 10},
            {2, 5, 20},
            {3, 4, 30}
        })).forEach(System.out::println);
    }

    public static int[] getModifiedArray(int n, int[][] updates) {
        int[] diff = new int[n + 1];

        // Apply difference
        for (int[] upd : updates) {
            int l = upd[0], r = upd[1], val = upd[2];
            diff[l] += val;
            if (r + 1 < n) {
                diff[r + 1] -= val;
            }
        }

        int[] result = new int[n];
        result[0] = diff[0];

        //Make prefix sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + diff[i];
//            result[i] = result[i - 1] + diff[i]; or this way starting from index 1
            result[i] = sum;
        }

        return result;
    }
}
