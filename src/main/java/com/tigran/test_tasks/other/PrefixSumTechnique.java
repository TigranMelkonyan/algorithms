package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 7/28/25
 * Time: 4:03 PM
 */
public class PrefixSumTechnique {
    public static void main(String[] args) {
        Arrays.stream(prefixSum(new int[]{2, 4, 5, 7})).forEach(System.out::println);
    }

    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];

        prefix[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        return prefix;
    }
}
