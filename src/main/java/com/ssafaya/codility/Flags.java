package com.ssafaya.codility;

import java.util.List;
import java.util.ArrayList;

public class Flags {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        // Basic
        // find peaks
        int prev = 0;
        List<Integer> peaks = new ArrayList();
        for(int i = 0; i < A.length - 1; i++) {
            int curr = A[i];
            int next = A[i + 1];

            if(prev < curr && curr > next) {
                //peak found
                peaks.add(i);
            }
            prev = curr;
        }
        if(prev < A[A.length - 1]) {
            peaks.add(A.length - 1);
        }

        System.out.println(peaks);

        int maxFlags = peaks.size();
        int flagsSet = 0;
        while(maxFlags >=0 && maxFlags == flagsSet) {

        }

        return -1;
    }
}
