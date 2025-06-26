package com.tigran.test_tasks.other.dice;

import java.util.Random;

/**
 * Created by Tigran Melkonyan
 * Date: 5/8/25
 * Time: 9:39 PM
 */
public class Dice {
    
    private static final Random RANDOM = new Random();
    private final int faces;

    public Dice(int faces) {
        if (faces <= 0) {
            throw new IllegalArgumentException("Dice must have at least one face");
        }
        this.faces = faces;
    }

    public int roll() {
        return RANDOM.nextInt(faces) + 1;
    }

    public int rollMultipleAndSum(int times) {
        int total = 0;
        for (int i = 0; i < times; i++) {
            total += roll();
        }
        return total;
    }
}
