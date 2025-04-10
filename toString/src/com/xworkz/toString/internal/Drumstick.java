package com.xworkz.toString.internal;

public class Drumstick {
    private double length; // in cm
    private boolean isFresh;
    private String origin;

    public Drumstick(double length, boolean isFresh, String origin) {
        this.length = length;
        this.isFresh = isFresh;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Drumstick{" +
                "Length=" + length + "cm" +
                ", Fresh=" + (isFresh ? "Yes" : "No") +
                ", Origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 1010;
    }
}
