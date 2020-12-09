package com.ssafaya.hackerrank;

public class SuperReducedString {

    private static String str = "aaabccddd";

    public static void main(String[] args) {
        System.out.println(str);
        String res = superReducedString(str);
        System.out.println(res);
    }

    private static String superReducedString(String s) {
        char[] c = s.toCharArray();
        int dupInd = hasDups(c);
        while(dupInd != -1) {
            String str = compress(c, dupInd);
            c = str.toCharArray();
            dupInd = hasDups(c);
        }

        if(c.length == 0) {
            return "Empty String";
        } else {
            return String.valueOf(c);
        }
    }

    private static int hasDups(char[] c) {
        for(int i=0; i < c.length - 1; i++) {
            if(c[i] == c[i+1]) {
                return i;
            }
        }
        return -1;
    }

    private static String compress(char[] c, int dupInd) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < dupInd; i++) {
            sb.append(c[i]);
        }
        for(int i=dupInd+2; i < c.length; i++) {
            sb.append(c[i]);
        }
        System.out.println("returning : " + sb.toString());
        return sb.toString();
    }

}
