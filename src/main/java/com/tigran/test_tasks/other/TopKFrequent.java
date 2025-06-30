package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * Created by Tigran Melkonyan
 * Date: 6/30/25
 * Time: 5:08 PM
 */
public class TopKFrequent {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> input = Map.of(
                1, List.of(4, 5, 6),
                2, List.of(5, 6, 7),
                3, List.of(5, 8)
        );

        topKFrequent(input, 3).forEach(System.out::println);
    }

    public static List<Integer> topKFrequent(Map<Integer, List<Integer>> map, int k) {
        TreeMap<Integer, Integer> frequency = new TreeMap<>();

        for (List<Integer> list : map.values()) {
            for (Integer num : list) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        Collections.reverse(result);
        return result;
    }

}
