package com.ssafaya.codewars;

public class Diamond {

    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n) {
        if((n <=0) || (n % 2 == 0)) {
            return;
        }
        for(int i=0; i < n; i+=2) {
            for(int j=n/2; j>=i; j-=2) {
                System.out.print(" ");
            }
            for(int j=0; j<(i*2)+1; j+=2) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0; i < n-1; i+=2) {
            for(int j=0; j<=(i+1)/2; j++) {
                System.out.print(" ");
            }
            for(int j=(n+1)/2; j>i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
