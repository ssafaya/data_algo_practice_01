package com.ssafaya.codewars;

import java.util.List;
import java.util.ArrayList;

public class BinaryArrayToNumber {

    private static int[] arr = {0,0,0,1};

    public static void main(String[] args) {
        List<Integer> input = new ArrayList();
        input.add(0);
        input.add(0);
        input.add(0);
        input.add(1);

        System.out.println(convertBinaryArrayToInt(input));
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int intVal = 0;
        // read array in reverse manner
        int size = binary.size();
        for(int i = size - 1, j = 0; i >= 0; i--, j++) {
            //find 2^i for each iteration & dd to result.
            if(binary.get(i) == 1) {
                intVal += pow(j);
            }
        }
        return intVal;
    }

    private static int pow(int exponent) {
        if(exponent ==0) return 1;
        int val = 1;
        while(exponent > 0) {
            val *= 2;
            exponent--;
        }
        return val;
    }
}
