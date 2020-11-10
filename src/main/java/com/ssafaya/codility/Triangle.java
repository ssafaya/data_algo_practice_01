package com.ssafaya.codility;

public class Triangle {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        // Basic
        int N = A.length;
        for(int P = 0; P < N - 2; P++) {
            int pVal = A[P];
            for(int Q = P + 1; Q < N - 1; Q++) {
                int qVal = A[Q];

                for(int R = Q + 1; R < N; R++) {
                    int rVal = A[R];

                    // Checks
                    if(pVal + qVal > rVal
                            && qVal + rVal > pVal
                            && rVal + pVal > qVal) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
