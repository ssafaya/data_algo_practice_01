package com.ssafaya.codility;

public class TapeEquilibrium {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length - 1; i++) {
            // find left
            int l = sum(A, i, i+1);
            // find right
            int r = sum(A, i+1, A.length);
            // find diff
            int res = Math.abs(l - r);
            // store result
            if(min > res) {
                min = res;
            }
        }
        return min;
    }

    private int sum(int[] arr, int st, int en) {
        int sum = 0;
        for(int i = st; i < en; i++) {
            sum+=arr[i];
        }
        return sum;
    }


    //------- SOLUTION-2
    public int solution2(int[] A) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length - 1; i++) {
            // find left
            int l = sum(A, i, i+1);
            // find right
            int r = sum(A, i+1, A.length);
            // find diff
            int res = Math.abs(l - r);
            // store result
            if(res ==1 ) {
                return res;
            }
            if(min > res) {
                min = res;
            }
        }
        return min;
    }
}
