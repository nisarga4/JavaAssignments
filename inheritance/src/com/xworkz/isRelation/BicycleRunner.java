package com.xworkz.isRelation;


import com.xworkz.inheritance.Helmet;
import com.xworkz.inheritance.Bicycle;

    public class BicycleRunner {
        public static void main(String[] args) {
            Helmet helmet = new Helmet();
            helmet.ride();
            helmet.brake();
            helmet.pedal();
            helmet.adjustSeat();
            helmet.park();

            System.out.println("--------------------------------------");

            Bicycle bicycle = new Helmet();
            bicycle.ride();
            bicycle.brake();
            bicycle.pedal();
            bicycle.adjustSeat();
            bicycle.park();
        }
    }
