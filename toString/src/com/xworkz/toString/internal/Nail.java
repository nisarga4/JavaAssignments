package com.xworkz.toString.internal;

public class Nail {
    private String material;
    private double length;
    private double diameter;

    public Nail(String material, double length, double diameter) {
        this.material = material;
        this.length = length;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Nail{" +
                "Material='" + material + '\'' +
                ", Length=" + length + "cm" +
                ", Diameter=" + diameter + "mm" +
                '}';
    }

    @Override
    public int hashCode() {
        return material.hashCode() + (int) length + (int) diameter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Nail) {
                Nail otherNail = (Nail) obj;
                return this.material.equals(otherNail.material) &&
                        this.length == otherNail.length &&
                        this.diameter == otherNail.diameter;
            }
        }
        return false;
    }
}
