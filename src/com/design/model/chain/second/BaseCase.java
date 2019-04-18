package com.design.model.chain.second;

public abstract class BaseCase implements Case{
    private int condition;
    private String name;
    public BaseCase(int condition){
        this.condition = condition;
        this.name = ""+condition;
    }
    @Override
    public void handle(int flag,Case baseCase){
        if(condition == flag){
            doRequest();
        }
        else{
            baseCase.handle(flag,baseCase);
        }
    };
    abstract void doRequest();
    public String getName(){
        return  this.name;
    }
}
