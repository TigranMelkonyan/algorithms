package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/7/25
 * Time: 8:17 PM
 */
public class Partitioning {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Boolean, Set<Integer>> partitioned = nums.stream()
                .collect(Collectors.partitioningBy(
                        n -> n % 2 == 0,
                        Collectors.toSet()
                ));

        Set<Integer> evens = partitioned.get(true);
        Set<Integer> odds = partitioned.get(false);

        System.out.println("Evens: " + evens);
        System.out.println("Odds : " + odds);
    }
}
