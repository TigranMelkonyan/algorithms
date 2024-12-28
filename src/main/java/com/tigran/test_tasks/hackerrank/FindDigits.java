package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/28/24
 * Time: 3:26 PM
 */
public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(1002));
        System.out.println(findDigits(123456789));
    }

    public static int findDigits(int n) {
        int res = 0;
        int num = n;

        while(n > 0) {
            int digit = n % 10;

            if(digit != 0 && num % digit == 0) {
                res++;
            }
            n = n / 10;
        }
        return res;
    }
}
