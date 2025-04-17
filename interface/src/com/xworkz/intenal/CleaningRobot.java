package com.xworkz.intenal;
import com.xworkz.interfacee.Robot;

public class CleaningRobot implements Robot {
    public void start() {
        System.out.println("Robot started.");
    }

    public void performTask() {
        System.out.println("Cleaning the room...");
    }

    public void shutdown() {
        System.out.println("Robot shutting down.");
    }
}
