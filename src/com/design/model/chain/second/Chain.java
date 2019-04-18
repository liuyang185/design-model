package com.design.model.chain.second;

import java.util.ArrayList;
import java.util.List;

public class Chain implements Case {
    private  int index =0;
    private List<BaseCase> list = new ArrayList<>();

    @Override
    public void handle(int flag, Case c) {
        if(index == list.size()) return;
        BaseCase baseCase = list.get(index);
        System.out.println(baseCase.getName()+"开始");
        index ++;
        baseCase.handle(flag,this);
        System.out.println(baseCase.getName()+"结束");
    }

    public Chain addCase(BaseCase usercase){
        list.add(usercase);
        return this;
    }

}
