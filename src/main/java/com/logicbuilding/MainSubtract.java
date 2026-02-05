package com.logicbuilding;

import java.util.Scanner;

public class MainSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        Subtract subtract=new Subtract();
        subtract.subtract(num1,num2);

    }
}
