package com.ssafaya.hackerrank.easy;

import java.util.Set;
import java.util.HashSet;

public class Pangram {

    public static void main(String[] args) {

    }

    // Complete the pangrams function below.
    static String pangrams(String s) {
        s = s.toLowerCase();

        Set<Character> set = new HashSet();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            char c = arr[i];
            if(c != ' ') {
                set.add(c);
            }
        }

        if(set.size() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }

    }
}
