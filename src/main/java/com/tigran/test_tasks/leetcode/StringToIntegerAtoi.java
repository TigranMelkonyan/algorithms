package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 6/2/25
 * Time: 3:46 PM
 */
public class StringToIntegerAtoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("2147483648"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int i = 0;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        int result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            //edge case when result is exactly Integer.MAX_VALUE / 10, (214748364)
            // meaning it's one step away from causing an overflow. 
            // In this case, check if the next digit would push the result past Integer.MAX_VALUE.
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }
}
