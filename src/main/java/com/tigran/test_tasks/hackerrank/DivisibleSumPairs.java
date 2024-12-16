package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/16/24
 * Time: 3:24 PM
 */
public class DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int pairs = 0;
        int[] rem = new int[k];

        for (int i = 0; i < n; i++) {
            int remainder = ar.get(i) % k;

            int complement = (k - remainder) % k;

            pairs += rem[complement];

            rem[remainder]++;
        }
        return pairs;
    }

//    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
//        int pairs = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if ((ar.get(i) + ar.get(j)) % k == 0) {
//                    pairs++;
//                }
//            }
//        }
//        return pairs;
//    }
}
