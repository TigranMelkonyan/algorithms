package com.tigran.test_tasks.other;

/**
 * Created by Tigran Melkonyan
 * Date: 1/25/25
 * Time: 8:49 PM
 */
public class ReplaceArrayElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] res = addNewElements(arr, 3, 2);

        for (int i : res) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] res2 = addNewElement(arr, 3, 2);

        for (int i : res2) {
            System.out.print(i + " ");
        }
    }

    private static int[] addNewElement(int[] arr, int ind, int newElement) {
        int[] res = new int[arr.length + 1];

        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if (i == ind) {
                res[i] = newElement;
            } else {
                res[i] = arr[index];
                index++;
            }

        }
        return res;
    }


    private static int[] addNewElements(int[] arr, int step, int newElement) {
        int newSize = arr.length + (arr.length / step);
        int[] newArr = new int[newSize];

        int index = 0;
        for (int i = 0; i < newSize; i++) {
            if ((i + 1) % step == 0) {
                newArr[i] = newElement;
            } else {
                newArr[i] = arr[index];
                index++;
            }
        }
        return newArr;
    }
}
