package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 7/28/25
 * Time: 4:03 PM
 */
public class PrefixSumTechnique {
    public static void main(String[] args) {
        int[] res = prefixSum(new int[]{2, 4, 5, 7});
        Arrays.stream(res).forEach(System.out::println);

        System.out.println();
        System.out.println(sumRange(1, 3, res));
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

    public static int sumRange(int left, int right, int[] prefix) {
        return prefix[right + 1] - prefix[left];
    }
}
