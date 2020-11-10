package com.ssafaya.codility;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Dominator {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        // Basic

        Map<Integer, List> map = new HashMap();
        for(int i = 0; i < A.length; i++) {
            int val = A[i];
            if(map.get(val) == null) {
                List<Integer> indexes = new ArrayList();
                indexes.add(i);
                map.put(val, indexes);
            } else {
                map.get(val).add(i);
            }
        }
        for(int k : map.keySet()) {
            if(map.get(k).size() > A.length/2) {
                List<Integer> ls = map.get(k);
                return ls.get(0);
            }
        }

        return -1;
    }
}
