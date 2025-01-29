package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/27/25
 * Time: 11:03 AM
 */
public class LarrysArray {
    public static void main(String[] args) {
        System.out.println(larrysArray(new ArrayList<>(List.of(1, 2, 6, 5, 4, 3))));
        System.out.println(larrysArray(new ArrayList<>(List.of(3, 1, 2))));
    }

    public static String larrysArray(List<Integer> A) {
        int inversions = 0;

        // Count the number of inversions in the array
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) > A.get(j)) {
                    inversions++;
                }
            }
        }

        // If the number of inversions is even, the array can be sorted with 3-element rotations
        return (inversions % 2 == 0) ? "YES" : "NO";
    }
}
