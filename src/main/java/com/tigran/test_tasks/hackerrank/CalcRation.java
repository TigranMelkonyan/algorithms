package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/9/24
 * Time: 4:54 PM
 */
public class CalcRation {

    public static void main(String[] args) {
        CalcRation.plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
        System.out.println();
        CalcRation.foo(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {
        double pos = 0;
        double neg = 0;
        double zr = 0;
        double length = arr.size();
        double[] out = new double[3];
        for (Integer i : arr) {
            if (i > 0) {
                pos += 1;
            } else if (i < 0) {
                neg += 1;
            } else {
                zr += 1;
            }
        }
        out[0] = pos / length;
        out[1] = neg / length;
        out[2] = zr / length;
        Arrays.stream(out).forEach(System.out::println);
    }

    public static void foo(List<Integer> arr) {
        double size = arr.size();
        double pos = arr.stream().filter(i -> i > 0).count();
        double neg = arr.stream().filter(i -> i < 0).count();
        double zr = arr.stream().filter(i -> i == 0).count();
        System.out.println(pos / size);
        System.out.println(neg / size);
        System.out.println(zr / size);
        
    }
}