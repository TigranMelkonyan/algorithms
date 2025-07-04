package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 4/1/25
 * Time: 10:26 PM
 */
public class WordCompletion {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "bat", "rat", "cot", "dot");
        String pattern = "c_t";

        List<String> matches = fillBlanks(pattern, words);
        System.out.println("Possible matches: " + matches);
    }

    public static List<String> fillBlanks(String pattern, List<String> words) {
        Map<Integer, List<String>> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.putIfAbsent(word.length(), new ArrayList<>());
            wordMap.get(word.length()).add(word);
        }

        List<String> possibleMatches = new ArrayList<>();
        int patternLength = pattern.length();

        // Check if there are words of the same length as the pattern
        if (wordMap.containsKey(patternLength)) {
            for (String word : wordMap.get(patternLength)) {
                boolean match = true;

                // Compare the pattern with each word
                for (int i = 0; i < patternLength; i++) {
                    if (pattern.charAt(i) != '_' && pattern.charAt(i) != word.charAt(i)) {
                        match = false;
                        break;
                    }
                }

                // If the word matches, add it to the possible matches
                if (match) {
                    possibleMatches.add(word);
                }
            }
        }

        return possibleMatches;
    }

}
