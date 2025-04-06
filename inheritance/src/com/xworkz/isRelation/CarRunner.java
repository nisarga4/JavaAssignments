package com.xworkz.isRelation;

import com.xworkz.inheritance.Tire;
import com.xworkz.inheritance.Car;

    public class CarRunner {
        public static void main(String[] args) {
            Tire tire = new Tire();
            tire.start();
            tire.stop();
            tire.refuel();
            tire.service();
            tire.park();

            System.out.println("--------------------------------------");

            Car car = new Tire(); // Polymorphic reference
            car.start();
            car.stop();
            car.refuel();
            car.service();
            car.park();
        }
    }
