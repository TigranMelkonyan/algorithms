package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/27/25
 * Time: 4:10 PM
 */
public class CalcPow {
    public static void main(String[] args) {
        System.out.println(calcPow(2,12));
    }

    static int calcPow(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * calcPow(x, n - 1);
    }
}
