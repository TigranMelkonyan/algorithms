package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/10/24
 * Time: 9:20 PM
 */
public class FindTallestCandle {

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(4, 4, 1, 2)));
        System.out.println(birthdayCakeCandles(Arrays.asList(4, 4, 1, 6)));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int max = candles.getFirst();

        for (int i : candles) {
            if (i == max) {
                count++;
            }
            if (i > max) {
                max = i;
                count = 1;
            }
        }
        return count;
    }
}
