package com.tigran.test_tasks.other.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDeadlockExample {

    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        // Thread 1 locks lock1, then lock2
        Thread thread1 = new Thread(() -> {
            lock1.lock();
            try {
                System.out.println("Thread 1: Locked Lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }

                lock2.lock();
                try {
                    System.out.println("Thread 1: Locked Lock2");
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
        });

        // Thread 2 locks lock2, then lock1
        Thread thread2 = new Thread(() -> {
            lock2.lock();
            try {
                System.out.println("Thread 2: Locked Lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }

                lock1.lock();
                try {
                    System.out.println("Thread 2: Locked Lock1");
                } finally {
                    lock1.unlock();
                }
            } finally {
                lock2.unlock();
            }
        });

        thread1.start();
        thread2.start();
    }
}
