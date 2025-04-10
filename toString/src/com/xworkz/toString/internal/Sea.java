package com.xworkz.toString.internal;

public class Sea {
    private String name;
    private double depth; // in meters
    private boolean salty;

    public Sea(String name, double depth, boolean salty) {
        this.name = name;
        this.depth = depth;
        this.salty = salty;
    }

    @Override
    public String toString() {
        return "Sea{" +
                "Name='" + name + '\'' +
                ", Depth=" + depth + "m" +
                ", Salty=" + (salty ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 34034;
    }
}
