package com.design.model.callback;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public void callback(String param){
        System.out.println("callback:"+param);
    }
    public void work(){
//        b.dosomething(this);
        new Thread(new Runnable(){
            @Override
            public void run() {
                b.dosomething(A.this,"xiao ming");
            }
        }).start();
    }

}
