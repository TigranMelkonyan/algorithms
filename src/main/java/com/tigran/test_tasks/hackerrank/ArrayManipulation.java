package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 8/1/25
 * Time: 3:04 PM
 */
/* Task Requirement:
You are given an array of n elements, all initially set to zero. 
You will then receive q queries, each containing three integers [a, b, k]. 
For each query, you need to add the value k to all elements in the array from index a to index b (inclusive). 
After processing all queries, return the maximum value in the updated array.*/
public class ArrayManipulation {
    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1, 3, 10));
        queries.add(Arrays.asList(2, 5, 20));
        queries.add(Arrays.asList(3, 4, 30));

        System.out.println(arrayManipulation(5, queries));
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] diff = new int[n + 2];

        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            diff[a] += k;
            diff[b + 1] -= k;
        }

        long max = 0;
        long current = 0;

        for (int i = 1; i <= n; i++) {
            current += diff[i];
            max = Math.max(max, current);
        }

        return max;
    }
}
