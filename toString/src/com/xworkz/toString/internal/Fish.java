package com.xworkz.toString.internal;

public class Fish {
    private String species;
    private double weight;
    private String habitat;

    public Fish(String species, double weight, String habitat) {
        this.species = species;
        this.weight = weight;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Fish{Species='" + species + "', Weight=" + weight + "kg, Habitat='" + habitat + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Fish) {
                Fish fish1 = this;
                Fish fish2 = (Fish) obj;
                if (fish1.species.equals(fish2.species) && fish1.weight == fish2.weight && fish1.habitat.equals(fish2.habitat)) {
                    return true;
                }
            }
        }
        return false;
    }
}
