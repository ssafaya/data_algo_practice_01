package com.ssafaya.codility;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TempTest {
    public static void main(String[] args) {
        //Arrays.sort();

    }

    public int solution(int[] A) {
        Arrays.sort(A);
        IntStream.of(A).sum();
        for(int i = 0; i < A.length; i++) {
            int el = A[i];
            if(el-1 != i) {
                return el - 1;
            }
        }
        return -1;
    }
}
