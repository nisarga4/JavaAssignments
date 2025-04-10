package com.xworkz.toString.internal;

public class Chicken {
    private String breed;
    private double weight; // in kg
    private boolean isFarmRaised;

    public Chicken(String breed, double weight, boolean isFarmRaised) {
        this.breed = breed;
        this.weight = weight;
        this.isFarmRaised = isFarmRaised;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "Breed='" + breed + '\'' +
                ", Weight=" + weight + "kg" +
                ", FarmRaised=" + (isFarmRaised ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 4321;
    }
}
