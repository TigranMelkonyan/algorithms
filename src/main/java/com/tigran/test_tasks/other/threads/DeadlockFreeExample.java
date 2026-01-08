package com.tigran.test_tasks.other.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockFreeExample {
    
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> acquireLocks("Thread 1", lock1, lock2));
        Thread thread2 = new Thread(() -> acquireLocks("Thread 2", lock2, lock1));

        thread1.start();
        thread2.start();
    }

    private static void acquireLocks(String threadName,
                                     ReentrantLock firstLock,
                                     ReentrantLock secondLock) {

        while (true) {
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;

            try {
                // Try to acquire first lock
                gotFirstLock = firstLock.tryLock(1, TimeUnit.SECONDS);
                if (gotFirstLock) {
                    System.out.println(threadName + " acquired first lock");

                    // Try to acquire second lock
                    gotSecondLock = secondLock.tryLock(1, TimeUnit.SECONDS);
                    if (gotSecondLock) {
                        System.out.println(threadName + " acquired second lock");
                        System.out.println(threadName + " doing work...");
                        break; // both locks acquired, exit loop
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                // Release locks if not both acquired
                if (!gotSecondLock && gotFirstLock) {
                    firstLock.unlock();
                    System.out.println(threadName + " released first lock");
                }
            }

            // Back off before retrying
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Release locks after work
        secondLock.unlock();
        firstLock.unlock();
        System.out.println(threadName + " released both locks");
    }
}
