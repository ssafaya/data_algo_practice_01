package com.ssafaya.hackerrank.easy;

import java.io.IOException;

public class CountingValleySol {

    public static void main(String[] args) throws IOException {
        int steps = 8;
        String path = "UDDDUDUU";

        int result = CountingValley.countingValleys(steps, path);
        System.out.println("Result : " + result);
    }

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        char[] arr = path.toCharArray();
        int level = 0;
        int prevLevel = 0;
        int val = 0;
        for(char c : arr) {
            prevLevel = level;
            if(c == 'U') {
                level++;
            } else if(c == 'D') {
                level--;
            }

            if(level == 0 && prevLevel < 0) {
                val++;
            }
        }

        return val;
    }
}
