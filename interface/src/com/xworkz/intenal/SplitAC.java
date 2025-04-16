package com.xworkz.intenal;


public class SplitAC implements AirConditioner {
    public void turnOn() {
        System.out.println("AC turned on.");
    }

    public void setMode() {
        System.out.println("Mode set to 'Cool'.");
    }

    public void turnOff() {
        System.out.println("AC turned off.");
    }
}
