package com.xworkz.toString.internal;

public class Mug {
    private String color;
    private String material;
    private double capacity; // in liters

    public Mug(String color, String material, double capacity) {
        this.color = color;
        this.material = material;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "Color='" + color + '\'' +
                ", Material='" + material + '\'' +
                ", Capacity=" + capacity + "L" +
                '}';
    }

    @Override
    public int hashCode() {
        return color.hashCode() + material.hashCode() + (int) capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Mug) {
                Mug otherMug = (Mug) obj;
                return this.color.equals(otherMug.color) &&
                        this.material.equals(otherMug.material) &&
                        this.capacity == otherMug.capacity;
            }
        }
        return false;
    }
}
