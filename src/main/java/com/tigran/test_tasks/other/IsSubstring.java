package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 6/26/25
 * Time: 4:37 PM
 */
//String Rotation:Assume you have a method isSubstring which checks if one word is a substring
//of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
//call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
public class IsSubstring {
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("waterbottle", "bottlewater"));
        System.out.println(isRotation("waterbottle", "tlewaterbot"));
        System.out.println(isRotation("waterbottle", "tleawterbot"));
    }

    //waterbottlewaterbottle
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }
        String combined = s1 + s1;
        return combined.contains(s2);
    }
}
