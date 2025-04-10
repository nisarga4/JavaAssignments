package com.xworkz.toString.internal;

public class Frog {
    private String species;
    private String habitat;
    private boolean isPoisonous;

    public Frog(String species, String habitat, boolean isPoisonous) {
        this.species = species;
        this.habitat = habitat;
        this.isPoisonous = isPoisonous;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "Species='" + species + '\'' +
                ", Habitat='" + habitat + '\'' +
                ", Poisonous=" + (isPoisonous ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 10010;
    }
}
