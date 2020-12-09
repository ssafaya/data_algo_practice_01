package com.ssafaya.progs.dp.chainofresponsibility;

public class Add implements Chain<Numbers> {

    private Chain next;

    @Override
    public void setNext(Chain chain) {
        this.next = chain;
    }

    @Override
    public void execute(Numbers req) {
        if(req.getCalcType().equals("add")) {
            //calculate
            System.out.println(
                    String.format("%s result : %d & %d = %d",
                            "Add", req.getNum1(), req.getNum2(), (req.getNum1() + req.getNum2())));
        } else {
            next.execute(req);
        }
    }
}
