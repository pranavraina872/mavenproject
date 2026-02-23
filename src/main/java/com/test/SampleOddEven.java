package com.test;

import java.util.Scanner;

public class SampleOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        OddEven oddEven = new OddEven();
        oddEven.setNumber(number);
        oddEven.oddEven();
    }
}
