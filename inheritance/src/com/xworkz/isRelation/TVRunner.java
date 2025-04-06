package com.xworkz.isRelation;


import com.xworkz.inheritance.Remote;
import com.xworkz.inheritance.TV;

    public class TVRunner {
        public static void main(String[] args) {
            Remote remote = new Remote();
            remote.turnOn();
            remote.turnOff();
            remote.changeChannel();
            remote.increaseVolume();
            remote.decreaseVolume();

            System.out.println("--------------------------------------");

            TV tv = new Remote(); // Polymorphic reference
            tv.turnOn();
            tv.turnOff();
            tv.changeChannel();
            tv.increaseVolume();
            tv.decreaseVolume();
        }
    }

