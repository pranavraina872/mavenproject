package com.automobile;

public interface Car {
//   non-implementedmethod/abstract method
    public void accelerate();
    public void brake();
    public Boolean isbackCamera();
    public void radio();

//    implemented method
    default void reversegear(){
        System.out.println("Reverse gear");
    }
    default void handbrake(){
        System.out.println("Handbrake");
    }
}
