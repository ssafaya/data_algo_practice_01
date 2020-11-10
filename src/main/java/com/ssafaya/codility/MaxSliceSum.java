package com.ssafaya.codility;

public class MaxSliceSum {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        // Basic
        long maxSum = Long.MIN_VALUE;
        for(int P = 0; P < A.length; P++) {
            //int aP = A[P];
            for(int Q = 0; Q < A.length; Q++) {
                //int aQ = A[Q];
                long sum = findSum(A, P, Q);
                if(maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return (int)maxSum;
    }

    private long findSum(int[] arr, int start, int end) {
        long sum = 0;
        for(int i = start; i <= end; i++) {
            sum+=arr[i];
        }

        return sum;
    }

    //----------KADANE's ALGO

    public int solutionKadane(int[] A) {
        // Kadane' Algo

        long maxCurrent = A[0];
        long maxGlobal = A[0];

        for(int i = 1; i < A.length - 1; i++) {
            maxCurrent = Math.max(A[i], (A[i] + maxCurrent));
            if(maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return (int)maxGlobal;
    }
}
