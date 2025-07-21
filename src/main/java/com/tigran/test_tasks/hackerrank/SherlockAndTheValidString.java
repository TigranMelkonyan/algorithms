package com.tigran.test_tasks.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/21/25
 * Time: 10:31 AM
 */
public class SherlockAndTheValidString {
    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("aabbccddd"));
        System.out.println(isValid("aaabbbccc"));
    }

    public static String isValid(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int count : freq.values()) {
            freqCount.merge(count, 1, Integer::sum);
        }

        // If there is only one distinct frequency, it's valid
        if (freqCount.size() == 1) {
            return "YES";
        }

        // If there are two different frequencies, check if one can be reduced by removing one character
        if (freqCount.size() == 2) {
            Iterator<Map.Entry<Integer, Integer>> it = freqCount.entrySet().iterator();
            Map.Entry<Integer, Integer> entry1 = it.next();
            Map.Entry<Integer, Integer> entry2 = it.next();
            
            int f1 = entry1.getKey();
            int f2 = entry2.getKey();
            int count1 = entry1.getValue();
            int count2 = entry2.getValue();

            // Case 1: One frequency is 1, and it occurs exactly once (i.e., one character can be removed)
            if ((f1 == 1 && count1 == 1) || (f2 == 1 && count2 == 1)) {
                return "YES";
            }

            // Case 2: The frequencies differ by exactly 1, and the higher frequency occurs only once
            if ((Math.abs(f1 - f2) == 1) && (count1 == 1 || count2 == 1)) {
                return "YES";
            }
        }

        return "NO";
    }
}
