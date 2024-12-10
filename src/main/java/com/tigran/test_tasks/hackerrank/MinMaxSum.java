package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/10/24
 * Time: 4:41 PM
 */
public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7, 69, 2, 221, 8974);
        int min = arr.getFirst();
        int max = arr.getFirst();
        int sum = 0;

        for (int i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
            sum += i;
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}
