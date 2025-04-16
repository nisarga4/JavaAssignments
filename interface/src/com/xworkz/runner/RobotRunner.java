package com.xworkz.runner;

import com.xworkz.interfacee.AndroidRobot;
import com.xworkz.internal.Robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new AndroidRobot();
        robot.activate();
        robot.performTask();
        robot.shutdown();
    }
}
