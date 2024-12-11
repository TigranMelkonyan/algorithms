package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/11/24
 * Time: 2:21 PM
 */
public class GradeStudent {
    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res = new ArrayList<>();
        double diff;
        double temp;

        for (int i : grades) {
            if (i >= 38) {
                temp = Math.ceil(i / 5.0) * 5.0;
                diff = temp - i;
                if (diff < 3) {
                    res.add((int) temp);
                } else {
                    res.add(i);
                }
            } else {
                res.add(i);
            }
        }
        return res;
    }
}
