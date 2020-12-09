package com.ssafaya.practice.random;

public class StringTest1 {

    public static void main(String[] args) {
        String str = "abcdefgh";

        System.out.println(str.length());
        char[] arr = str.toCharArray();
//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        System.out.println(str.charAt(1));
        String[] arr2 = str.split("");
        for(int i=0; i<arr2.length; i++) {
            System.out.println(i + " : " + arr2[i]);
        }


    }
}
