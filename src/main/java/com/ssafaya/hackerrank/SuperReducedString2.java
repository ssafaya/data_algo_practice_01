package com.ssafaya.hackerrank;

public class SuperReducedString2 {

    public static void main(String[] args) {
//        String str = "aaabccddd";
//        String str = "";
        String str = "aabbccdd";
        String result = reduce(str);
        System.out.println(str);
        System.out.println(result);
    }

    private static String reduce(String s) {
        while(hasDups(s)) {
            // Keep reducing
            char[] a = s.toCharArray();
            for(int i=0; i<a.length; i++) {
                int ind = i;
                if(a[i] == a[i+1]) {
                    String pre = s.substring(0, i);
                    String post = "";
                    if(i+2 < a.length) {
                        post = s.substring(i+2, s.length());
                    }
                    s = pre + post;
                    break;
                }
            }
        }
        if(s.isEmpty()) {
            return "Empty String";
        } else {
            return s;
        }
    }

    private static boolean hasDups(String s) {
        if(s.length() < 2){
            return false;
        }
        char[] a = s.toCharArray();
        for(int i=0; i<a.length - 1; i++) {
            if(a[i] == a[i+1]) {
                return true;
            }
        }
        return false;
    }
}
