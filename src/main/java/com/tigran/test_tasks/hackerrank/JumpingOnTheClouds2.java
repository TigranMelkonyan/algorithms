package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 1/4/25
 * Time: 2:01 PM
 */
public class JumpingOnTheClouds2 {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0)));
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(Arrays.asList(0, 1, 0, 0, 0, 1, 0)));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int res = 0;
        int ind = 0;

        while (ind < c.size() - 1) {
            if (ind + 2 < c.size() && c.get(ind + 2) != 1) {
                res++;
                ind += 2;
            } else if (ind + 1 < c.size() && c.get(ind + 1) != 1) {
                res++;
                ind += 1;
            }
        }
        return res;
    }


//    public static int jumpingOnClouds(List<Integer> c) {
//        int res = 0;
//        int ind = 0;
//
//        for (int i = 0; ind < c.size() - 1; i++) {
//            if (ind + 2 <= c.size() && c.get(i + 2) != 1) {
//                res++;
//                ind += 2;
//            } else if (ind + 1 <= c.size() && c.get(ind + 1) != 1) {
//                res++;
//                ind += 1;
//            }
//        }
//
//        return res;
//    }
}
