package com.xworkz.toString.internal;

public class Baloon {
    private String color;
    private double diameter;
    private boolean isHeliumFilled;

    public Baloon(String color, double diameter, boolean isHeliumFilled) {
        this.color = color;
        this.diameter = diameter;
        this.isHeliumFilled = isHeliumFilled;
    }

    @Override
    public String toString() {
        return "Baloon{" +
                "Color='" + color + '\'' +
                ", Diameter=" + diameter + "cm" +
                ", HeliumFilled=" + (isHeliumFilled ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90002;
    }
}
