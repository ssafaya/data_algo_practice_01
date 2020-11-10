package com.ssafaya.progs.sort;

public class InsertionSort {

    private static int[] arr = {5,4,3,2,1};

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        System.out.println("Unsorted array : " + is.toStr(arr));

        int[] sorted = is.sort(arr);
        System.out.println("Sorted array : " + is.toStr(sorted));
    }

    private int[] sort(int[] inArr) {
        System.out.println("Sorting started ...");
        // Iterate through array.
        for(int i = 0; i < inArr.length; i++) {
            // Compare arr[i] with earlier sorted elements
            // Shift bigger elements to right
            for(int j = i; j > 0; j--) {
                if(inArr[j-1] > inArr[j]) {
                    int tmp = inArr[j];
                    inArr[j] = inArr[j-1];
                    inArr[j-1] = tmp;
                } else {
                    break;
                }
            }
            System.out.println("Iteration-" + (i + 1) + " : " + this.toStr(inArr));
        }
        System.out.println("Sorting completed ...");

        return inArr;
    }

    private void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private String toStr(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(",");
        }
        if(sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");

        return sb.toString();
    }
}
