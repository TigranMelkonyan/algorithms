package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 5/31/25
 * Time: 12:41 PM
 */
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 6);

        List<Integer> duplicates = numbers
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        
        System.out.println(duplicates);
    }
}
