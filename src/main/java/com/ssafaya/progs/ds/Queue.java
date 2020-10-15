package com.ssafaya.progs.ds;

public class Queue {

    private int[] arr;
    private int capacity = 5;
    private int frontIndex = 0;
    private int rearIndex = -1;

    public Queue() {
        this.arr = new int[capacity];
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public static void main(String[] args) {
        System.out.println("Starting program ...");
        System.out.println("--------------------");

        Queue q = new Queue();
        q.size();
        q.viewQueue();
        q.front();
        q.rear();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.size();
        q.viewQueue();
        q.front();
        q.rear();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.size();
        q.viewQueue();
        q.front();
        q.rear();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.size();
        q.viewQueue();
        q.front();
        q.rear();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.size();
        q.viewQueue();
        q.front();
        q.rear();

        q.enqueue(80);
        q.enqueue(90);
        q.size();
        q.viewQueue();
        q.front();
        q.rear();

        System.out.println("--------------------");
        System.out.println("Program executed successfully.");
    }

    public void enqueue(int input) {
        if(isFull()) {
            System.out.println("Queue is full. Cannot insert : " + input);
            return;
        }
        rearIndex++;
        this.arr[rearIndex] = input;
        System.out.println("Inserted into queue : " + input);
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return;
        }
        // Remove front value.
        int data = this.arr[frontIndex];
        // Shift elements 1 step towards front.
        for(int i = frontIndex; i < rearIndex; i++) {
            this.arr[i] = this.arr[i+1];
        }
        // Decrement rearIndex.
        rearIndex--;
        System.out.println("Removed from queue : " + data);
    }

    public boolean isFull() {
        return rearIndex == capacity - 1;
    }

    public boolean isEmpty() {
        return rearIndex == -1;
    }

    public int size() {
        int size = rearIndex + 1;
        System.out.println("Queue size : " + size);

        return size;
    }

    public int front() {
        if(isEmpty()) {
            System.out.println("Queue is empty. No front value.");
            return Integer.MIN_VALUE;
        }

        int val = this.arr[frontIndex];
        System.out.println("Front value : " + val);
        return val;
    }

    public int rear() {
        if(isEmpty()) {
            System.out.println("Queue is empty. No rear value.");
            return Integer.MIN_VALUE;
        }
        int val = this.arr[rearIndex];
        System.out.println("Rear value : " + val);
        return val;
    }

    private void viewQueue() {
        System.out.println("Queue contents:");
        System.out.println("--");
        for(int i = frontIndex; i <= rearIndex; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println("\n--");
    }
}
