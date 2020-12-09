package com.ssafaya.progs.dp.chainofresponsibility;

public interface Chain<T> {
    void setNext(Chain chain);

    void execute(T t);
}
