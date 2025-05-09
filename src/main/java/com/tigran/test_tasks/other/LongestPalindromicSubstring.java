package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/9/25
 * Time: 4:03 PM
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));
        System.out.println(longestPalindrome("racecar"));
        System.out.println(longestPalindrome("forgeeksskeegfor"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
