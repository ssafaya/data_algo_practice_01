package com.ssafaya.progs.multithreading;

public class ThreadInterrupt2 {

    public static void main(String[] args) throws Exception {

//        Thread t1 = new Thread(() -> System.out.println("Printing thread-1."));
//        Thread t2 = new Thread(() -> System.out.println("Printing thread-2."));

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
//                    System.out.println("Thread-1 printing : " + i + " : Is Interrupted : " + Thread.currentThread().isInterrupted());
//                    if (Thread.currentThread().isInterrupted()) {
                    if (Thread.interrupted()) {
                        System.out.println("Inside interrupted.");
                        throw new RuntimeException("Thread-1 is interrupted.");
                    }
                }
//                    System.out.println("Is Interrupted : " + Thread.currentThread().isInterrupted());
//                    System.out.println("Thread-1 is interrupted.");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
//                    System.out.println("Thread-2 printing : " + i * 1000 + " : Is Interrupted : " + Thread.currentThread().isInterrupted());
//                    if (Thread.currentThread().isInterrupted()) {
                    if (Thread.interrupted()) {
                        System.out.println("Inside interrupted.");
                        throw new RuntimeException("Thread-1 is interrupted.");
                    }
                }
//                    System.out.println("Is Interrupted : " + Thread.currentThread().isInterrupted());
//                    System.out.println("Thread-2 is interrupted.");
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(2000);
        t1.interrupt();
        System.out.println("Main : Thread-1 : Is Interrupted : " + t1.isInterrupted());

        Thread.sleep(2000);
        t2.interrupt();
        System.out.println("Main : Thread-2 : Is Interrupted : " + t2.isInterrupted());

        t1.join();
        t2.join();
//        System.out.println("Thread-1 : Is Interrupted : " + t1.isInterrupted());
//        System.out.println("Thread-2 : Is Interrupted : " + t2.isInterrupted());
        Thread.sleep(2000);
        System.out.println("Process completed.");
    }
}
