package com.xworkz.toString.internal;

public class Towel {
    private String color;
    private String material;
    private double length;

    public Towel(String color, String material, double length) {
        this.color = color;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Towel{" +
                "Color='" + color + '\'' +
                ", Material='" + material + '\'' +
                ", Length=" + length + "cm" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 42042;
    }
}
