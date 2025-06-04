package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 5/19/25
 * Time: 5:02 PM
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int reverse = 0;

        while (Math.abs(x) > 0) {
            int digit = x % 10;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  // Overflow check
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  // Underflow check
            }

            reverse = reverse * 10 + digit;
        }

        return reverse;
    }

}
