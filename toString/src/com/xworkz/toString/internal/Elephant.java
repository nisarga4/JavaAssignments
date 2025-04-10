package com.xworkz.toString.internal;

public class Elephant {
    private String name;
    private double height;
    private boolean isTusked;

    public Elephant(String name, double height, boolean isTusked) {
        this.name = name;
        this.height = height;
        this.isTusked = isTusked;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "Name='" + name + '\'' +
                ", Height=" + height + "m" +
                ", Tusked=" + (isTusked ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 4040;
    }
}
