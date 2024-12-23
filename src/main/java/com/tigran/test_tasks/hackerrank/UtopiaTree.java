package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/23/24
 * Time: 1:00 PM
 */
public class UtopiaTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(0));
        System.out.println(utopianTree(1));
        System.out.println(utopianTree(4));
    }

    public static int utopianTree(int n) {
        int height = 1;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0) {
                height ++;
            } else {
                height *= 2;
            }
        }
        return height;
    }
}
