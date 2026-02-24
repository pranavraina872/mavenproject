package com.oops;

public abstract class  MainAbs{
    public static void main(String[] args) {
        Abs abs= new Abs() {
            @Override
            public void test() {
                System.out.println("test");

            }
        };
        abs.test2();
        abs.test();

    }
    }

