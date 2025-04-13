package com.xworkz.toString.internal;

public class Rasgulla {
    private String name;
    private double weight;
    private String sweetnessLevel;

    public Rasgulla(String name, double weight, String sweetnessLevel) {
        this.name = name;
        this.weight = weight;
        this.sweetnessLevel = sweetnessLevel;
    }

    @Override
    public String toString() {
        return "Rasgulla{" +
                "Name='" + name + '\'' +
                ", Weight=" + weight + "g" +
                ", Sweetness Level='" + sweetnessLevel + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Rasgulla) {
                Rasgulla otherRasgulla = (Rasgulla) obj;
                return this.name.equals(otherRasgulla.name) &&
                        this.weight == otherRasgulla.weight &&
                        this.sweetnessLevel.equals(otherRasgulla.sweetnessLevel);
            }
        }
        return false;
    }
}
