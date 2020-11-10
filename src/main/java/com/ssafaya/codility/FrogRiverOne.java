package com.ssafaya.codility;

import java.util.Set;
import java.util.HashSet;

public class FrogRiverOne {
    public static void main(String[] args) {

    }

    public int solution(int X, int[] A) {

        Set<Integer> valuesFound = new HashSet();
        int jump = 0;
        for(int i = 0; i < A.length; i++) {
            System.out.println("Iteration : " + i);
            if(valuesFound.size() == X) {
                break;
            }
            valuesFound.add(A[i]);
            jump++;
            System.out.println("Set size : " + valuesFound.size());
            System.out.println("Jumps: " + jump);
        }
        if(valuesFound.size() < X) {
            return -1;
        } else {
            return jump - 1;
        }
    }
}
