package com.encapsulation;

public class Multiplication {
    private int num1;
    private int num2;
    private int multiply;

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

    public int getMultiply() {
        return multiply;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }
    public void multiply(int a,int b){
        this.num1=a;
                this.num2=b;
                this.multiply=a*b;
        System.out.println(multiply);
    }
}


