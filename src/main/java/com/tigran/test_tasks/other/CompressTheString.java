package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/25/25
 * Time: 5:39 PM
 */
public class CompressTheString {
    public static void main(String[] args) {
        System.out.println(compress("aabbcdeee"));
    }

    public static String compress(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder compressed = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == prev) {
                count++;
            } else {
                compressed.append(prev).append(count);
                prev = current;
                count = 1;
            }
        }
        
        return compressed.toString();
    }
}
