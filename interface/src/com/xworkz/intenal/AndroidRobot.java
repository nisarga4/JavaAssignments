package com.xworkz.intenal;

import com.xworkz.internal.Robot;

public class AndroidRobot implements Robot {
    public void activate() {
        System.out.println("Android robot activated.");
    }

    public void performTask() {
        System.out.println("Performing task...");
    }

    public void shutdown() {
        System.out.println("Shutting down robot.");
    }
}
