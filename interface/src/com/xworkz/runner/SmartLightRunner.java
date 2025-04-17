package com.xworkz.runner;

import com.xworkz.intenal.PhilipsHue;
import com.xworkz.interfacee.SmartLight;

public class SmartLightRunner {
    public static void main(String[] args) {
        SmartLight light = new PhilipsHue();
        light.connect();
        light.changeColor();
        light.disconnect();
    }
}

