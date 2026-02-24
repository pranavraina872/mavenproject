package com.oops;

public class Bmw implements Car{
    @Override
    public void start() {
        System.out.println("bmw starting car");
        Car.super.start();
    }

    @Override
    public void stop() {
        System.out.println("bmw stoping car");
        Car.super.stop();
    }

    @Override
    public void radio() {
        System.out.println("bmw radio car");

    }

    @Override
    public void sound() {
        System.out.println("bmw sound car");

    }
}
