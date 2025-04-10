package com.xworkz.toString.internal;

public class Cycle {
    private String brand;
    private String type;
    private int gearCount;

    public Cycle(String brand, String type, int gearCount) {
        this.brand = brand;
        this.type = type;
        this.gearCount = gearCount;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "Brand='" + brand + '\'' +
                ", Type='" + type + '\'' +
                ", GearCount=" + gearCount +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80006;
    }
}
