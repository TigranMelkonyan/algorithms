package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/18/25
 * Time: 5:07 PM
 */
public class IsUnique {

    public static void main(String[] args) {
        System.out.println(isUnique("String"));
        System.out.println(isUnique("Striing"));
    }


    public static boolean isUnique(String str) {
        if (str.length() > 128) return false;

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}
