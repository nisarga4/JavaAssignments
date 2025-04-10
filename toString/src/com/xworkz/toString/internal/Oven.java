package com.xworkz.toString.internal;

public class Oven {
    private String type;
    private String brand;
    private int capacity;

    public Oven(String type, String brand, int capacity) {
        this.type = type;
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "Type='" + type + '\'' +
                ", Brand='" + brand + '\'' +
                ", Capacity=" + capacity + "L" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 28028;
    }
}
