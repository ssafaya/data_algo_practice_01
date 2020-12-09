package com.ssafaya.hackerrank.easy;

public class CaesarCipher {
    public static void main(String[] args) {

    }

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        //char[] lc = {'a',bcdefghijklmnopqrstuvwxyz',};
        // A= 65, Z = 90, a = 97, z = 122

        int uMin = 65;
        int uMax = 90;
        int lMin = 97;
        int lMax = 122;

        k = k % 26;
        StringBuffer sb = new StringBuffer();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            char c = arr[i];
            char res = ' ';
            if(isUpper(c, uMin, uMax)) {
                res = getCipher(c, k, uMin, uMax);
            } else if(isLower(c, lMin, lMax)) {
                res = getCipher(c, k, lMin, lMax);
            } else {
                res = c;
            }
            sb.append(res);
        }
        return sb.toString();
    }

    private static boolean isUpper(char c, int min, int max) {
        int cInt = (int)c;
        return cInt >= min && cInt <= max;
    }

    private static boolean isLower(char c, int min, int max) {
        int cInt = (int)c;
        return cInt >= min && cInt <= max;
    }

    private static char getCipher(char c, int k, int min, int max) {
        int cInt = (int)c;
        int pos = cInt + k;
        if(pos <= max) {
            return (char)pos;
        } else {
            pos = min + (pos - max) - 1;
            return (char)pos;
        }
    }
}
