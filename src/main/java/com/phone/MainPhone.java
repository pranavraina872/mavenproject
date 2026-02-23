package com.phone;

public class MainPhone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();
        Redmi redmi = new Redmi();
        iphone.camera();
        samsung.camera();
        redmi.camera();
        iphone.off();
        samsung.off();
        redmi.off();
        iphone.on();
        samsung.on();
        redmi.on();
        iphone.touch();
        samsung.touch();
        redmi.touch();
        iphone.fifthgeneration();
        samsung.fifthgeneration();
        redmi.fifthgeneration();
        iphone.volumedown();
        samsung.volumedown();
        redmi.volumedown();
        iphone.volumeup();
        samsung.volumeup();
        redmi.volumeup();

    }
}
