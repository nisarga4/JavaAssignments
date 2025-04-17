package com.xworkz.intenal;

import com.xworkz.interfacee.Elevator;

public class OfficeElevator implements Elevator {
    public void goUp() {
        System.out.println("Elevator going up.");
    }

    public void goDown() {
        System.out.println("Elevator going down.");
    }

    public void stopAtFloor() {
        System.out.println("Elevator stopped at floor.");
    }
}
