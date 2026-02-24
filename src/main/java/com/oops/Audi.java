package com.oops;

public class Audi implements Car {


    @Override
    public void start() {
        System.out.println("starting car");
        Car.super.start();
    }

    @Override
    public void stop() {
        System.out.println("stopping car");
        Car.super.stop();
    }

    @Override
    public void radio() {
        System.out.println("radio car");

    }

    @Override
    public void sound() {
        System.out.println("sound car");

    }
}
