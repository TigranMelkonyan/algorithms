package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 2/24/25
 * Time: 7:02 PM
 */
public class FindDigitSumFromNumber {
    public static void main(String[] args) {
        System.out.println(getSum(152));
        System.out.println(getSum(555));
    }

    static int getSum(int n) {
        int sum = 0;
        int num = n;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}
