package com.ssafaya.progs.sort;

public class BubbleSort {
    private static int[] arr = {5,4,3,2,1};

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        System.out.println("Unsorted array : " + bs.toStr(arr));

        int[] sorted = bs.sort(arr);
        System.out.println("Sorted array : " + bs.toStr(sorted));

    }

    private int[] sort(int[] inArr) {
        System.out.println("Sorting started ...");
        // Iterate through array.
        boolean isSorted;
        for(int i = 0; i < inArr.length; i++) {
            isSorted = true;
            for(int j = 1; j < inArr.length - i; j++) {
                if(inArr[j] < inArr[j-1]) {
                    int tmp = inArr[j];
                    inArr[j] = inArr[j-1];
                    inArr[j-1] = tmp;
                    isSorted = false;
                }
                if(isSorted) {
                    break;
                }
            }
            System.out.println("Iteration-" + (i + 1) + " : " + this.toStr(inArr));
        }
        System.out.println("Sorting completed ...");

        return inArr;
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
