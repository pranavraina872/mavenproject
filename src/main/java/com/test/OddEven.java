package com.test;

public class OddEven {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void oddEven(){
        if(number % 2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
