package com.xworkz.toString.internal;

public class Fish {
    private String species;
    private double weight;
    private boolean isFreshwater;

    public Fish(String species, double weight, boolean isFreshwater) {
        this.species = species;
        this.weight = weight;
        this.isFreshwater = isFreshwater;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "Species='" + species + '\'' +
                ", Weight=" + weight + "kg" +
                ", Freshwater=" + (isFreshwater ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 7070;
    }
}
