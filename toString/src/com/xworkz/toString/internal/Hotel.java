package com.xworkz.toString.internal;

public class Hotel {
    private String name;
    private int stars;
    private boolean hasSwimmingPool;

    public Hotel(String name, int stars, boolean hasSwimmingPool) {
        this.name = name;
        this.stars = stars;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Name='" + name + '\'' +
                ", Stars=" + stars +
                ", SwimmingPool=" + (hasSwimmingPool ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 14014;
    }
}
