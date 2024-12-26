package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/26/24
 * Time: 4:15 PM
 */
public class SequenceEquation {
    public static void main(String[] args) {
        System.out.println(permutationEquation(Arrays.asList(5, 2, 1, 3, 4)));
        System.out.println(permutationEquation(Arrays.asList(4, 3, 5, 1, 2)));
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= p.size(); i++) {
            int ind = p.indexOf(i) + 1;
            int r = p.indexOf(ind) + 1;
            res.add(r);
        }

        return res;
    }

}
