package com.firstproject;

public class Oddeven {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void number() {
        if (number % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

}