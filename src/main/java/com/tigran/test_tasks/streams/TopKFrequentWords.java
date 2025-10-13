package com.tigran.test_tasks.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Tigran Melkonyan
 * Date: 10/12/25
 * Time: 7:21 PM
 */
public class TopKFrequentWords {
    public static void main(String[] args) {
        List<String> words = List.of(
                "i", "love", "java", "i", "love", "coding", "java", "java"
        );

        System.out.println(topKFrequentWords(words, 2));
    }

    static List<String> topKFrequentWords(List<String> words, int k) {
        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((entry1, entry2) -> {
                    int countComparison = Long.compare(entry2.getValue(), entry1.getValue());
                    if (countComparison == 0) {
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return countComparison;
                })
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }
}
