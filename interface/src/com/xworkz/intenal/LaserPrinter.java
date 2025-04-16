package com.xworkz.intenal;

import com.xworkz.internal.Printer;

public class LaserPrinter implements Printer {
    public void turnOn() {
        System.out.println("Laser printer is on.");
    }

    public void printDocument() {
        System.out.println("Printing document...");
    }

    public void turnOff() {
        System.out.println("Laser printer is off.");
    }
}
