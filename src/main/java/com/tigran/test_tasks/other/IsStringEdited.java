package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/23/25
 * Time: 5:08 PM
 */
public class IsStringEdited {
    public static void main(String[] args) {
        String a = "pale";
        String b = "ple";
        System.out.println(isStringEdited(a, b));

        a = "pales";
        b = "pale";
        System.out.println(isStringEdited(a, b));

        a = "pale";
        b = "bake";
        System.out.println(isStringEdited(a, b));
    }

    public static boolean isStringEdited(String a, String b) {
        if (a.equals(b)) {
            return false;
        }

        int len1 = a.length();
        int len2 = b.length();

        if (Math.abs(len1 - len2) > 1) {
            return false;
        }

        String s1 = len1 < len2 ? a : b;
        String s2 = len1 < len2 ? b : a;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) return false;
                foundDifference = true;

                if (s1.length() == s2.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }

        return true;
    }
}
