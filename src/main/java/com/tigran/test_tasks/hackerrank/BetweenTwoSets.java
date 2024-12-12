package com.tigran.test_tasks.hackerrank;

import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/12/24
 * Time: 2:41 PM
 */
public class BetweenTwoSets {

    public static void main(String[] args) {
        List<Integer> a = List.of(2, 4);
        List<Integer> b = List.of(16, 32, 96);

        System.out.println(getTotalX(a, b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcmOfA = findLCM(a);

        int gcdOfB = findGCD(b);

        int count = 0;
        for (int i = lcmOfA; i <= gcdOfB; i += lcmOfA) {
            if (gcdOfB % i == 0) {
                count++;
            }
        }

        return count;
    }

    // Function to calculate the greatest common divisor (GCD) 
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the least common multiple (LCM)
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Function to find the LCM of a list
    private static int findLCM(List<Integer> numbers) {
        int lcm = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            lcm = lcm(lcm, numbers.get(i));
        }
        return lcm;
    }

    // Function to find the GCD of a list
    private static int findGCD(List<Integer> numbers) {
        int gcd = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            gcd = gcd(gcd, numbers.get(i));
        }
        return gcd;
    }
}
