package com.ssafaya.hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/**
 * Given a chocolate bar, two children, Lily and Ron, are determining how to share it. Each of the squares has an integer on it.
 *
 * Lily decides to share a contiguous segment of the bar selected such that:
 *
 * The length of the segment matches Ron's birth month, and,
 * The sum of the integers on the squares is equal to his birth day.
 * You must determine how many ways she can divide the chocolate.
 *
 * Consider the chocolate bar as an array of squares, . She wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .
 *
 * Function Description
 *
 * Complete the birthday function in the editor below. It should return an integer denoting the number of ways Lily can divide the chocolate bar.
 *
 * birthday has the following parameter(s):
 *
 * s: an array of integers, the numbers on each of the squares of chocolate
 * d: an integer, Ron's birth day
 * m: an integer, Ron's birth month
 * Input Format
 *
 * The first line contains an integer , the number of squares in the chocolate bar.
 * The second line contains  space-separated integers , the numbers on the chocolate squares where .
 * The third line contains two space-separated integers,  and , Ron's birth day and his birth month.
 *
 * Constraints
 *
 * , where ()
 * Output Format
 *
 * Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.
 */
public class ChocolateProblem {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        if(s == null || s.size() < 1 || s.size() > 100
                || d < 1 || d > 31 || m < 1 || m > 12) {
            throw new IllegalArgumentException("Input values out of range.");
        }

        //d --> sum
        //m --> contiguous block size
        int result = 0;
        int size = s.size();
        for(int i = 0; i < size; i++) {
            int[] block = getBlock(s, i, m);
            if(doesBlockMeetConditions(block, d)) {
                result++;
            }
        }

        return result;
    }

    private static int[] getBlock(List<Integer> s, int startInd, int blockLen) {
        int[] block = new int[blockLen];
        for(int i = 0, j = startInd; i < blockLen && j < s.size(); i++, j++) {
            block[i] = s.get(j);
        }
        return block;
    }

    private static boolean doesBlockMeetConditions(int[] block, int d) {
        int sum = 0;
        for(int i = 0; i < block.length; i++) {
//            if(block[i] != null) {
                sum += block[i];
//            }
        }

        return sum == d;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
