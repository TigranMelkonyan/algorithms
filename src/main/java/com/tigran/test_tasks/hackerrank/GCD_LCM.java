package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/12/24
 * Time: 2:56 PM
 */
public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(5, 10));
        System.out.println(gcd(3, 10));
        System.out.println(gcd(20, 10));
        System.out.println(gcd(12, 24));
        System.out.println(lcm(10, 15));
    }

    static int gcd(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    // Euclidean Algorithm
    private static int gcdEA(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
