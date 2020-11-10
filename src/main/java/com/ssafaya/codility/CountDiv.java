package com.ssafaya.codility;

import java.util.List;
import java.util.ArrayList;

public class CountDiv {

    public static void main(String[] args) {

    }

    public int solution(int A, int B, int K) {
        // Basic

        int count = 0;
        for(int i = A; i <= B; i++) {
            if(i % K == 0) {
                count++;
            }
        }
        // for(int i = 0; i <= 1000000000; i++) {
        //     if(i % K == 0) {

        //     }
        // }

        //return ls.size();
        return count;
    }


}
