package com.mianshi;

public class SwapObjectTest {
    public static void main(String[] args) {
        People a= new People("jack",12);
        People b= new People("tom",10);
//        swap(a,b);
        People p =a;
        a= b;
        b =p;
        System.out.println("jack:"+a);
        System.out.println("tom:"+b);
    }
    public static void swap(People a,People b){
        People p =a;
        a= b;
        b =p;
    }
}
