package com.xworkz.toString.internal;

public class Laptop {
    private String brand;
    private int ram;
    private String processor;

    public Laptop(String brand, int ram, String processor) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Brand='" + brand + '\'' +
                ", RAM=" + ram + "GB" +
                ", Processor='" + processor + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 19019;
    }
}
