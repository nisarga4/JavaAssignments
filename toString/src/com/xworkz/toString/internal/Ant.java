package com.xworkz.toString.internal;

public class Ant {
    private String species;
    private int numberOfLegs;
    private boolean isWorker;

    public Ant(String species, int numberOfLegs, boolean isWorker) {
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.isWorker = isWorker;
    }

    @Override
    public String toString() {
        return "Ant{" +
                "Species='" + species + '\'' +
                ", Legs=" + numberOfLegs +
                ", Worker=" + (isWorker ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 222;
    }
}
