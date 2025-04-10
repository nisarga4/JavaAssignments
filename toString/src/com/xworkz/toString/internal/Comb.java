package com.xworkz.toString.internal;

public class Comb {
    private String material;
    private boolean isWideTooth;
    private String color;

    public Comb(String material, boolean isWideTooth, String color) {
        this.material = material;
        this.isWideTooth = isWideTooth;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Comb{" +
                "Material='" + material + '\'' +
                ", WideTooth=" + (isWideTooth ? "Yes" : "No") +
                ", Color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90006;
    }
}
