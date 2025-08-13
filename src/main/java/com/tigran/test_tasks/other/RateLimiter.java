package com.tigran.test_tasks.other;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tigran Melkonyan
 * Date: 8/11/25
 * Time: 4:57 PM
 */
public class RateLimiter {

    private final int maxRequests;
    private final int windowSizeInSeconds;

    private final Map<String, Deque<Integer>> history = new HashMap<>();

    public RateLimiter(int maxRequests, int windowSizeInSeconds) {
        this.maxRequests = maxRequests;
        this.windowSizeInSeconds = windowSizeInSeconds;
    }

    public boolean allowRequest(String userId, int timestamp) {
        Deque<Integer> q = history.computeIfAbsent(userId, k -> new ArrayDeque<>());

        int cutoff = timestamp - windowSizeInSeconds;
        while (!q.isEmpty() && q.peekFirst() <= cutoff) {
            q.pollFirst();
        }

        if (q.size() < maxRequests) {
            q.addLast(timestamp);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RateLimiter limiter = new RateLimiter(3, 10); // K=3, T=10 seconds

        System.out.println(limiter.allowRequest("alice", 1));  // true
        System.out.println(limiter.allowRequest("alice", 2));  // true
        System.out.println(limiter.allowRequest("alice", 3));  // true
        System.out.println(limiter.allowRequest("alice", 4));  // false (limit reached)
        System.out.println(limiter.allowRequest("alice", 12)); // true (first request expired)
        System.out.println(limiter.allowRequest("bob", 13));   // true (new user)
        System.out.println(limiter.allowRequest("bob", 14));   // true
        System.out.println(limiter.allowRequest("bob", 15));   // true
        System.out.println(limiter.allowRequest("bob", 16));   // false
    }
}
