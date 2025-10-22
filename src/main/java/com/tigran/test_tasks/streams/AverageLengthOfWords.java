package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/13/25
 * Time: 6:44 PM
 */
public class AverageLengthOfWords {
    public static void main(String[] args) {
        List<String> words = List.of(
                "apple", "art", "banana", "boat", "bike", "cat"
        );

        words.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.averagingInt(String::length)
                )).forEach((character, aDouble) -> System.out.println(character + " : " + aDouble));
    }
}
