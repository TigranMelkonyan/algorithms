package com.tigran.test_tasks.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        List<String> list = List.of("Alice", "Bob", "Charlie", "Bob", "Bob");

        Set<String> seen = new HashSet<>();

        String firstRepeated = list.stream()
            .filter(w -> !seen.add(w))
            .findFirst()
            .orElse(null);

        System.out.println(firstRepeated);
    }
}
