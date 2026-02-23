package com.phone;

public class Redmi implements Phone{
    @Override
    public void camera() {
        Phone.super.camera();
        System.out.println("redmi camera");
    }

    @Override
    public void touch() {
        Phone.super.touch();
        System.out.println("redmi touch");
    }

    @Override
    public void volumeup() {
        System.out.println("redmi volume up");

    }

    @Override
    public void volumedown() {
        System.out.println("redmi volume down");

    }

    @Override
    public void on() {
        System.out.println("redmi on");

    }

    @Override
    public void off() {
        System.out.println("redmi off");

    }

    @Override
    public void fifthgeneration() {
        System.out.println("redmi fifthgeneration");
    }
}
