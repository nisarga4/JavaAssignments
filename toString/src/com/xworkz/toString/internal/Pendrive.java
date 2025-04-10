package com.xworkz.toString.internal;

public class Pendrive {
    private String brand;
    private int capacity;
    private boolean usb3;

    public Pendrive(String brand, int capacity, boolean usb3) {
        this.brand = brand;
        this.capacity = capacity;
        this.usb3 = usb3;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "Brand='" + brand + '\'' +
                ", Capacity=" + capacity + "GB" +
                ", USB3.0=" + (usb3 ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 52052;
    }
}
