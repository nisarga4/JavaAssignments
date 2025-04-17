package com.xworkz.runner;

import com.xworkz.intenal.DigitalAlarm;
import com.xworkz.interfacee.Alarm;

public class AlarmRunner {
    public static void main(String[] args) {
        Alarm alarm = new DigitalAlarm();
        alarm.setTime();
        alarm.ring();
        alarm.snooze();
    }
}
