package com.design.model.chain;

public class ChainTest {
    public static void main(String[] args) {
        CaseOne caseOne = new CaseOne(1);
        CaseTwo caseTwo = new CaseTwo(2);
        DefaultCase defaultCase = new DefaultCase(3);
        caseOne.setNextcase(caseTwo);
        caseTwo.setNextcase(defaultCase);
        caseOne.doResquest(2);

    }
}
