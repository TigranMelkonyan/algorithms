package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 2/24/25
 * Time: 6:38 PM
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(155));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(21));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;

        while ((left <= right) && (str.charAt(left) == str.charAt(right))) {
            left++;
            right--;
        }

        return left > right;
    }

    public static boolean isPalindromic(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }


}
