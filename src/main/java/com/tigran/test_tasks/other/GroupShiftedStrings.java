package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Tigran Melkonyan
 * Date: 6/23/25
 * Time: 2:03 PM
 */
public class GroupShiftedStrings {
    public static void main(String[] args) {
        String[] input = new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        List<List<String>> result = groupShiftedStrings(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupShiftedStrings(String[] strings) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strings) {
            String key = getShiftKey(s);  // normalize the string
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }

    private static String getShiftKey(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> Integer.toString((s.charAt(i) - s.charAt(0) + 26) % 26))
                .collect(Collectors.joining(","));
    }
}
