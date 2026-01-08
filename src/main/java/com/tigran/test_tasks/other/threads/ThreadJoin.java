package com.tigran.test_tasks.other.threads;

public class ThreadJoin extends Thread {
    public void run() {
        try {
            System.out.println("Worker thread starts");
            Thread.sleep(1000);
            System.out.println("Worker thread finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t = new ThreadJoin();
        t.start();
        t.join();

        System.out.println("Main thread continues after join");
    }
}
