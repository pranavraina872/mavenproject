package com.logicbuilding;

import java.util.Scanner;

public class MainMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Multiply multiply = new Multiply();
        multiply.multiply(num1, num2);



    }
}