package com.connections;

import java.util.Scanner;

public class MainCollege {
    public static void main(String[] args) {
        College college = new College();
        college.test();
        college.exam();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        college.setName(name);
        college.setAge(age);
    }

}
