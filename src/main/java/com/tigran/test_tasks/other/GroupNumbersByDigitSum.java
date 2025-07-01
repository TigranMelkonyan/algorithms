package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 7/1/25
 * Time: 5:02 PM
 */
public class GroupNumbersByDigitSum {
    public static void main(String[] args) {
        List<Integer> input = List.of(11, 20, 21, 101, 30);

        Map<Integer, List<Integer>> map = groupByDigitSum(input);

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static Map<Integer, List<Integer>> groupByDigitSum(List<Integer> numbers) {
        Map<Integer, List<Integer>> result = new HashMap<>();

        for (Integer number : numbers) {
            int num = getDigitCount(number);

            result.putIfAbsent(num, new ArrayList<>());
            result.get(num).add(number);

        }

        return result;
    }

    private static int getDigitCount(int number) {
        int sum = 0;
        int num = number;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

}
