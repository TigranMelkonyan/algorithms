package com.tigran.test_tasks.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Tigran Melkonyan
 * Date: 7/1/25
 * Time: 5:37 PM
 */
public class SortStringsByCustomOrder {
    public static void main(String[] args) {
        String[] words = {"bat", "apple", "ball"};
        String order = "zyxwvutsrqponmlkjihgfedcba";

        String[] res = sortByCustomOrder(words, order);

        Stream.of(res).forEach(System.out::println);
    }

    public static String[] sortByCustomOrder(String[] words, String order) {
        Map<Character, Integer> ranking = new HashMap<>();

        for (int i = 0; i < order.length(); i++) {
            ranking.put(order.charAt(i), i);
        }

        Arrays.sort(words, (a, b) -> {
            int len = Math.min(a.length(), b.length());
            for (int i = 0; i < len; i++) {
                char ca = a.charAt(i);
                char cb = b.charAt(i);
                int rankA = ranking.getOrDefault(ca, -1);
                int rankB = ranking.getOrDefault(cb, -1);

                if (rankA != rankB) {
                    return Integer.compare(rankA, rankB);
                }
            }
            return Integer.compare(a.length(), b.length());
        });

        return words;
    }
}
