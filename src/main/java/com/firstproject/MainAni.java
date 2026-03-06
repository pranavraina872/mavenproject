package com.firstproject;

public class MainAni {
    public static void main(String[] args) {
        Ani a = new Ani();
        a.setAnimal("dog");
        a.setEat("bone");
        System.out.println(a.getAnimal());
        System.out.println(a.getEat());
    }
}
