package com.xworkz.intenal;

import com.xworkz.internal.Fan;

public class CeilingFan implements Fan {
    public void turnOn() {
        System.out.println("Ceiling fan turned on.");
    }

    public void rotate() {
        System.out.println("Ceiling fan is rotating.");
    }

    public void turnOff() {
        System.out.println("Ceiling fan turned off.");
    }
}
