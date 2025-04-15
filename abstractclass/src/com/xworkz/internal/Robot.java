package com.xworkz.internal;
public class Robot extends Machine {

    private String function;

    public Robot(String model, String brand, int year, double weight, String function) {
        super(model, brand, year, weight);
        this.function = function;
    }

    public Robot(String model, String brand, int year, String function) {
        super(model, brand, year);
        this.function = function;
    }

    public Robot(String model, String brand, String function) {
        super(model, brand);
        this.function = function;
    }

    @Override
    public void specs() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Function: " + function);
        displayWeight();
    }
}

