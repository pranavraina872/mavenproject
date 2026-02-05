package com.logicbuilding;

import java.util.Scanner;

public class MainDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Divide divide = new Divide();
        divide.divide(num1, num2);

    }
}
