package com.xworkz.intenal;
import java.util.interfacee.Alarm;
public class DigitalAlarm implements Alarm {
    public void setTime() {
        System.out.println("Alarm set for 6:30 AM.");
    }

    public void ring() {
        System.out.println("Alarm ringing...");
    }

    public void snooze() {
        System.out.println("Snoozed for 5 minutes.");
    }
}
