package com.xworkz.isRelation;

import com.xworkz.inheritance.Mouse;
import com.xworkz.inheritance.Laptop;

    public class LaptopRunner {
        public static void main(String[] args) {
            Mouse mouse = new Mouse();
            mouse.powerOn();
            mouse.powerOff();
            mouse.runProgram();
            mouse.charge();
            mouse.shutdown();

            System.out.println("--------------------------------------");

            Laptop laptop = new Mouse(); // Polymorphic reference
            laptop.powerOn();
            laptop.powerOff();
            laptop.runProgram();
            laptop.charge();
            laptop.shutdown();
        }
    }

