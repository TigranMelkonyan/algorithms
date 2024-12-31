package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/31/24
 * Time: 1:09 PM
 */
public class LibraryFine {
    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 3, 6, 2015));
        System.out.println(libraryFine(6, 6, 2015, 9, 6, 2016));
        System.out.println(libraryFine(6, 6, 2016, 9, 6, 2015));
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int y = y1 - y2;
        int m = m1 - m2;
        int d = d1 - d2;
        
        if (y != 0) {
            return y > 0 ? 10000 : 0;
        }
        if (m != 0) {
            return m > 0 ? m * 500 : 0;
        }
        if (d != 0) {
            return d > 0 ? d * 15 : 0;
        }
        return 0;
    }
}
