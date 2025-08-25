package com.tigran.test_tasks.other.amortized;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Tigran Melkonyan
 * Date: 8/21/25
 * Time: 1:16 PM
 */
public class MovingAverage {

    private final int windowSize;
    private final Deque<Integer> window;
    private long sum;

    public MovingAverage(int windowSize) {
        if (windowSize <= 0) {
            throw new IllegalArgumentException("windowSize must be > 0");
        }
        this.windowSize = windowSize;
        this.window = new ArrayDeque<>(windowSize);
        this.sum = 0L;
    }

    //process and return average for N size window
    // O(1) amortized
    public double next(int val) {
        window.addLast(val);
        sum += val;

        if (window.size() > windowSize) {
            int old = window.pollFirst();
            sum -= old;
        }

        return (double) sum / window.size();    
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(2));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(4));
    }
}

