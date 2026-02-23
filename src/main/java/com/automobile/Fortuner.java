package com.automobile;

public class Fortuner implements Car{
    @Override
    public void accelerate() {
        System.out.println("Fortuner accelerate");

    }

    @Override
    public void brake() {
        System.out.println("Fortuner brake");

    }

    @Override
    public Boolean isbackCamera() {
        System.out.println("Fortuner isbackCamera");
        return true;
    }

    @Override
    public void radio() {
        System.out.println("Fortuner radio");

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
