package com.tigran.test_tasks.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 3/4/25
 * Time: 4:15 PM
 */
public class MostFrequent {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, Arrays.asList(2, 3));
        map.put(2, Arrays.asList(1, 3));
        map.put(3, Arrays.asList(2, 4));
        map.put(4, Arrays.asList(1, 2));

        int result = findMostFrequent(map);

        System.out.println(result);
    }

    static int findMostFrequent(Map<Integer, List<Integer>> map) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            for (int num : list) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        int mostFrequent = -1;
        int resKey = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > mostFrequent) {
                mostFrequent = entry.getValue();
                resKey = entry.getKey();
            }

        }

        return resKey;
    }
}
