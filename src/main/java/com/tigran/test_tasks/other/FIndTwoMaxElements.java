package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/8/25
 * Time: 3:10 PM
 */
public class FIndTwoMaxElements {
    public static void main(String[] args) {
        firstAndSecMax(new int[]{1, 5, 6, 7, 9, 4, 2});
        firstAndSecMin(new int[]{1, 5, 6, 7, 9, 4, 2});
    }

    public static void firstAndSecMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        System.out.println(max + " " + secondMax);
    }

    public static void firstAndSecMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum found");
        } else {
            System.out.println(min + " " + secondMin);
        }
    }
}
