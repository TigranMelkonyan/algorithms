package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/13/24
 * Time: 5:16 PM
 */
public class SubArrayConsAllCases {
    public static void main(String[] args) {
        System.out.println(foo(Arrays.asList(1, 2, 3, 5, 9, 7, 3, 1), 4, 3));
        System.out.println(foo(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
        System.out.println(foo(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
        System.out.println(foo(Arrays.asList(4), 4, 1));
    }
    
    static int foo(List<Integer> s, int d, int m) {
        return countCombinations(s, d, m, 0, 0, 0);
    }

    static int countCombinations(List<Integer> s, int target, int m, int index, int sum, int selected) {
        // Base case: if we've selected exactly `m` elements
        if (selected == m) {
            return sum == target ? 1 : 0;
        }

        // Base case: if we've run out of elements to pick
        if (index >= s.size()) {
            return 0;
        }

        // Recursive case: Include the current element
        int include = countCombinations(s, target, m, index + 1, sum + s.get(index), selected + 1);

        // Recursive case: Exclude the current element
        int exclude = countCombinations(s, target, m, index + 1, sum, selected);

        return include + exclude;
    }
}
