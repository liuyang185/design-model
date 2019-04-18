package com.design.model.chain.second;

public class CaseThree extends BaseCase {
    public CaseThree(int condition) {
        super(condition);
    }

    @Override
    public void doRequest() {
        System.out.println("this three");
    }
}
