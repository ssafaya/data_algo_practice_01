package com.ssafaya.hackerrank.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, print the size of a maximal subset of  where the sum of any  numbers in  is not evenly divisible by .
 * For example, the array  and . One of the arrays that can be created is . Another is . After testing all permutations, the maximum length solution array has  elements.
 *
 * Function Description
 * Complete the nonDivisibleSubset function in the editor below. It should return an integer representing the length of the longest subset of  meeting the criteria.
 *
 * nonDivisibleSubset has the following parameter(s):
 *
 * S: an array of integers
 * k: an integer
 * Input Format
 *
 * The first line contains  space-separated integers,  and , the number of values in  and the non factor.
 * The second line contains  space-separated integers describing , the unique values of the set.
 *
 * Constraints
 *
 * All of the given numbers are distinct.
 * Output Format
 *
 * Print the size of the largest possible subset ().
 *
 * Sample Input
 *
 * 4 3
 * 1 7 2 4
 * Sample Output
 *
 * 3
 *
 */
public class NonDivisibleSubset {

    private static List<Integer> SAMPLE_INPUT = Arrays.asList(1, 7, 2, 4);
    private static int k = 3;

    public static void main(String[] args) {
        int solution = solution(k, SAMPLE_INPUT);
        System.out.println(solution);
    }

    private static int solution(int k, List<Integer> s) {


        return 0;
    }
}
