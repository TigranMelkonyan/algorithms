package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/1/25
 * Time: 5:01 PM
 */
public class NonDivisibleSubset {
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(4, Arrays.asList(19, 10, 12, 12, 24, 25, 22)));
        System.out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4)));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] remainderCounts = new int[k];

        // Count occurrences of each remainder
        for (int num : s) {
            remainderCounts[num % k] = remainderCounts[num % k] + 1;
        }

        // Initialize the subset size
        int subsetSize = 0;

        // Include at most one number with remainder 0
        if (remainderCounts[0] > 0) {
            subsetSize++;
        }

        // Process pairs of remainders
        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) { // Special case for the middle value when k is even
                subsetSize++;
            } else {
                subsetSize += Math.max(remainderCounts[i], remainderCounts[k - i]);
            }
        }

        return subsetSize;
    }

}
