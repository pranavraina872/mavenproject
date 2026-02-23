package com.phone;

public interface Phone {
   // implement method
    default void camera() {
        System.out.println("phone camera");
    }
    default void touch() {
        System.out.println("phone touch");
    }
    // non implement method
    public void volumeup();
    public void volumedown();
    public void on();
    public void off();
    public void fifthgeneration();


}
