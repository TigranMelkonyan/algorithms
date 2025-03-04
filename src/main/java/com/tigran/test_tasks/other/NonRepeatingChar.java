package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 3/4/25
 * Time: 2:45 PM
 */
//Find first non-repeating char
public class NonRepeatingChar {
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("swiss"));
    }

    static char nonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            map.merge(chars[i], 1, Integer::sum);
        }

        for (char c : chars) {
            if (map.get(c).intValue() == 1) {
                return c;
            }
        }

        return '-';
    }
}
