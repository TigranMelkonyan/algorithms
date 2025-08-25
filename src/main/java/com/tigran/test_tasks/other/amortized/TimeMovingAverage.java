package com.tigran.test_tasks.other.amortized;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Tigran Melkonyan
 * Date: 8/21/25
 * Time: 1:43 PM
 */
public class TimeMovingAverage {

    private final int windowSizeInSeconds;
    private final Deque<Entry> window;
    private long sum;

    private record Entry(int val, int ts) {
    }

    public TimeMovingAverage(int windowSizeInSeconds) {
        if (windowSizeInSeconds <= 0) {
            throw new IllegalArgumentException("windowSizeInSeconds must be > 0");
        }
        this.windowSizeInSeconds = windowSizeInSeconds;
        this.window = new ArrayDeque<>();
        this.sum = 0L;
    }

    // Add (val, timestamp) and return average of values in (timestamp - T, timestamp]
    // Assumes timestamps are non-decreasing across calls.
    public double next(int val, int timestamp) {
        cleanup(timestamp);
        window.addLast(new Entry(val, timestamp));
        sum += val;
        return window.isEmpty() ? 0.0 : (double) sum / window.size();
    }

    private void cleanup(int currentTs) {
        int cutoff = currentTs - windowSizeInSeconds;
        while (!window.isEmpty() && window.peekFirst().ts() <= cutoff) {
            sum -= window.pollFirst().val();
        }
    }

    public static void main(String[] args) {
        TimeMovingAverage ma = new TimeMovingAverage(5);

        System.out.println(ma.next(10, 1));
        System.out.println(ma.next(20, 2));
        System.out.println(ma.next(30, 6));
        System.out.println(ma.next(40, 7));
        System.out.println(ma.next(50, 12));
    }
}
