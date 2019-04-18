package com.design.model.chain.second;

public class CaseFour extends BaseCase {
    public CaseFour(int condition) {
        super(condition);
    }

    @Override
    public void doRequest() {
        System.out.println("this four");
    }
}
