package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 1/10/25
 * Time: 2:43 PM
 */
public class MinimumDistance {
    public static void main(String[] args) {
        System.out.println(minimumDistances(Arrays.asList(7, 1, 3, 4, 1, 7)));
        System.out.println(minimumDistances(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }

    // O(n)
    public static int minimumDistances(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                int temp = i - map.get(a.get(i));
                minDistance = Math.min(minDistance, temp);
            }
            map.put(a.get(i), i);
        }

        return minDistance != Integer.MAX_VALUE ? minDistance : -1;
    }


    // My version O(n^2) in worst case
//    public static int minimumDistances(List<Integer> a) {
//        int minDistance = Integer.MAX_VALUE;
//        int left = 0;
//        int right = a.size() - 1;
//
//        while (left < right) {
//            if (a.get(left) == a.get(right)) {
//                int temp = Math.abs(left - right);
//                minDistance = Math.min(temp, minDistance);
//            }
//            left++;
//            right--;
//        }
//        return minDistance != Integer.MAX_VALUE ? minDistance : -1;
//    }

    // My version O(n^2)
//    public static int minimumDistances(List<Integer> a) {
//        int minDistance = Integer.MAX_VALUE;
//
//        for (int i = 1; i < a.size(); i++) {
//            int ind = i - 1;
//            for (int j = i; j < a.size(); j++) {
//                if (a.get(ind) == a.get(j)) {
//                    int temp = Math.abs(ind - j);
//                    minDistance = Math.min(temp, minDistance);
//                }
//            }
//        }
//        return minDistance != Integer.MAX_VALUE ? minDistance : -1;
//    }
}
