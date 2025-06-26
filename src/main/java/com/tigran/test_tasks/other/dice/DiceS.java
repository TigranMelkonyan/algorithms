package com.tigran.test_tasks.other.dice;

import java.util.Random;


public class DiceS {

    private Integer faces;

    public DiceS(int faces) {
        this.faces = faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public Integer roll() {
        Random random = new Random();
        return random.nextInt(faces);
    }

    public Integer rollX(int x) {
        int r = 0;
        for (int i = 0; i < x; i++) {
            r = r + roll();
        }
        return r;
    }

    public Integer coin() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
