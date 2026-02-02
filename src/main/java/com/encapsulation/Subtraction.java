package com.encapsulation;

public class Subtraction {
    private int num1;
    private int num2;
    private int subtraction;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(int subtraction) {
        this.subtraction = subtraction;
    }
    public void subtraction(int a,int b){
        this.num1=a;
        this.num2=b;
        this.subtraction=a-b;
        System.out.println(subtraction);
    }
}
