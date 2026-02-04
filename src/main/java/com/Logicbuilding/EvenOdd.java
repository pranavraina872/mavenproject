package com.Logicbuilding;

public class EvenOdd {
    public int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void evenodd() {
        System.out.println(number%2);
        if (number%2==0) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

    }

}