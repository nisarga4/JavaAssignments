package com.xworkz.toString.internal;

public class Bus {
    private String brand;
    private int capacity;
    private String type;

    public Bus(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Brand='" + brand + '\'' +
                ", Capacity=" + capacity +
                ", Type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 999;
    }
}
