package com.ssafaya.practice.vng;

public class CreateThreads {
    public static void main(String[] args) throws InterruptedException {

        Thread t4 = new Thread(() -> System.out.println("This is lambda task : " + Thread.currentThread().getId()));
        t4.start();

        Thread t1 = new Thread(new Task("task-1"));
        Thread t2 = new Thread(new Task("task-2"));
        Thread t3 = new Thread(new Task("task-3"));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println("Bye...");
    }

    static class Task implements Runnable {

        private String name;

        private Task(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println(this.name + " Thread called. Id: " + Thread.currentThread().getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
