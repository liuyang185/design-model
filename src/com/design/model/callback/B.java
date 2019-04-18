package com.design.model.callback;

import java.util.concurrent.TimeUnit;

public class B {
    public void dosomething(A a,String param){
        System.out.println("step into b dosomethind");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.callback(param);
    };
}
