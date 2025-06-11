package com.tigran.test_tasks.microone;

/**
 * Created by Tigran Melkonyan
 * Date: 5/21/25
 * Time: 3:02 PM
 */
public class LongestCommonSubstring {

    public static void main(String[] args) {
        String s1 = "Hello matax bro";
        String s2 = "Hajox aziz bro";
        System.out.println(findLCS(s1, s2));

        String s3 = "Programming in Python";
        String s4 = "I love programming in Java";
        System.out.println(findLCS(s3, s4));
    }

    public static String findLCS(String s1, String s2) {
        if (s1 == null || s2 == null) return "";

        String shorter = s1.length() < s2.length() ? s1 : s2;
        String longer = s1.length() >= s2.length() ? s1 : s2;

        String longestSub = "";

        for (int i = 0; i < shorter.length(); i++) {
            for (int j = i + 1; j <= shorter.length(); j++) {
                String sub = shorter.substring(i, j);
                if (longer.contains(sub) && sub.length() > longestSub.length()) {
                    longestSub = sub;
                }
            }
        }

        return longestSub;
    }
}
