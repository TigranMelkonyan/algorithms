package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 5/31/25
 * Time: 12:17 PM
 */
public class CountTheFrequencyOfWords {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> frequency = words
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);
    }
}
