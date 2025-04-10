package com.xworkz.toString.internal;

public class Smartwatch {
    private String brand;
    private boolean waterproof;
    private double price;

    public Smartwatch(String brand, boolean waterproof, double price) {
        this.brand = brand;
        this.waterproof = waterproof;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "Brand='" + brand + '\'' +
                ", Waterproof=" + (waterproof ? "Yes" : "No") +
                ", Price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 36036;
    }
}
