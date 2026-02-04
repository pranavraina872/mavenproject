package com.DataTypes;

public class MainBooleanexample {
    public static void main(String[] args) {
        Booleanexample booleanexample = new Booleanexample();
        booleanexample.setNumber(2);
        System.out.println("Number: " + booleanexample.getNumber());
//        if (booleanexample.isOdd()) {
//            booleanexample.setOdd(false);
//            System.out.println("Odd: " + booleanexample.isOdd());
//        }
//        else if (booleanexample.isEven())
//            booleanexample.setEven(true);
//         System.out.println("Even: " + booleanexample.isEven());
//        }
        if (booleanexample.getNumber() / 2 == 0) {
            System.out.println("True");

        }
        else {
            System.out.println("False");
        }
        }





    }



