package com.mianshi;

import java.lang.reflect.Field;

public class Swap {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        int a =1,b=2;
//        swap(a,b);
//        System.out.println(a+"=="+b);
        Integer a =1,b=2;
//        swap(a,b);
        Integer temp = a.intValue();
        a = b;
        b =temp;
        System.out.println(a+"=="+b);
    }
    public static void swap(int a,int b){
        int temp = a;
        a= b;
        b= temp;
        System.out.println(a+"=="+b);

    }
    public static void swap(Integer a,Integer b) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        Integer temp = new Integer(a.intValue());
        field.set(a,b.intValue());
        field.set(b,temp);


    }
}
