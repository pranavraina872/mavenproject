package com.logicbuilding;

public class OddEven {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void oddEven() {
        if (number % 2 == 0) {
            System.out.println("even number");
        } else  {
            System.out.println("odd number");
        }
    }
}