package com.design.model.chain;

public class CaseTwo extends AbstractCase {
    public CaseTwo(int flag) {
        super(flag);
    }

    @Override
    public void handle() {
        System.out.println("this is two");
    }
}
