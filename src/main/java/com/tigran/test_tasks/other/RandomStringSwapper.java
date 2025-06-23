package com.tigran.test_tasks.other;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 6/23/25
 * Time: 1:54 PM
 */
public class RandomStringSwapper {
    public static void main(String[] args) {
        String input = "algorithm";
        int maxSwaps = 4;

        String result = randomAnagramWithSwaps(input, maxSwaps);
        System.out.println("Original: " + input);
        System.out.println("Randomized: " + result);
    }
    
    public static String randomAnagramWithSwaps(String s, int maxSwaps) {
        char[] chars = s.toCharArray();
        Random rand = new Random();

        int n = chars.length;
        int swaps = Math.min(maxSwaps, n / 2); // limit to avoid over-randomization

        Set<Integer> swappedIndices = new HashSet<>();

        while (swaps > 0) {
            int i = rand.nextInt(n);
            int j = rand.nextInt(n);

            // Ensure distinct indices and no repeated swaps
            if (i != j && !swappedIndices.contains(i) && !swappedIndices.contains(j)) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                swappedIndices.add(i);
                swappedIndices.add(j);
                swaps--;
            }
        }

        return new String(chars);
    }
}
