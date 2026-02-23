package com.test;

public class Swaping {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c;
        c=a ;
        a = c+b;
        b = a+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a);
    }
}
