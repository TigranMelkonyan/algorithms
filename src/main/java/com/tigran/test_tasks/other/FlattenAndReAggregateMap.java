package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/7/25
 * Time: 9:49 PM
 */
public class FlattenAndReAggregateMap {
    public static void main(String[] args) {
        Map<List<String>, List<Integer>> input = new HashMap<>();

        input.put(List.of("A", "B"), List.of(1, 2));
        input.put(List.of("B", "C"), List.of(3));

        Map<String, List<Integer>> result = flattenMap(input);

        for (Map.Entry<String, List<Integer>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static Map<String, List<Integer>> flattenMap(Map<List<String>, List<Integer>> input) {
        Map<String, List<Integer>> result = new HashMap<>();

        for (Map.Entry<List<String>, List<Integer>> entry : input.entrySet()) {
            for (String s : entry.getKey()) {
                result.putIfAbsent(s, new ArrayList<>());
                result.get(s).addAll(entry.getValue());
            }
        }

        return result;
    }

}
