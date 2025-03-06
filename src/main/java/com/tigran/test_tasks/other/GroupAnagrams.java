package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 3/4/25
 * Time: 12:49 PM
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
