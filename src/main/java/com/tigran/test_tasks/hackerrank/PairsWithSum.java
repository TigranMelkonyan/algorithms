package com.tigran.test_tasks.hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 12/16/24
 * Time: 4:03 PM
 */
public class PairsWithSum {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 3, 6, 5, 7};
        int target = 6;
        System.out.println(findPairsCountWithSum(ar, target));  // 3
        target = 7;
        System.out.println(findPairsCountWithSum(ar, target));  // 4
        target = 5;
        System.out.println(findPairsCountWithSum(ar, target));  // 3
    }

    public static int findPairsCountWithSum(int[] arr, int target) {
        int count = 0;
        Set<Integer> container = new HashSet<>();

        for (int i : arr) {
            if (container.contains(target - i)) {
                count++;
            }
            container.add(i);
        }
        return count;
    }
}
