package com.test;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        Sum sum = new Sum();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum.add(num1,num2);
    }
}
