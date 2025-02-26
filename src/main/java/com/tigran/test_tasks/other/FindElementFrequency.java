package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 2/26/25
 * Time: 12:13 PM
 */
public class FindElementFrequency {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 2, 1, 5, 5, 5);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : list) {
            map.merge(i, 1, Integer::sum);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
