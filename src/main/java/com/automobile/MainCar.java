package com.automobile;

public class MainCar {
    public static void main(String[] args) {
        Alto alto = new Alto();
        I20 i20 = new I20();
        GrandVitara grandVitara = new GrandVitara();
        Fortuner fortuner = new Fortuner();
        alto.accelerate();
        grandVitara.accelerate();
        fortuner.accelerate();
        i20.accelerate();
        alto.brake();
        grandVitara.brake();
        fortuner.brake();
        i20.brake();
        alto.handbrake();
        grandVitara.handbrake();
        fortuner.handbrake();
        i20.handbrake();
        alto.reversegear();
        grandVitara.reversegear();
        fortuner.reversegear();
        i20.reversegear();
        alto.radio();
        grandVitara.radio();
        fortuner.radio();
        i20.radio();
        alto.isbackCamera();
        grandVitara.isbackCamera();
        fortuner.isbackCamera();
        i20.isbackCamera();

    }
}
