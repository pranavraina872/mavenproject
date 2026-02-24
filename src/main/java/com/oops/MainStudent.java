package com.oops;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname=sc.nextLine();
        student.getFirstname(firstname);
        System.out.println("enter your last name");
        String lastname=sc.nextLine();
        student.getLastname(lastname);
        System.out.println("enter your age");
        int age=sc.nextInt();
        student.getAge(age);

    }
    }

