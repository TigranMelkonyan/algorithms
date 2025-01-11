package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 1/11/25
 * Time: 1:43 PM
 */
public class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
        System.out.println(chocolateFeast(10, 2, 5));
    }
    
    public static int chocolateFeast(int n, int c, int m) {
        int chocolate = n / c;
        int wrappers = chocolate;
        int rem;

        while (wrappers >= m) {
            chocolate += wrappers / m;
            rem = wrappers % m;
            wrappers = (wrappers / m) + rem;
        }

        return chocolate;
    }
}
