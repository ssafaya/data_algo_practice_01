package com.ssafaya.hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int len = a.size();
        int scoreA = 0;
        int scoreB = 0;
        for(int i=0; i<len;i++) {
            if(a.get(i) > b.get(i)) {
                scoreA++;
            } else if(a.get(i) < b.get(i)) {
                scoreB++;
            }
        }
        List<Integer> ls = new ArrayList<>();
        ls.add(scoreA);
        ls.add(scoreB);
        return ls;
    }
}
