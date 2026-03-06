package com.firstproject;

import java.util.Scanner;

public class Mainmale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        MaleFemale m =new MaleFemale();
        m.setName(name);
        m.MaleFemale();
    }
}
