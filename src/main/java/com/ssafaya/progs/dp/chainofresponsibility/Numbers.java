package com.ssafaya.progs.dp.chainofresponsibility;

public class Numbers {
    private int num1;
    private int num2;
    private String calcType;

    public Numbers(int num1, int num2, String calcType) {
        this.num1 = num1;
        this.num2 = num2;
        this.calcType = calcType;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }
}
