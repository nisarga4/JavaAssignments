package com.xworkz.intenal;

import com.xworkz.interfacee.Microwave;

public class LGSmartMicrowave implements Microwave {
    public void powerOn() {
        System.out.println("Microwave powered on.");
    }

    public void heat() {
        System.out.println("Heating food...");
    }

    public void powerOff() {
        System.out.println("Microwave powered off.");
    }
}
