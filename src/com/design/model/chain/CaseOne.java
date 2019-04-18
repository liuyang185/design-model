package com.design.model.chain;

public class CaseOne extends AbstractCase {
    public int b;
    public CaseOne(int flag) {
        super(flag);
    }

    @Override
    public void handle() {
        System.out.println("this is one");
    }
}
