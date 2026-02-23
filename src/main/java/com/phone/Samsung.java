package com.phone;

public class Samsung implements Phone {
    @Override
    public void camera() {
        Phone.super.camera();
        System.out.println("samsung camera");
    }

    @Override
    public void touch() {
        Phone.super.touch();
        System.out.println("samsung touch");
    }

    @Override
    public void volumeup() {
        System.out.println("Samsung volume up");

    }

    @Override
    public void volumedown() {
        System.out.println("Samsung volume down");

    }

    @Override
    public void on() {
        System.out.println("samsung phone on");

    }

    @Override
    public void off() {
        System.out.println("samsung phone off");

    }

    @Override
    public void fifthgeneration() {
        System.out.println("samsung fifth generation" );

    }
}
