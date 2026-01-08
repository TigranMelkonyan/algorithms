package com.tigran.test_tasks.other.threads;

/**
 * Created by Tigran Melkonyan
 * Date: 9/24/25
 * Time: 10:37 AM
 */
public class NonReentrantDeadlock {
    
    private static class Resource1 {
    }

    private static class Resource2 {
    }

    private static final Resource1 resource1 = new Resource1();
    private static final Resource2 resource2 = new Resource2();

    public static void main(String[] args) {

        // Thread 1 locks Resource1, then Resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked Resource1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked Resource2");
                }
            }
        });

        // Thread 2 locks Resource2, then Resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked Resource2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked Resource1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}