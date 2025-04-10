package com.xworkz.toString.internal;

public class Mug {
    private String color;
    private double capacity;
    private boolean hasHandle;

    public Mug(String color, double capacity, boolean hasHandle) {
        this.color = color;
        this.capacity = capacity;
        this.hasHandle = hasHandle;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "Color='" + color + '\'' +
                ", Capacity=" + capacity + "ml" +
                ", HasHandle=" + (hasHandle ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 51051;
    }
}
