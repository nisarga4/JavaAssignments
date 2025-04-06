package com.xworkz.isRelation;
import com.xworkz.inheritance.Tubelight;
import com.xworkz.inheritance.Lamp;
public class LampRunner {

        public static void main(String[] args) {
            Tubelight tubelight = new Tubelight();
            tubelight.turnOff();
            tubelight.checkBulb();
            tubelight.clean();
            tubelight.moveToAnotherPlace();

            System.out.println("--------------------------------------");

            Lamp lamp = new Tubelight(); // Polymorphic reference
            lamp.turnOn();
            lamp.turnOff();
            lamp.checkBulb();
            lamp.clean();
            lamp.moveToAnotherPlace();
        }
    }


