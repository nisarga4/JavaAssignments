package com.xworkz.toString.internal;

public class Vehicle {
    private String type;
    private String brand;
    private double engineCC;

    public Vehicle(String type, String brand, double engineCC) {
        this.type = type;
        this.brand = brand;
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Type='" + type + '\'' +
                ", Brand='" + brand + '\'' +
                ", EngineCC=" + engineCC +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 44044;
    }
}
