package com.ssafaya.codility;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {
    public int solution2(int[] A) {
        Arrays.sort(A);
        int prev = 0;
        int result = -1;
        for(int i = 0; i < A.length; i++) {
            int val = A[i];
            if(val < 1) {
                continue;
            }
            if(val == prev) {
                continue;
            }
            if(val - prev == 1) {
                prev = val;
            } else if(val - prev > 1) {
                result = val - 1;
            }
        }
        if(result == -1) {
            result = A[A.length - 1] + 1;
        }
        if(result == 0) {
            result++;
        }
        return result;
    }

    public int solution(int[] A) {

        Set<Integer> set = new TreeSet();
        //Arrays.sort(A);
        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0)
                set.add(A[i]);
        }
        if(set.size() == 0) {
            return 1;
        }
        int prev = -1;
        int result = -1;
        for(int currVal : set) {
            // If diff > 1, means missing value as set is sorted.
            if(prev != -1 && (currVal - prev) > 1) {
                result = currVal - 1;
                break;
            }
            prev = currVal;
        }
        // If no missing then return last val + 1
        if(result == -1) {
            return prev + 1;
        }
        return result;
    }

    public int solution_Online(int[] A) {
        Arrays.sort(A);
        int min = 1;

        // Starting from 1 (min), compare all elements, if it does not match
        // that would the missing number.
        for (int i : A) {
            if (i == min) {
                min++;
            }
        }

        return min;
    }
}
