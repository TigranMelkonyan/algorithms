package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 5/24/25
 * Time: 6:15 PM
 */
public class AreStringsAnagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams("Split", "Sit"));
        System.out.println(areAnagrams("Listen", "Silent"));
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

}
