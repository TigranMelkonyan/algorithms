package com.tigran.test_tasks.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 1/10/25
 * Time: 3:03 PM
 */
public class FindCoupleElementsWIthHashMap {

    public static void main(String[] args) {
        System.out.println(minimumDistances(Arrays.asList(7, 1, 3, 4, 1, 7)));
        System.out.println(minimumDistances(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }

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
}
