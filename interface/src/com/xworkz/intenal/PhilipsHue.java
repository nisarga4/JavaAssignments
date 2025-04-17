package com.xworkz.intenal;


import com.xworkz.interfacee.SmartLight;

public class PhilipsHue implements SmartLight {
    public void connect() {
        System.out.println("Connecting to Philips Hue...");
    }

    public void changeColor() {
        System.out.println("Changing light color...");
    }

    public void disconnect() {
        System.out.println("Disconnecting Philips Hue...");
    }
}
