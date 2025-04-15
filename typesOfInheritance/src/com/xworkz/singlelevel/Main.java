package com.xworkz.singlelevel;

public class Main {
        public static void main(String[] args) {

            //  Chef → ItalianChef
            ItalianChef italianChef = new ItalianChef();
            italianChef.cook();
            italianChef.makePasta();
            System.out.println("--------");

            //  Book → Novel
            Novel novel = new Novel();
            novel.open();
            novel.readStory();
            System.out.println("--------");

            //  Planet → Earth
            Earth earth = new Earth();
            earth.rotate();
            earth.supportLife();
            System.out.println("--------");

            //  Musician → Guitarist
            Guitarist guitarist = new Guitarist();
            guitarist.perform();
            guitarist.playGuitar();
            System.out.println("--------");

            // Appliance → Refrigerator
            Refrigerator fridge = new Refrigerator();
            fridge.switchOn();
            fridge.coolItems();
            System.out.println("--------");
            Bike bike = new Bike();
            bike.start();
            bike.ride();
            System.out.println("--------");

            // Computer → Laptop
            Laptop laptop = new Laptop();
            laptop.process();
            laptop.carry();
            System.out.println("--------");

            // Employee → Manager
            Manager manager = new Manager();
            manager.work();
            manager.manageTeam();
            System.out.println("--------");

            // Bird → Parrot
            Parrot parrot = new Parrot();
            parrot.fly();
            parrot.speak();
            System.out.println("--------");

            // Artist → Painter
            Painter painter = new Painter();
            painter.create();
            painter.paint();
            System.out.println("--------");
        }
    }

