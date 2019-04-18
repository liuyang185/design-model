package com.design.model.chain.second;

public class CaseTwo extends BaseCase {
    public CaseTwo(int condition) {
        super(condition);
    }

    @Override
    public void doRequest() {
        System.out.println("this two");
    }
}
