package com.xworkz.intenal;
import com.xworkz.interfacee.AirConditioner;

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
