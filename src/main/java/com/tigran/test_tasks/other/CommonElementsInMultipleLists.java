package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 7/2/25
 * Time: 6:43 PM
 */
public class CommonElementsInMultipleLists {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(1, 2, 3, 4));
        lists.add(List.of(2, 3, 5));
        lists.add(List.of(2, 3, 7));
        List<Integer> res = findCommonElements(lists);

        res.forEach(System.out::println);
    }

    public static List<Integer> findCommonElements(List<List<Integer>> lists) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (List<Integer> list : lists) {
            Set<Integer> set = new HashSet<>(list);

            for (Integer i : set) {
                freq.merge(i, 1, Integer::sum);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == lists.size()) {
                res.add(entry.getKey());
            }
        }

        return res;
    }

}
