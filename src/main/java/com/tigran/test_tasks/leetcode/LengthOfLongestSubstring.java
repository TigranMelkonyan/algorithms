package com.tigran.test_tasks.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 2/25/25
 * Time: 5:55 PM
 */
//Find unrepeated longest substring 
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdaagg"));
        System.out.println(lengthOfLongestSubstring2("abbad"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = foo(i, s);
            max = Math.max(temp, max);
        }

        return max;
    }

    public static int foo(int index, String s) {
        Set<Character> set = new HashSet<>();
        for (int i = index; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                break;
            }
            set.add(s.charAt(i));
        }
        return set.size();
    }

    public static int lengthOfLongestSubstring2(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // If we have seen the character before, move the start pointer
            // to the right of the previous occurrence of the character
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }

            // Update the last seen position of the current character
            map.put(c, end);

            // Calculate the max length of substring
            max = Math.max(max, end - start + 1);
        }

        return max;
    }

}
