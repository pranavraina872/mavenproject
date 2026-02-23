package com.automobile;

public class GrandVitara implements Car {

    @Override
    public void accelerate() {
        System.out.println("GrandVitara accelerate");

    }

    @Override
    public void brake() {
        System.out.println("GrandVitara brake");

    }

    @Override
    public Boolean isbackCamera() {
        System.out.println("GrandVitara isbackCamera");
        return true;
    }

    @Override
    public void radio() {
        System.out.println("GrandVitara radio");

    }

    @Override
    public void reversegear() {
        Car.super.reversegear();
    }

    @Override
    public void handbrake() {
        Car.super.handbrake();
    }
}
