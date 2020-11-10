package com.ssafaya.codewars;

/**
 * PROBLEM:
 * Take 2 strings s1 and s2 including only letters from ato z.
 * Return a new sorted string, the longest possible, containing distinct letters,
 * * each taken only once - coming from s1 or s2.
 */
public class TwoToOneString {

    private static final String s1 = "xyaabbbccccdefww";
    private static final String s2 = "xxxxyyyyabklmopq";

   public static void main(String[] args) {
       System.out.println(longest(s1, s2));
   }

   private static String longest(String s1, String s2) {
       String result = "";

       char[] arr1 = s1.toCharArray();
       char[] arr2 = s2.toCharArray();

       int size = arr1.length + arr2.length;
       char[] resultArr = new char[size];
       int resultArrIndex = 0;

       for(char c : arr1) {
           if(!isCharFound(c, resultArr)) {
               resultArr[resultArrIndex] = c;
               resultArrIndex++;
           }
       }

       for(char c : arr2) {
           if(!isCharFound(c, resultArr)) {
               resultArr[resultArrIndex] = c;
               resultArrIndex++;
           }
       }
       resultArr = sortChar(resultArr);
       result = String.valueOf(resultArr);
       return result.trim();
   }

   private static boolean isCharFound(char c, char[] arr) {
       for(char e : arr) {
           if(c == e) {
               return true;
           }
       }
       return false;
   }

   private static char[] sortChar(char[] arr) {
       for(int i = 0; i < arr.length - 1; i++) {
           for(int j = i + 1; j < arr.length; j++) {
               int c1 = arr[i];
               int c2 = arr[j];

               if(c1 > c2) {
                   char temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
       return arr;
   }

   private void charCheck() {
       int c1 = 'A';
       int c2 = 'Z';
       System.out.println(c1);
       System.out.println(c2);
   }

   private String solution(String s1, String s2) {
       String s = s1 + s2;
       return s.chars()
               .distinct()
               .sorted()
               .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
               .toString();
   }
}
