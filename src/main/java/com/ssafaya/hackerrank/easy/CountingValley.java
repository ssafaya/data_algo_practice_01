package com.ssafaya.hackerrank.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountingValley {

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

    private static int level = 0;

    // UDDDUDUU
    public static int countingValleys(int steps, String path) {
        char[] arr = path.toCharArray();
        int len = arr.length;

        char prev = arr[0];
        char prevChange = ' ';
        int valley = 0;
        updateLevel(prev);
        for(int i=1; i<len; i++) {
            char curr = arr[i];
            if(curr == prev) {
                // Do nothing
            } else if(prev == 'U' && curr == 'D') {
                if(level > 0) {
                    prevChange = 'M';
                }
                prev = curr;
            } else {
                if(prevChange == ' ' || prevChange == 'M') {
                    valley++;
                }
                prev = curr;
                prevChange = 'D';
            }
            updateLevel(curr);
        }

        return valley;

    }

    private static void updateLevel(char c) {
        if(c == 'U') {
            level += 1;
        } else {
            level -= 1;
        }
    }

}
