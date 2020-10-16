package com.ssafaya.progs.ds;

public class CircularQueue {

    private int[] arr;
    private int capacity = 5;
    private int size = 0;

    private int front = 0;
    private int rear = -1;

    public CircularQueue() {
        this.arr = new int[capacity];
    }

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public static void main(String[] args) {
        System.out.println("Starting program ...");
        System.out.println("--------------------");

        CircularQueue q = new CircularQueue();
        q.viewQueue();
        q.front();
        q.rear();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.viewQueue();
        q.front();
        q.rear();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.viewQueue();
        q.front();
        q.rear();
        System.out.println("-----");

        q.enqueue(71);
        q.enqueue(72);
        q.enqueue(73);
        q.enqueue(74);
        q.enqueue(75);
        q.viewQueue();
        q.front();
        q.rear();

        q.dequeue();
        q.viewQueue();
        q.front();
        q.rear();

        q.enqueue(76);
        q.viewQueue();
        q.front();
        q.rear();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.viewQueue();
        q.front();
        q.rear();

        q.enqueue(80);
        q.enqueue(85);
        q.enqueue(90);
        q.viewQueue();
        q.front();
        q.rear();

        System.out.println("--------------------");
        System.out.println("Program executed successfully.");

    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is full. Cannot insert : " + data);
            return;
        }
        rear = (rear + 1) % capacity;
        this.arr[rear] = data;
        this.size++;
        System.out.println("Inserted into queue : " + data);
        System.out.println("Queue size : " + getSize());
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return;
        }
        int value = this.arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Removed value from queue : " + value);
        System.out.println("Queue size : " + getSize());
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int front() {
        if(isEmpty()) {
            System.out.println("Queue ie empty. No front value.");
            return Integer.MIN_VALUE;
        }
        int val = this.arr[front];
        System.out.println("Front value : " + val);
        return val;
    }

    public int rear() {
        if(isEmpty()) {
            System.out.println("Queue is empty. No rear value.");
            return Integer.MIN_VALUE;
        }
        int val = this.arr[rear];
        System.out.println("Rear value : " + val);
        return val;
    }

    public void viewQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Cannot view contents.");
            return;
        }
        //TODO: Think about better logic.
        System.out.println("Queue contents : ");
        System.out.println("--");
        if(front < rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(this.arr[i] + " ");
            }
        } else {
            for (int i = front; i < capacity; i++) {
                System.out.print(this.arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(this.arr[i] + " ");
            }
        }
        System.out.println("--");
    }
}
