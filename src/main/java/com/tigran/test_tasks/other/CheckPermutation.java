package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 6/18/25
 * Time: 5:12 PM
 */
public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(checkPermutation("abba", "baba"));
        System.out.println(checkPermutation("abbba", "babaa"));
    }
    
    public static boolean checkPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
