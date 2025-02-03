package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 1/31/25
 * Time: 3:28 PM
 */
public class FindTargetUsingHashMap {
    public static void main(String[] args) {
        findTarget(new int[]{1, 2, 1, 5, 7, 2, 3}, 5);
    }


    public static void findTarget(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(arr[i] + " " + complement);
            }

            map.put(arr[i], i);
        }
    }
}
