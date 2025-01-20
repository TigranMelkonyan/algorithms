package com.tigran.test_tasks.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/15/25
 * Time: 2:57 PM
 */
public class GetAllPossiblePermutations {

    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        List<List<String>> permutations2 = generatePermutations(list2);
        System.out.println(permutations2);
    }

    public static <T> List<List<T>> generatePermutations(List<T> inputList) {
        List<List<T>> result = new ArrayList<>();

        // Base case: If the list is empty or contains one element, return the list itself
        if (inputList.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }

        // Recursive case: generate permutations for the rest of the list
        for (int i = 0; i < inputList.size(); i++) {
            T currentElement = inputList.get(i);
            
            List<T> remainingList = new ArrayList<>(inputList);
            remainingList.remove(i);

            // Generate all permutations for the remaining list
            List<List<T>> remainingPermutations = generatePermutations(remainingList);

            // Add the current element to each permutation of the remaining list
            for (List<T> permutation : remainingPermutations) {
                permutation.add(0, currentElement);  // Add current element to the front of the permutation
                result.add(permutation);
            }
        }

        return result;
    }

    public static <T> List<List<T>> generatePermutations2(List<T> inputList) {
        List<List<T>> result = new ArrayList<>();

        // Convert the input list to an array for easier index manipulation
        List<T> items = new ArrayList<>(inputList);
        int n = items.size();
        int[] indices = new int[n]; // Tracks swapping indices
        result.add(new ArrayList<>(items)); // Add the initial permutation

        int i = 0;
        while (i < n) {
            if (indices[i] < i) {
                // Determine the swap index
                int swapIndex = (i % 2 == 0) ? 0 : indices[i];

                // Swap elements
                T temp = items.get(i);
                items.set(i, items.get(swapIndex));
                items.set(swapIndex, temp);

                // Add the new permutation to the result
                result.add(new ArrayList<>(items));

                // Increment the index for i
                indices[i]++;
                i = 0; // Reset to check all permutations again
            } else {
                indices[i] = 0; // Reset index at position i
                i++;
            }
        }

        return result;
    }

}
