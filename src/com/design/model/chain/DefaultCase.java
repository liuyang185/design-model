package com.design.model.chain;

public class DefaultCase extends AbstractCase {
    public DefaultCase(int flag) {
        super(flag);
    }

    @Override
    public void handle() {
        System.out.println("this is default");
    }
}
