package com.xworkz.isRelation;

import com.xworkz.inheritance.Alarm;
import com.xworkz.inheritance.Clock;

    public class ClockRunner {
        public static void main(String[] args) {
            Alarm alarm = new Alarm();
            alarm.showTime();
            alarm.tick();
            alarm.adjustTime();
            alarm.stop();
            alarm.start();

            System.out.println("--------------------------------------");

            Clock clock = new Alarm(); // Polymorphic reference
            clock.showTime();
            clock.tick();
            clock.adjustTime();
            clock.stop();
            clock.start();
        }
    }
