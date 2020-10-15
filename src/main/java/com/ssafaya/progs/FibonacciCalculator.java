package com.ssafaya.progs;

public class FibonacciCalculator {
    private static final int inputNum = 30;
    private static int stepCounter = 0;

    public static void main(String[] args) {
        System.out.println("Starting fibonacci calculation...");
        int result = calcFib(inputNum);
        System.out.println("Fibonacci Calculation completed. Result : " + result);
        System.out.println("Total Steps : " + stepCounter);
    }

    private static int calcFib(int num) {

        System.out.println("Calc Fib for Num : " + num);
        stepCounter++;
        int result = 0;
        if(num == 0) {
            result = 0;
        } else if(num == 1) {
            result = 1;
        } else if(num > 1) {
            result = calcFib(num - 1) + calcFib(num - 2);
        } else {
            throw new RuntimeException("Invalid input passed. Input should be >= 0." + num);
        }

        System.out.println("Result for Fib num: " + num + " is: " + result);
        return result;
    }
}
