package com.tigran.test_tasks.other.amortized;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Tigran Melkonyan
 * Date: 8/13/25
 * Time: 2:17 PM
 */
public class HitCounter {

    private final Deque<Integer> hits = new ArrayDeque<>();
    private final int windowSizeInSeconds;

    public HitCounter(int windowSizeInSeconds) {
        this.windowSizeInSeconds = windowSizeInSeconds;
    }

    private void cleanup(int timestamp) {
        int cutoff = timestamp - windowSizeInSeconds;
        while (!hits.isEmpty() && hits.peekFirst() <= cutoff) {
            hits.pollFirst();
        }
    }

    public void hit(int timestamp) {
        cleanup(timestamp);
        hits.addLast(timestamp);
    }

    public int getHits(int timestamp) {
        cleanup(timestamp);
        return hits.size();
    }

    public static void main(String[] args) {
        HitCounter counter = new HitCounter(300);

        counter.hit(1);
        counter.hit(1);
        counter.hit(2);

        System.out.println(counter.getHits(3));
        counter.hit(300);
        System.out.println(counter.getHits(300));
        System.out.println(counter.getHits(301));
    }
}
