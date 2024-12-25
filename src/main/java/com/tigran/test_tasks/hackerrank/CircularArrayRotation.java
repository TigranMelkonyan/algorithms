package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/25/24
 * Time: 2:42 PM
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        System.out.println(circularArrayRotation(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 2,
                new ArrayList<>(Arrays.asList(1, 2))));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int n = a.size();
        // Calculate the effective number of rotations
        k = k % n;

        List<Integer> res = new ArrayList<>();
        for (int query : queries) {
            // Compute the new index after rotation
            int rotatedIndex = (query - k + n) % n;
            res.add(a.get(rotatedIndex));
        }
        return res;
    }
}
