package com.ssafaya.hackerrank;

import java.io.*;
import java.util.*;

public class DrawingBook {

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        int stepsFwd = moveFwd(n, p);
        int stepsBack = moveBack(n, p);

        return stepsFwd < stepsBack ? stepsFwd : stepsBack;
    }

    private static int moveFwd(int n, int p) {
        if(p == 1) {
            return 0;
        }
        int ind = 0;
        for(int i = 2; i < n; i+=2) {
            ind++;
            if(p <= (i + 1)) {
                System.out.println("Forward Index : " + ind);
                return ind;
            }
        }
        System.out.println("Forward Index : " + ind);
        return ind;
    }

    private static int moveBack(int n, int p) {
        if(p == n) {
            return 0;
        }
        int ind = 0;
        for(int i = n; i > 0; i-=2) {
            ind++;
            if(p >= (i - 1)) {
                System.out.println("Backward Index : " + ind);
                return ind;
            }
        }
        System.out.println("Backward Index : " + ind);
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        int p = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = 6;
        System.out.println("Total Pages : " + n);
        int p = 2;
        System.out.println("Page to find : " + p);

        printBook(n);
        int result = pageCount(n, p);

        System.out.println("Result : " + result);

        scanner.close();
    }

    private static void printBook(int pages) {
        StringBuffer sb = new StringBuffer();
        int count = 1;
        sb.append("| " + 1 + " |").append(" --> ");
        count++;
        while(count <= pages) {
            if(pages - count >= 2) {
                sb.append("| " + count + " | ");
                sb.append((count + 1) + " |").append(" --> ");
            } else {
                sb.append("| " + count + " |").append(" --> ");
            }
            count +=2;
        }
        sb.delete((sb.length() - 5), (sb.length() - 1));
        System.out.println(sb.toString());
    }






    static int pageCount_v1(int n, int p) {
        /*
         * Write your code here.
         */
        if(p == 1 || p == n) {
            return 0;
        }
        int pageIndFwd = 1;
        int flipCountFwd = 0;
        while(pageIndFwd <= n) {
            if(pageIndFwd == p || pageIndFwd + 1 == p) {
                break;
            }
            flipCountFwd++;
            pageIndFwd +=2;
        }
        System.out.println("flipCountFwd" + flipCountFwd);
        int pageIndBck = n;
        int flipCountBck = 0;
        while(pageIndBck > 0) {
            if(pageIndBck == p || pageIndBck - 1 == p) {
                break;
            }
            flipCountBck++;
            pageIndBck -=2;
        }
        System.out.println("flipCountBck" + flipCountBck);

        return flipCountFwd < flipCountBck ? flipCountFwd : flipCountBck;
    }
}
