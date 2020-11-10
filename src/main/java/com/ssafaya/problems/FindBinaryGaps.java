package com.ssafaya.problems;

public class FindBinaryGaps {

//    private static final int NUM = 1000;
    private static final int NUM = Integer.MAX_VALUE - 1;
    public static void main(String args[]) {
        System.out.println("Starting program ...");

        FindBinaryGaps g = new FindBinaryGaps();
        System.out.println("Result : " + g.findGaps(NUM));
        System.out.println("Program completed successfully");
    }

    private int findGaps(int decimalVal) {
        String binVal = getBinaryVal(decimalVal);
        System.out.println("Decimal val : " + decimalVal);
        System.out.println("Binary val : " + binVal);

        // Iterate through string.
        int max = 0, currCount = 0;
        char[] arr = binVal.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '0') {
                currCount++;
                continue;
            }
            // reset current
            if(currCount > max) {
                max = currCount;
                currCount = 0;
            }
        }
        if(currCount > max) {
           return currCount;
        } else {
            return max;
        }
    }

    private String getBinaryVal(int decimalVal) {

        return Integer.toString(decimalVal, 2);
    }
}
