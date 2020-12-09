package com.ssafaya.progs.dp.chainofresponsibility;

public class TestPattern {

    public static void main(String[] args) {
        //init
        Add add = new Add();
        Sub sub = new Sub();
        Mult mult = new Mult();
        Div div = new Div();

        //create chain
        add.setNext(sub);
        sub.setNext(mult);
        mult.setNext(div);

        //test
        add.execute(new Numbers(10,20, "add"));
        add.execute(new Numbers(10,20, "sub"));
        add.execute(new Numbers(10,20, "mult"));
        add.execute(new Numbers(10,20, "div"));
        add.execute(new Numbers(10,20, "pow"));
    }
}
