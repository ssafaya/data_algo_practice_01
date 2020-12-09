package com.ssafaya.progs.dp.chainofresponsibility;

public class Div implements Chain<Numbers> {

    private Chain next;

    @Override
    public void setNext(Chain chain) {
        this.next = chain;
    }

    @Override
    public void execute(Numbers req) {
        if(req.getCalcType().equals("div")) {
            //calculate
            System.out.println(
                    String.format("%s result : %d & %d = %d",
                            "Div", req.getNum1(), req.getNum2(), (req.getNum1() / req.getNum2())));
        } else {
            System.out.println("Supported types are Add, Sub, Mult & Div.");
        }
    }
}
