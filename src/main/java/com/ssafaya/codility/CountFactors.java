package com.ssafaya.codility;

import java.util.Set;
import java.util.HashSet;

public class CountFactors {
    public static void main(String[] args) {

    }

    public int solution(int N) {
        // Basic
        if(N == 1) {
            return 1;
        }
        int count = 1;
        for(int i = 2; i <= N; i++ ) {
            if(N % i == 0) {
                count++;
            }
        }

        return count;
    }

    // Using divisor pairing logic.
    public int solution2(int N) {
        // Basic
        Set<Integer> set = new HashSet();
        int len = (int)Math.sqrt(N);
        for(int i = 2; i <= len; i++ ) {
            if(N % i == 0) {
                set.add(i);
                set.add(N/i);
            }
        }

        return set.size() + 2;
    }

    private void sqrt() {
        int v = (int) Math.sqrt(7);
    }
}
