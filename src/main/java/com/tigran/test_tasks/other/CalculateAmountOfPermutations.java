package com.tigran.test_tasks.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 1/16/25
 * Time: 3:08 PM
 */
public class CalculateAmountOfPermutations {
    public static void main(String[] args) {
        System.out.println(foo("abc"));
        System.out.println(foo("abcd"));
        System.out.println(foo("abcca"));
    }

    // for non unique permutations P(n) = n! (abc)
    // for unique permutations P(unique) = n! / k(1)! * k(2)! ...... k(i)!    (abcca)  5! / 2! * 2! = 30

    public static int foo(String s) {
        int n = s.length();
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int numerator = factorial(n);
        int denominator = 1;

        for (int count : frequencyMap.values()) {
            denominator *= factorial(count);
        }

        return numerator / denominator;
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
