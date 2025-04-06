package com.xworkz.isRelation;

import com.xworkz.inheritance.Speaker;
import com.xworkz.inheritance.Microphone;

    public class MicRunner {
        public static void main(String[] args) {
            Speaker speaker = new Speaker();
            speaker.powerOn();
            speaker.powerOff();
            speaker.record();
            speaker.mute();
            speaker.unmute();

            System.out.println("--------------------------------------");

            Microphone mic = new Speaker(); // Polymorphic reference
            mic.powerOn();
            mic.powerOff();
            mic.record();
            mic.mute();
            mic.unmute();
        }
    }

