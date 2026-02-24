package com.oops;

public interface Car {
    //implement
    default void start() {
        System.out.println("starting car");
    }
    default void stop() {
        System.out.println("stopping car");
    }
    //non implement
    public void radio();
    public void sound();
}
