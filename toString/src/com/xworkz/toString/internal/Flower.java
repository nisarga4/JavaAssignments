package com.xworkz.toString.internal;

public class Flower {
    private String name;
    private String color;
    private boolean isFragrant;

    public Flower(String name, String color, boolean isFragrant) {
        this.name = name;
        this.color = color;
        this.isFragrant = isFragrant;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "Name='" + name + '\'' +
                ", Color='" + color + '\'' +
                ", Fragrant=" + (isFragrant ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 8080;
    }
}
