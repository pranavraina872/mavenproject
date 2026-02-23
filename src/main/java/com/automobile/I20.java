package com.automobile;

public class I20 implements Car{
    @Override
    public void accelerate() {
        System.out.println("I20 accelerate");

    }

    @Override
    public void brake() {
        System.out.println("I20 brake");

    }

    @Override
    public Boolean isbackCamera() {
        System.out.println("I20 isbackCamera" +false);

        return false;
    }

    @Override
    public void radio() {
        System.out.println("I20 radio");

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
