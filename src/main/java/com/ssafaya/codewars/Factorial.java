package com.ssafaya.codewars;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Factorial {

//    private static int num = 490623148;
    private static int num = 39768879;
//    private static int num = 3148;
//    private static int num = 6;
    private static ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        // BigInteger fact = factorial(num);
        BigInteger fact = parallelCalc(num);
        System.out.println("Final result : " + fact);
    }

/*    private static BigInteger factorial(int num) {

        return null;
    }*/

    private static BigInteger parallelCalc(int num) throws InterruptedException, ExecutionException {
        if(num == 0) return new BigInteger("0");

        int mid = num / 2;
        Future<BigInteger> f1 = calculate(1, mid);
        Future<BigInteger> f2 = calculate(mid + 1, num);

        while(!f1.isDone() || !f2.isDone()) {
            System.out.println("Is 1st task completed : " + f1.isDone());
            System.out.println("Is 2nd task completed : " + f2.isDone());
            System.out.println("Waiting ... ");
            Thread.sleep(5000);
        }
        executor.shutdown();

        BigInteger res1 = f1.get();
        System.out.println("Result-1 : " + res1);
        BigInteger res2 = f2.get();
        System.out.println("Result-2 : " + res2);

        return res1.multiply(res2);
    }

    public static Future<BigInteger> calculate(int startNum, int endNum) {
        return executor.submit(() -> {
            return multiplication(startNum, endNum);
        });
    }

    private static BigInteger multiplication(int startNum, int endNum) {
        BigInteger result = new BigInteger("1");
        while(startNum <= endNum) {
            result = result.multiply(new BigInteger(String.valueOf(startNum)));
            startNum++;
        }
        return result;
    }
}
