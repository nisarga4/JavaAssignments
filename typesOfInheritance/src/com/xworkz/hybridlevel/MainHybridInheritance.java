package com.xworkz.hybridlevel;

public class MainHybridInheritance {
    public static void main(String[] args) {

        // Example 1
        SmartPhone phone = new SmartPhone();
        phone.powerOn();
        phone.boot();
        phone.connectToNetwork();
        System.out.println("--------");

        // Example 2
        Dog dog = new Dog();
        dog.breathe();
        dog.feedMilk();
        dog.play();
        System.out.println("--------");

        // Example 3
        ElectricCar car = new ElectricCar();
        car.start();
        car.drive();
        car.charge();
        System.out.println("--------");

        // Example 4
        SmartWasher washer = new SmartWasher();
        washer.turnOn();
        washer.washClothes();
        washer.schedule();
        System.out.println("--------");

        // Example 5
        FullStackDev dev = new FullStackDev();
        dev.work();
        dev.code();
        dev.collaborate();
        System.out.println("--------");

        // Example 6
        SmartPrinter printer = new SmartPrinter();
        printer.operate();
        printer.print();
        printer.connectWifi();
        System.out.println("--------");

        // Example 7
        VirtualTeacher teacher = new VirtualTeacher();
        teacher.speak();
        teacher.teach();
        teacher.hostWebinar();
        System.out.println("--------");

        // Example 8
        DrawingTablet tablet = new DrawingTablet();
        tablet.showInfo();
        tablet.touchScreen();
        tablet.draw();
        System.out.println("--------");

        // Example 9
        SuperAdmin admin = new SuperAdmin();
        admin.login();
        admin.accessPanel();
        admin.grantAccess();
        System.out.println("--------");

        // Example 10
        LuxuryApartment apartment = new LuxuryApartment();
        apartment.foundation();
        apartment.numberOfFloors();
        apartment.controlLights();
        System.out.println("--------");

        // Example 11
        SmartPlayer player = new SmartPlayer();
        player.playMedia();
        player.adjustQuality();
        player.loadSubtitles();
        System.out.println("--------");
    }
}
