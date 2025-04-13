package com.xworkz.toString.internal;

public class Frog {
    private String species;
    private String color;
    private double weight;

    public Frog(String species, String color, double weight) {
        this.species = species;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Frog{Species='" + species + "', Color='" + color + "', Weight=" + weight + "kg}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Frog) {
                Frog frog1 = this;
                Frog frog2 = (Frog) obj;
                if (frog1.species.equals(frog2.species) && frog1.color.equals(frog2.color) && frog1.weight == frog2.weight) {
                    return true;
                }
            }
        }
        return false;
    }
}
