package com.logicbuilding;

import java.util.Scanner;

public class Swapextra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        {
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(a);

        }

    }
}
