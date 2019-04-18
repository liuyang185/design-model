package com.design.model.chain.second;

public class ChainTest {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.addCase(new CaseOne(1))
                .addCase(new CaseTwo(2))
                .addCase(new CaseThree(3))
                .addCase(new CaseFour(4));
        chain.handle(4,chain);
    }
}
