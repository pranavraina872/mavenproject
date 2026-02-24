package com.oops;

public class MainCar {
    public static void main(String[] args) {
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        audi.start();
        bmw.start();
        audi.stop();
        bmw.stop();
        audi.radio();
        bmw.radio();
        audi.sound();
        bmw.sound();
    }
}
