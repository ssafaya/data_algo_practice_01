package com.ssafaya.codility;

import java.util.Set;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Distinct {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        Set set = new HashSet();
        for(int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }

    public int solution2(int[] A) {
        long B = IntStream.of(A).distinct().count();

        return (int) B;
    }

}
