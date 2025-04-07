package com.xworkz.inheritance;

public class Milton extends Cap {

    public void keepWarm() {
        System.out.println("Milton keeps liquids warm...");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in Milton");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in Milton");
    }

    @Override
    public void fill() {
        super.fill();
        System.out.println("Running fill in Milton");
    }

    @Override
    public void empty() {
        super.empty();
        System.out.println("Running empty in Milton");
    }

    @Override
    public void shake() {
        super.shake();
        System.out.println("Running shake in Milton");

        }
    }

