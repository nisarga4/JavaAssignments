package com.xworkz.toString.internal;

public class Chain {
    private String material;
    private double length;
    private boolean isGoldPlated;

    public Chain(String material, double length, boolean isGoldPlated) {
        this.material = material;
        this.length = length;
        this.isGoldPlated = isGoldPlated;
    }

    @Override
    public String toString() {
        return "Chain{" +
                "Material='" + material + '\'' +
                ", Length=" + length + "cm" +
                ", GoldPlated=" + (isGoldPlated ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90003;
    }
}
