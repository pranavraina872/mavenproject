package com.test;

import java.util.Scanner;

public class Scity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        String name = sc.nextLine();
        City city = new City();
        city.setName(name);
        city.city();
    }
}
