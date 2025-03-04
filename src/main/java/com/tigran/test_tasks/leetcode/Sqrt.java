package com.tigran.test_tasks.leetcode;

/**
 * Created by Tigran Melkonyan
 * Date: 3/3/25
 * Time: 3:43 PM
 */
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
        System.out.println(sqrt(25));
    }

    public static int sqrt(int x) {
        int i = 0;
        while ((long) i * i <= x) {
            i++;
        }
        return i - 1;
    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // Avoid integer overflow

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

}
