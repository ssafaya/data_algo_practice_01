package com.ssafaya.codility;

public class MaxCounters {

    public static void main(String[] args) {

    }

    public int[] solution(int N, int[] A) {
        int maxVal = N + 1;

        int[] counters = new int[N];
        int maxCounter = 0;
        for(int i = 0; i < A.length; i++) {
            int val = A[i];
            if(val == maxVal) {
                setMaxCount(counters, maxCounter);
            } else {
                counters[val - 1] = counters[val - 1] + 1;
                if(maxCounter < counters[val - 1]) {
                    maxCounter = counters[val - 1];
                }
            }
        }

        return counters;
    }

    private void setMaxCount(int[] arr, int max) {
        for(int j = 0; j < arr.length; j++) {
            arr[j] = max;
        }
    }
}
