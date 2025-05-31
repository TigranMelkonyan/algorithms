package com.tigran.test_tasks.other;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Tigran Melkonyan
 * Date: 5/14/25
 * Time: 4:52 PM
 */
public class EventAggregator {

    public static void main(String[] args) {

        EventAggregator aggregator = new EventAggregator();

        aggregator.addEvent(1000);
        aggregator.addEvent(2000);
        aggregator.addEvent(3000);
        aggregator.addEvent(4000);
        aggregator.addEvent(4100);
        System.out.println(aggregator.countEventsInLast(1500, 4000));
    }

    private final Deque<Long> buffer = new LinkedList<>();

    public void addEvent(long timestampMillis) {
        buffer.addLast(timestampMillis);
    }

    public int countEventsInLast(long windowMillis, long currentTimeMillis) {
        long windowStart = currentTimeMillis - windowMillis;
        int count = 0;

        for (long timestamp : buffer) {
            if (timestamp >= windowStart && timestamp <= currentTimeMillis) {
                count++;
            }
        }

        return count;
    }
}
