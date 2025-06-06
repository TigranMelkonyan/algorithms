package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 6/5/25
 * Time: 2:47 PM
 */
public class CubeSumSolutions {
    public static void main(String[] args) {
        int limit = 1000;

        Map<Integer, List<int[]>> cubeSums = new HashMap<>();

        //Compute all possible a^3 + b^3 and store the pairs
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {  // Start b from a to avoid duplicate pairs
                int sum = a * a * a + b * b * b;
                cubeSums.computeIfAbsent(sum, k -> new ArrayList<>())
                        .add(new int[]{a, b});
            }
        }

        //For each sum, print all (a, b) and (c, d) pairs
        for (Map.Entry<Integer, List<int[]>> entry : cubeSums.entrySet()) {
            List<int[]> pairs = entry.getValue();

            // Only consider cube sums that occur more than once
            if (pairs.size() > 1) {
                for (int i = 0; i < pairs.size(); i++) {
                    for (int j = i + 1; j < pairs.size(); j++) {
                        int[] pair1 = pairs.get(i);
                        int[] pair2 = pairs.get(j);
                        System.out.printf("(%d, %d) and (%d, %d)%n",
                                pair1[0], pair1[1], pair2[0], pair2[1]);
                    }
                }
            }
        }

    }
}
