package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/10/24
 * Time: 11:01 AM
 */
public class PlusMinusRation {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        double size = arr.size();
        double pos = arr.stream().filter(i -> i > 0).count() / size;
        double neg = arr.stream().filter(i -> i < 0).count() / size;
        double zr = arr.stream().filter(i -> i == 0).count() / size;

        //for e.g. to make 0.12345 with 3 digits after point is (int) (val / 1000) * 1000.0
        double a = (int) (pos * 100000) / 100000.0;
        double b = (int) (neg * 100000) / 100000.0;
        double c = (int) (zr * 100000) / 100000.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
