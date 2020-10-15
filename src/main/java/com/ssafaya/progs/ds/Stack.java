package com.ssafaya.progs.ds;

public class Stack {

    private int[] arr;
    private int capacity = 5;
    private int index = -1;

    public Stack() {
        this.arr = new int[capacity];
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public static void main(String[] args) {
        System.out.println("Starting program...");
        System.out.println("--------------------");

        Stack stack = new Stack();
        stack.viewStack();
        stack.peek();
        stack.size();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        stack.viewStack();
        stack.peek();
        stack.size();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.viewStack();
        stack.peek();
        stack.size();

        stack.push(80);
        stack.push(90);

        stack.viewStack();
        stack.peek();
        stack.size();

        System.out.println("--------------------");
        System.out.println("Program executed successfully.");
    }

    public void push(int input) {
        if(isFull()) {
            System.out.println("Stack is full. Cannot insert: " + input);
            return;
        }
        index++;
        arr[index] = input;
        System.out.println("Pushed into stack : " + input);
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int data = arr[index];
        arr[index] = 0;
        index--;
        System.out.println("Popped from stack : " + data);
    }

    public boolean isFull() {
        return index == capacity - 1;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        int data = arr[index];
        System.out.println("Peek into stack: " + data);
        return data;
    }

    public int size() {
        int size = index + 1;
        System.out.println("Stack size: " + size);
        return size;
    }

    private void viewStack() {
        System.out.println("Stack contents: ");
        System.out.println("--");
        for(int i = index; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n--");
    }
}
