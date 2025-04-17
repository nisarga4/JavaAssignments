package com.xworkz.intenal;

import com.xworkz.interfacee.Projector;

public class EpsonProjector implements Projector {
    public void powerOn() {
        System.out.println("Projector powered on.");
    }

    public void display() {
        System.out.println("Displaying presentation...");
    }

    public void powerOff() {
        System.out.println("Projector powered off.");
    }
}
