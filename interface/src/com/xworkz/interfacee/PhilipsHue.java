package com.xworkz.interfacee;

import com.xworkz.internal.SmartLight;

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
