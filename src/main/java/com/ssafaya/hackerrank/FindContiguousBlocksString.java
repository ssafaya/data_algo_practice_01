package com.ssafaya.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Asked in VNG interview on white-paper.
 */
public class FindContiguousBlocksString {

    private static String str = "aaabccdddeeeeefffghh";

    public static void main(String[] args) {
        System.out.println(str);
        List<String> res = solution(str);

        System.out.println(res);

    }

    private static List<String> solution(String s) {

        List<String> l = new ArrayList<>();
        char[] arr = s.toCharArray();
        char key = arr[0];
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length;i++) {
            if(key == arr[i]) {
                sb.append(arr[i]);
            } else {
                l.add(sb.toString());
                sb = new StringBuffer();
                sb.append(arr[i]);
                key = arr[i];
            }
        }
        l.add(sb.toString());

        return l;
    }
}
