package com.ssafaya.codility;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        // Basic
        Arrays.sort(A);
        int miss = 1;
        int result = -1;
        for(int i =0; i < A.length; i++) {
            // if(A[i] == miss) {
            //     mis++;
            // } else {
            //     result = 0;
            // }
            if(i+1 == A[i]) {
                continue;
            } else {
                miss = 0;
                break;
            }
        }
        return miss;
    }
}
