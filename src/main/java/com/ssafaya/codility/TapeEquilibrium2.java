package com.ssafaya.codility;

public class TapeEquilibrium2 {

    public static void main(String[] args) {

    }

    // ---------- Good performance: O(n) ----------
    public int solution(int[] A) {
        long left = A[0];
        long right = 0;
        for(int i = 1; i < A.length; i++) {
            right+=A[i];
        }
        long d = left - right;
        int ans = Math.abs((int)d);

        for(int j = 1; j < A.length - 1; j++) {
            int val = A[j];
            left+=val;
            right-=val;

            long dd = left - right;
            int diff = Math.abs((int)dd);
            if(diff < ans) {
                ans = diff;
            }
        }

        return ans;
    }
}
