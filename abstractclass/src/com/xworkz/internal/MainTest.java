package com.xworkz.internal;
public class MainTest {

    public static void main(String[] args) {

        // 1. Abstract class with no abstract method
        Device device = new SmartDevice();
        device.display();

        System.out.println("----------");

        // 2. Abstract class with one abstract method
        Transport scooter = new ElectricScooter();
        scooter.move();

        System.out.println("----------");

        // 3. Abstract class with one abstract + one non-abstract method
        Gadget watch = new SmartWatch();
        watch.operate();
        watch.charge();

        System.out.println("----------");

        // 4. Abstract class with 3 variables and constructor
        Library library = new Library("Public", "Mysuru", 5);
        library.displayLibrary();
        library.open();

        System.out.println("----------");

        // 5. Abstract class with 4 variables and 3 constructors
        Robot robot1 = new Robot("RX100", "TechBot", 2024, 45.0, "Surveillance");
        robot1.specs();

        System.out.println("----------");

        Robot robot2 = new Robot("RZ200", "NeoTech", 2023, "Cleaning");
        robot2.specs();

        System.out.println("----------");

        Robot robot3 = new Robot("TX300", "CyberCorp", "Welding");
        robot3.specs();
    }
}

