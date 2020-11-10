package com.ssafaya.codility;

import java.util.stream.IntStream;

// Find the missing element in a given permutation.
public class ArrayMissingElement2 {

    public int solution(int[] A) {
        int len = A.length;

        //long idealSum = (len *(len +1)) / 2;
        long idealSum = ((len+1) *((len+1) +1)) / 2;
        //System.out.println(idealSum);

        long actualSum = IntStream.of(A).sum();
        //long actualSum = ((len+1) *((len+1) +1)) / 2;
        //System.out.println(actualSum);

        long result = idealSum - actualSum;
        //System.out.println(result);

        return (int)result;
    }

}
