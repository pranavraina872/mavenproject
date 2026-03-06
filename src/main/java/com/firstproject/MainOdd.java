package com.firstproject;

import com.logicbuilding.OddEven;

import java.util.Scanner;

public class MainOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        OddEven o=new OddEven();
        o.setNumber(number);
        o.oddEven();
    }
}
