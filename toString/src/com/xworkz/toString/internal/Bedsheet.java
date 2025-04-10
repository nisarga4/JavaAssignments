package com.xworkz.toString.internal;

public class Bedsheet {
    private String material;
    private String color;
    private double length;

    public Bedsheet(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bedsheet{" +
                "Material='" + material + '\'' +
                ", Color='" + color + '\'' +
                ", Length=" + length + "m" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90001;
    }
}
