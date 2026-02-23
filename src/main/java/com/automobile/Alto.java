package com.automobile;

public class Alto implements Car{

    @Override
    public void accelerate() {
        System.out.println("Alto accelerate");

    }

    @Override
    public void brake() {
        System.out.println("Alto brake");

    }

    @Override
    public Boolean isbackCamera() {
        System.out.println("Alto isbackCamera");
        return false;

    }

    @Override
    public void radio() {
        System.out.println("Alto radio");

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
