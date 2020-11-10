package com.ssafaya.codility;

import java.util.*;

public class OddValueArray {

    public int solution(int[] A) {
        if(A.length < 1 || A.length > 1000000) {
            throw new IllegalArgumentException("Array length exceeding allowed range of 1 to 1000000. " + A.length);
        }

        // Simple sol
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < A.length; i++) {
            int val = A[i];
            System.out.println("Val : " + val);
            if(map.get(val) == null) {
                map.put(val, 1);
                System.out.println("Put : " + val);
            } else {
                //int newVal = map.get(val) + 1;
                //map.put(val, newVal);
                map.remove(val);
                System.out.println("Remove : " + val);
            }
        }
        int result = -1;
        System.out.println("Map size : " + map.size());
        for(int k : map.keySet()) {
            result = k;
        }
        System.out.println("Result : " + result);
        return result;
    }

    public int solution2(int[] A) {
        if(A.length < 1 || A.length > 1000000) {
            throw new IllegalArgumentException("Array length exceeding allowed range of 1 to 1000000. " + A.length);
        }

        // Simple sol
        Set<Integer> set = new HashSet();
        for(int i = 0; i < A.length; i++) {
            int val = A[i];
            if(!set.contains(val)) {
                set.add(val);
            } else {
                //int newVal = map.get(val) + 1;
                //map.put(val, newVal);
                set.remove(val);
            }
        }
        int result = -1;
        for(int k : set) {
            result = k;
        }
        return result;
    }

    public int solution3(int[] A) {

        if(A.length == 1) {
            return A[0];
        }
        // sort
        Arrays.sort(A);
        // find mismatch
        int result = -1;
        for(int i = 0; i < A.length - 1; i=i+2) {
            if(A[i] == A[i+1]) {
                continue;
            }
            // first elemnt would be the unpaired one.
            result = A[i];
            break;
        }
        if(result == -1) {
            result = A[A.length - 1];
        }
        return result;
    }
}
