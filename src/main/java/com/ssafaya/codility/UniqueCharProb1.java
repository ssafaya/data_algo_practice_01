package com.ssafaya.codility;

// Problem asked in live-coding exercise - Not solved.
// Input:   abbccccddaaccc
// Output: a2b4c2d2a2c
public class UniqueCharProb1 {

    public static void main(String[] args) {
        String in = "abbccccddaaccc";
        String res = solution(in);
        System.out.println(res);
    }

    /*
    Convert String to char array
    Set prevChar to ast Char
    Set count to 0;
    Loop through char array
        Pick each char.
        Compare it with prev/cached char
        if Equals
            increment count
            set prevChar to currentChar
        Else
            flush count & char value to output
            reset count
            set prevChar to currentChar

    Loop Close
    flush count & char value to output

    Stop
     */
    private static String solution(String in) {
        String res = "";

        char[] arr = in.toCharArray();

        int count = 0;
        Character key = arr[0];
        for(Character c : arr) {
            if(c == key) {
                count++;
            } else {
                res += chunk(count, key);
                count = 1;
            }
            key = c;
        }
        res += chunk(count, key);

        return res;
    }

    private static String solution2(String in) {
        String res = "";

        char[] arr = in.toCharArray();

        int count = 0;
        Character key = null;
        for(Character c : arr) {
            if(count == 0) {
                key = c;
                count++;
            } else {
                if(key == c) {
                    count++;
                } else {
                    res += "" + count + "" + c;
                    count = 0;
                    key = null;
                }
            }

        }

        return res;
    }

    private static String chunk(int count, Character c) {
        if(count <= 1) {
            return String.valueOf(c);
        } else {
            return count + "" + c;
        }
    }
}
