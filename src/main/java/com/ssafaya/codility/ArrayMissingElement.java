package com.ssafaya.codility;


// Find the missing element in a given permutation.
public class ArrayMissingElement {

    public int solution(int[] A) {
        return find(A, 0, A.length - 1);
    }
    private int find(int[] arr, int s, int e) {
        int result = -1;
        if((e - s) > 2) {
            int mid = (e + 1)/2;
            result = find(arr, s, mid);
            if(result != -1) {
                return result;
            }
            result = find(arr, mid+1, e);
        } else {
            result = arr[s] == arr.length ? arr[s] : -1;
            result = arr[e] == arr.length ? arr[s] : -1;
        }
        return result;
    }


    //----- SOLUTION 2 using Merge Sort
    public int solution2(int[] A) {

        mergeSort(A, A.length);

        int val = -1;
        for(int i = 0; i < A.length; i++) {
            if(A[i]-1 != i) {
                val = i+1;
                break;
            }
        }

//        for(int i = 0; i < A.length; i++) {
//            if(A[i] != i+1) {
//                val = i+1;
//                break;
//            }
//        }

        return val;
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
