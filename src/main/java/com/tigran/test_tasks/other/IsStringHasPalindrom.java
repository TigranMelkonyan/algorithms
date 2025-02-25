package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 2/4/25
 * Time: 2:47 PM
 */
public class IsStringHasPalindrom {
    public static void main(String[] args) {
        System.out.println(hasPalindromic("a"));
        System.out.println(hasPalindromic("bb"));
        System.out.println(hasPalindromic("aba"));
        System.out.println(hasPalindromic("aab"));
        System.out.println(hasPalindromic("abc"));
        System.out.println(hasPalindromic("string"));
    }

    public static boolean hasPalindromic(String s) {
        if (s == null || s.isEmpty()) return false;
        if (s.length() == 1) return true;

        for (int i = 0; i < s.length(); i++) {
            if (expandAroundCentre(i, i, s) || expandAroundCentre(i, i + 1, s)) {
                return true;
            }
        }
        return false;
    }

    private static boolean expandAroundCentre(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1 > 1;
    }
}