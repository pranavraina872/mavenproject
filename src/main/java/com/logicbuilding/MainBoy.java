package com.logicbuilding;

import java.util.Scanner;

public class MainBoy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
      String name=  sc.nextLine();
        Boy boy = new Boy();
        boy.setName(name);
        boy.boy();

    }
}
