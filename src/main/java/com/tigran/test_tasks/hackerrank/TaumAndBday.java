package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/6/25
 * Time: 1:35 PM
 */
public class TaumAndBday {

    public static void main(String[] args) {
        System.out.println(taumBday(10, 10, 1, 1, 10));
        System.out.println(taumBday(3, 6, 9, 1, 1));
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long bp = Math.min(bc, wc + z);
        long wp = Math.min(wc, bc + z);
        return b * bp + w * wp;
    }
}
