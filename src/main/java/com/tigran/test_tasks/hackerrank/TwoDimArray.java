package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/10/24
 * Time: 2:16 PM
 */
public class TwoDimArray {
    public static void main(String[] args) {
        staircase(6);
        foo(6);
    }

    public static void staircase(int n) {
        String s = "#";
        String ws = " ";
        String[][] str = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - 1 - i) {
                    str[i][j] = s;
                } else {
                    str[i][j] = ws;
                }
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }

    public static void foo(int n) {
        String s = "#";
        String ws = " ";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(ws);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
