package com.phone;

public class Iphone implements Phone{
    @Override
    public void camera() {
        Phone.super.camera();
        System.out.println("iphone camera");
    }

    @Override
    public void touch() {
        Phone.super.touch();
        System.out.println("iphone touch");
    }

    @Override
    public void volumeup() {
        System.out.println("iphone volumeup");

    }

    @Override
    public void volumedown() {
        System.out.println("iphone volumedown");

    }

    @Override
    public void on() {
        System.out.println("iphone on");

    }

    @Override
    public void off() {
        System.out.println("iphone off");

    }

    @Override
    public void fifthgeneration() {
        System.out.println("iphone fifthgeneration");
    }
}
