package com.tigran.test_tasks.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tigran Melkonyan
 * Date: 1/9/25
 * Time: 2:04 PM
 */
public class BeautifulTriplets {
    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, Arrays.asList(1, 6, 7, 7, 8, 10, 12, 13, 14, 19)));
        System.out.println(beautifulTriplets(1, Arrays.asList(2, 2, 3, 4, 5)));
        System.out.println(beautifulTriplets(3, Arrays.asList(7, 10, 12, 13, 14, 19)));
    }

    //My version
//    public static int beautifulTriplets(int d, List<Integer> arr) {
//        int res = 0;
//
//        for (int i = 0; i + 2 < arr.size(); i++) {
//            int currEl = arr.get(i);
//            int count = 0;
//            for (int j = 1; j < arr.size(); j++) {
//                if (arr.get(j) - currEl == d) {
//                    count++;
//                    currEl = arr.get(j);
//                }
//                if (count == 2) {
//                    res++;
//                    break;
//                }
//            }
//        }
//        return res;
//    }
//}

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;
        Set<Integer> values = new HashSet<>(arr);

        for (int num : arr) {
            if (values.contains(num + d) && values.contains(num + 2 * d)) {
                count++;
            }
        }
        return count;
    }
}