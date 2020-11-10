package com.ssafaya.codility;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        if(X == Y) {
            return 0;
        }
        int pos = X;
        int jump = 0;
        while(pos < Y) {
            pos+=D;
            jump++;
        }
        return jump;
    }

    public int solution2(int X, int Y, int D) {
        if(X == Y) {
            return 0;
        }
        // int pos = X;
        // int jump = 0;
        // while(pos < Y) {
        //     pos+=D;
        //     jump++;
        // }
        int diffXY = Y - X;
        int div = diffXY / D;
        int mod = diffXY % D == 0 ? 0 : 1;

        int jump = div + mod;

        return jump;
    }
}
