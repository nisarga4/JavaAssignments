package com.xworkz.runner;

import com.xworkz.interfacee.OfficeElevator;
import com.xworkz.internal.Elevator;

public class ElevatorRunner {
    public static void main(String[] args) {
        Elevator elevator = new OfficeElevator();
        elevator.goUp();
        elevator.goDown();
        elevator.stopAtFloor();
    }
}
