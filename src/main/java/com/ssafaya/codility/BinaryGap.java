package com.ssafaya.codility;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(1041));
        System.out.println(solution(51712));
        System.out.println(solution(561892));
        System.out.println(solution(74901729));
        System.out.println(solution(1376796946));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        if(N < 1) {
            throw new IllegalArgumentException("Expected a positive Integer.");
        }
        System.out.println("Input: " + N);
        String binaryVal = Integer.toString(N, 2);
        System.out.println("Binary: " + binaryVal);
        char[] arr = binaryVal.toCharArray();
        int maxCount = 0;
        int currCount = 0;
        boolean foundOne = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '0'&& !foundOne) {
                continue;
            } else if(arr[i] == '0') {
                currCount++;
            } else {
                if(maxCount < currCount) {
                    maxCount = currCount;
                }
                currCount = 0;
                foundOne = true;
            }
        }
        System.out.println("Result: " + maxCount);
        System.out.println("---------------");
        return maxCount;

    }
}
