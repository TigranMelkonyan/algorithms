package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Tigran Melkonyan
 * Date: 6/30/25
 * Time: 8:33 PM
 */
public class GroupStringByCharFreq {
    public static void main(String[] args) {
        String[] strings = new String[]{"abb", "bba", "bab", "abc", "cab", "bac", "aabb"};

        groupByLetterFrequency(strings).forEach(System.out::println);
    }

    public static List<List<String>> groupByLetterFrequency(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            Map<Character, Integer> freq = new TreeMap<>();

            for (char c : str.toCharArray()) {
                freq.merge(c, 1, Integer::sum);
            }

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                char c = entry.getKey();
                sb.append(c).append(entry.getValue());
            }

            map.putIfAbsent(sb.toString(), new ArrayList<>());
            map.get(sb.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }

}
