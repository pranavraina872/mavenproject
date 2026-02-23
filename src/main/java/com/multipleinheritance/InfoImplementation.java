package com.multipleinheritance;

public class InfoImplementation implements Info,College {
    public static void main(String[] args) {

    }

    @Override
    public void test() {
        System.out.println("btech");

    }
    @Override
    public void exam() {
        System.out.println("cse");
    }
}
