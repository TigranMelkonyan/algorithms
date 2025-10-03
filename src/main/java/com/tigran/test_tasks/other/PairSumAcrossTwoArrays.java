package com.tigran.test_tasks.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 10/3/25
 * Time: 1:28 PM
 */
public class PairSumAcrossTwoArrays {
    public static void main(String[] args) {
        Arrays.stream(twoArrayPairSum(new int[]{1, 4, 5}, new int[]{2, 3}, 7)).forEach(System.out::println);
        Arrays.stream(twoArrayPairSumSorted(new int[]{1, 4, 5}, new int[]{2, 3}, 7)).forEach(System.out::println);
    }

    public static int[] twoArrayPairSum(int[] a, int[] b, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);
        }

        for (int i = 0; i < b.length; i++) {
            int complement = target - b[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
        }

        return new int[]{-1, -1};
    }

    //considering both already sorted
    public static int[] twoArrayPairSumSorted(int[] a, int[] b, int target) {
        int i = 0;
        int j = b.length - 1;

        while (i < a.length && j >= 0) {
            int sum = a[i] + b[j];

            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }

        }

        return new int[]{-1, -1};
    }

}
