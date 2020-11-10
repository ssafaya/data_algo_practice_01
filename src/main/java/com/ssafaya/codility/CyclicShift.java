package com.ssafaya.codility;

public class CyclicShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(solution(arr, 2));
    }

    public static int[] solution(int[] A, int K) {
        // Validation
        if(A.length > 100 || K < 0 || K > 100) {
            throw new IllegalArgumentException("Invalid inputs. Expect range between 0 to 100.");
        }
        int size = A.length;

        if(size == 0 || K == 0) {
            return A;
        }

        int shift = K % size;
        System.out.println("shift : " + shift);
        int[] res = new int[size];
        int count = 0;
        for(int i = size - shift, j = 0; i < size; i++,j++) {
            res[j] = A[i];
            count++;
        }
        for(int i = 0, j = count; i < size - shift; i++,j++) {
            res[j] = A[i];
        }

        display(res);
        return res;
    }

    private static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }
}
