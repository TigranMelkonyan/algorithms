package com.tigran.test_tasks.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tigran Melkonyan
 * Date: 12/31/24
 * Time: 2:50 PM
 */
public class CutTheSticks {
    public static void main(String[] args) {
        System.out.println(cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8)));
    }

//    public static List<Integer> cutTheSticks(List<Integer> arr) {
//        List<Integer> res = new ArrayList<>();
//        int count = 0;
//        int ind = 0;
//
//        Collections.sort(arr);
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (ind >= arr.size()) {
//                break;
//            }
//            int temp = arr.get(ind);
//            for (int j = ind; j < arr.size(); j++) {
//                if (arr.get(j) - temp == 0) {
//                    ind++;
//                }
//                count++;
//                arr.set(j, arr.get(j) - temp);
//            }
//            res.add(count);
//            count = 0;
//        }
//
//        return res;
//    }

    
    //2 2 4 4 5 8
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        // Sort the array
        Collections.sort(arr);

        int n = arr.size();
        result.add(n); // Initial count is the total number of sticks, means no changes

        for (int i = 1; i < n; i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                // Add the number of remaining sticks
                result.add(n - i);
            }
        }

        return result;
    }

}
