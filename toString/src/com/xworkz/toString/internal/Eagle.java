package com.xworkz.toString.internal;

public class Eagle {
    private String species;
    private double wingspan;
    private boolean isEndangered;

    public Eagle(String species, double wingspan, boolean isEndangered) {
        this.species = species;
        this.wingspan = wingspan;
        this.isEndangered = isEndangered;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "Species='" + species + '\'' +
                ", Wingspan=" + wingspan + "m" +
                ", Endangered=" + (isEndangered ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 2020;
    }
}
