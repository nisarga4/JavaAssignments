package com.xworkz.runner;

import com.xworkz.intenal.ApolloHospital;
import com.xworkz.interfacee.*;

public class Main {
    public static void main(String[] args) {
        // Creating interface references pointing to ApolloHospital
        AlarmClock alarm = new ApolloHospital();
        BatteryCharger charger = new ApolloHospital();
        FireAlarm fire = new ApolloHospital();
        Hospital hospital = new ApolloHospital();

        // Using AlarmClock methods
        alarm.setAlarm();
        alarm.ring();
        alarm.snooze();

        // Using BatteryCharger methods
        charger.startCharging();
        charger.stopCharging();
        charger.showBatteryLevel();

        // Using FireAlarm methods
        fire.detectSmoke();
        fire.triggerAlarm();
        fire.resetAlarm();

        // Using Hospital methods
        hospital.treatPatients();
        hospital.takeBlood();
        hospital.makeSurgery();

    }
}
