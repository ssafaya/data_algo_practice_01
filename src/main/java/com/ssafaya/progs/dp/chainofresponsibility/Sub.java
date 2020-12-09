package com.ssafaya.progs.dp.chainofresponsibility;

public class Sub implements Chain<Numbers> {

    private Chain next;

    @Override
    public void setNext(Chain chain) {
        this.next = chain;
    }

    @Override
    public void execute(Numbers req) {
        if(req.getCalcType().equals("sub")) {
            //calculate
            System.out.println(
                    String.format("%s result : %d & %d = %d",
                            "Sub", req.getNum1(), req.getNum2(), (req.getNum1() - req.getNum2())));
        } else {
            next.execute(req);
        }
    }
}
