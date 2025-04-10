package com.xworkz.toString.internal;

public class Panipuri {
    private String waterType;
    private boolean spicy;
    private int count;

    public Panipuri(String waterType, boolean spicy, int count) {
        this.waterType = waterType;
        this.spicy = spicy;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Panipuri{" +
                "WaterType='" + waterType + '\'' +
                ", Spicy=" + (spicy ? "Yes" : "No") +
                ", Count=" + count +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 29029;
    }
}
