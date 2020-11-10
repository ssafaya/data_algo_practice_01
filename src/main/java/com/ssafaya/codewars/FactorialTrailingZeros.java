package com.ssafaya.codewars;

import java.math.BigInteger;

public class FactorialTrailingZeros {

    public static void main(String[] args) {
//        int num = 490623148;
        int num = 490623148;
        System.out.println(zeros(num));
    }

    public static int zeros(int n) {
        // your beatiful code here
        System.out.println("-----\n Input value : " + n);
        BigInteger fact = calcFactorial(n);
        System.out.println("Factorial value : " + fact);

        char[] arr = String.valueOf(fact).toCharArray();
        int count = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
//            System.out.println(String.format("In loop : i = %s, arr[i] = %s.", i, arr[i]));
            if(arr[i] == '0') {
//                System.out.println(String.format("count : %d", count));
                count++;
//                System.out.println(String.format("count : %d", count));
            } else {
                break;
            }
        }
        return count;
    }

    private static BigInteger calcFactorial(int n) {
        BigInteger result = new BigInteger("1");
        if(n == 0) {
            return result;
        } else {
            while(n > 0) {
//                System.out.println(String.format("%d * %d", result, n));
                result = result.multiply(new BigInteger(String.valueOf(n)));
                n--;
            }
            return result;
        }
    }
}
