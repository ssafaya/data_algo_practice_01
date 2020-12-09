package com.ssafaya.progs.sort;

import java.util.Random;

public class QuickSort {
    private static QuickSort q = new QuickSort();

    public static void main(String[] args) {

        int[] arr = {9, 9, 8, 7, 6, 6, 5, 7, 8, 6, 4, 3, 2, 1, 1, 0};
        print(arr);

        q.quickSort(arr);
        print(arr);
    }

    public void quickSort(int[] A) {
        quicksort(A, 0, A.length - 1);
    }

    private void quicksort(int[] A, int low, int high) {
        if(low < high + 1) {
            int p = partition(A, low, high);
            quicksort(A, low, p - 1);
            quicksort(A, p + 1, high);
        }
    }

    private int partition(int[] A, int low, int high) {
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for(int i = border; i <= high; i++) {
            if(A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border - 1);
        return border - 1;
    }

    private void swap(int[] A, int first, int second) {
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    private int getPivot(int low, int high) {
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }

    private static void print(int[] A) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i : A) {
            sb.append(i).append(",");
        }
        if(sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");

        System.out.println(sb.toString());
    }
}
