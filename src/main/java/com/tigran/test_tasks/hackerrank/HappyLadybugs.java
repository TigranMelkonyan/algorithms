package com.tigran.test_tasks.hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 1/20/25
 * Time: 4:42 PM
 */
public class HappyLadybugs {
    public static void main(String[] args) {
        System.out.println(happyLadybugs("B_RRBR"));
        System.out.println(happyLadybugs("AABBC"));
        System.out.println(happyLadybugs("AABBCC"));
        System.out.println(happyLadybugs("X_Y__X"));
        System.out.println(happyLadybugs("__"));
        System.out.println(happyLadybugs("AABCBC"));
        System.out.println(happyLadybugs("_"));
    }

    public static String happyLadybugs(String b) {
        boolean hasUnderscore = b.contains("_");

        if (!hasUnderscore) {
            for (int i = 0; i < b.length(); i++) {
                if ((i > 0 && b.charAt(i) == b.charAt(i - 1)) || (i < b.length() - 1 && b.charAt(i) == b.charAt(i + 1))) {
                    continue;
                }
                return "NO";
            }
            return "YES";
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : b.toCharArray()) {
            if (c != '_') {
                map.merge(c, 1, Integer::sum);
            }
        }

        for (int count : map.values()) {
            if (count == 1) {
                return "NO";
            }
        }

        return "YES";
    }
}