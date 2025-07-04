package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/4/25
 * Time: 8:27 PM
 */
public class GroupNumbersByOddAndEven {
    public static void main(String[] args) {
        Map<String, List<Integer>> res = groupByFrequencyAndParity(List.of(2, 3, 4, 2, 5, 7, 3, 8, 9));
        res.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static Map<String, List<Integer>> groupByFrequencyAndParity(List<Integer> numbers) {
        Map<String, List<Integer>> res = new HashMap<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (Integer number : numbers) {
            freq.merge(number, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count > 1 && number % 2 == 0) {
                res.putIfAbsent("evenDuplicates", new ArrayList<>());
                res.get("evenDuplicates").add(number);
            } else if (count == 1 && number % 2 == 1) {
                res.putIfAbsent("oddUniques", new ArrayList<>());
                res.get("oddUniques").add(number);
            }
        }

        return res;
    }

}
