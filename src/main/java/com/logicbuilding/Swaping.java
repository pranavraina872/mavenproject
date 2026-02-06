package com.logicbuilding;

public class Swaping {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        {
            int c;
            c = b;
            b = a+c;
            a = a+b;
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
