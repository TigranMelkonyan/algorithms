package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/19/24
 * Time: 3:53 PM
 */
public class DrawingBook {
    public static void main(String[] args) {
        System.out.println(pageCount(5, 4));
    }

    public static int pageCount(int n, int p) {
        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);

        return Math.min(fromFront, fromBack);
    }
}
