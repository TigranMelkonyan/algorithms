package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/8/25
 * Time: 6:13 PM
 */
public class FindTheFirstNonRepeatedChar {
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("aswaass"));
    }

    public static Character firstUniqueChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

}
