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
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<List<Integer>> permutations2 = generatePermutations(list2);
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
            // Create a new list without the current element
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
}
