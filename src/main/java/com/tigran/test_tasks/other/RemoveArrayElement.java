package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 2/13/25
 * Time: 12:12 PM
 */
public class RemoveArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int[] res = removeElement(arr, 2);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] removeElement(int[] nums, int ind) {
        int index = 0;
        int[] res = new int[nums.length - 1];


        for (int i = 0; i < nums.length; i++) {
            if(i == ind) {
                continue;    
            }   
            res[index] = nums[i];
            index++;
            
        }

        return res;
    }
}
