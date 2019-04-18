package com.design.model.chain.second;

public class CaseOne extends BaseCase {
    public CaseOne(int condition) {
        super(condition);
    }

    @Override
    public void doRequest() {
        System.out.println("this one");
    }
}
