package com.tigran.test_tasks.leetcode;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 3/3/25
 * Time: 2:36 PM
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] res = plusOne(new int[]{4, 5, 9});
        Arrays.stream(res).forEach(System.out::print);
        System.out.println();
        res = plusOne(new int[]{9, 9, 9});
        Arrays.stream(res).forEach(System.out::print);
    }

    //My version
    public static int[] plusOne(int[] digits) {
        int carry = 1;

        if (digits[digits.length - 1] + 1 < 10) {
            digits[digits.length - 1]++;
            return digits;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry >= 10) {
                digits[i] = 0;
            } else {
                digits[i]++;
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }

//    public static int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i]++;
//                return digits;
//            }
//            digits[i] = 0;
//        }
//
//        int[] newDigits = new int[digits.length + 1];
//        newDigits[0] = 1;
//        return newDigits;
//    }
}
