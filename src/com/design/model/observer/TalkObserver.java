package com.design.model.observer;

public class TalkObserver implements Observer {
    private String name;

    public TalkObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+"->收到了:"+msg);
    }
}
