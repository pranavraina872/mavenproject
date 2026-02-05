package com.logicbuilding;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Addition addition = new Addition();
        addition.addition(num1,num2);
    }
}
