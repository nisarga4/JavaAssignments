package com.xworkz.intenal;

import com.xworkz.interfacee.*;

public class SmartDevice implements Printer, Camera, Speaker, CoffeeMachine, Light {

    // Printer methods
    public void print() { System.out.println("SmartDevice printing..."); }
    public void scan() { System.out.println("SmartDevice scanning..."); }
    public void copy() { System.out.println("SmartDevice copying..."); }

    // Camera methods
    public void capture() { System.out.println("SmartDevice capturing photo..."); }
    public void record() { System.out.println("SmartDevice recording video..."); }
    public void zoom() { System.out.println("SmartDevice zooming..."); }

    // Speaker methods
    public void increaseVolume() { System.out.println("SmartDevice volume up..."); }
    public void decreaseVolume() { System.out.println("SmartDevice volume down..."); }
    public void mute() { System.out.println("SmartDevice muted..."); }

    // CoffeeMachine methods
    public void makeEspresso() { System.out.println("SmartDevice making espresso..."); }
    public void makeCappuccino() { System.out.println("SmartDevice making cappuccino..."); }
    public void cleanMachine() { System.out.println("SmartDevice self-cleaning..."); }

    // Light methods
    public void turnOn() { System.out.println("SmartDevice lights on..."); }
    public void turnOff() { System.out.println("SmartDevice lights off..."); }
    public void dim() { System.out.println("SmartDevice dimming lights..."); }
}
