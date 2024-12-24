package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/24/24
 * Time: 5:17 PM
 */
public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5, 2, 1));
        System.out.println(saveThePrisoner(5, 2, 2));
        System.out.println(saveThePrisoner(7, 19, 2));
    }

    public static int saveThePrisoner(int n, int candy, int pos) {
        return ((pos - 1 + candy - 1) % n) + 1;
    }

}
