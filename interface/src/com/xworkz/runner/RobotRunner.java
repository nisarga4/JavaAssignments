package com.xworkz.runner;

import com.xworkz.intenal.CleaningRobot;
import com.xworkz.interfacee.Robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new CleaningRobot();
        robot.start();
        robot.performTask();
        robot.shutdown();
    }
}
