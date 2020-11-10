package com.ssafaya.codility;

import java.util.Map;
import java.util.HashMap;

public class EquiLeader {


    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 4, 4, 2};
        int sol = solution(arr);
        System.out.println("Solution : " + sol);
    }

    public static int solution(int[] A) {
        // Basic
        int leader = findLeader(A, 0, A.length);
        System.out.println("Leader : " + leader);

        if(leader == -1) {
            return 0;
        }
        // Find equi-leaders
        if(A.length == 1) {
            return 1;
        }
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            System.out.println("--------------------");
            System.out.println("Iteration : " + (i+1));

            System.out.println("Find leader b/w 0 to " + (i+1));
            int leftLeader = findLeader(A, 0, i + 1);
            System.out.println("Left leader : " + leftLeader);

            System.out.println("Find leader b/w " + (i+1) + " to " + (A.length));
            int rightLeader = findLeader(A, i + 1, A.length);
            System.out.println("Right leader : " + rightLeader);

            if(leftLeader == rightLeader) {
                count++;
                System.out.println("Equi-leader found. Total : " + count);
            }
        }

        return count;
    }

    private static int findLeader(int[] arr, int start, int length) {

        if(length == 1) {
            return arr[0];
        }
        Map<Integer, Integer> map = new HashMap();
        for(int i = start; i < length; i++) {
            int val = arr[i];
            if(map.get(val) == null) {
                map.put(val, 1);
            } else {
                map.put(val, map.get(val) + 1);
            }
        }
        for(int k : map.keySet()) {
            if(map.get(k) > (length - start)/2) {
                return k;
            }
        }

        return -1;
    }
}
