package com.xworkz.toString.internal;

public class Elephant {
    private String species;
    private double weight;
    private int age;

    public Elephant(String species, double weight, int age) {
        this.species = species;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Elephant{Species='" + species + "', Weight=" + weight + "kg, Age=" + age + " years}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 456;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Elephant) {
                Elephant elephant1 = this;
                Elephant elephant2 = (Elephant) obj;
                if (elephant1.species.equals(elephant2.species) && elephant1.weight == elephant2.weight && elephant1.age == elephant2.age) {
                    return true;
                }
            }
        }
        return false;
    }
}
