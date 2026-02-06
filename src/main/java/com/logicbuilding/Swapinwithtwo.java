package com.logicbuilding;

public class Swapinwithtwo {
    public static void main(String[] args) {
        int a=4;
        int b=2;
        {
            a=a+b;
            b=a-b;
            a=a-b;

            System.out.println(a);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
