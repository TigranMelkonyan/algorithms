package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/8/25
 * Time: 12:53 PM
 */
public class ReverseStringInRange {

    public static void main(String[] args) {
        String s = "Snirtg";
        String ss = "12345";

        char[] chString = s.toCharArray();
        char[] chString2 = ss.toCharArray();

        reverseArray(chString, 1, s.length() - 2);
        reverseArray(chString2, 0, ss.length() - 1);

        System.out.println(chString);
        System.out.println(chString2);
    }

    private static void reverseArray(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
