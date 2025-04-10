package com.xworkz.toString.internal;

public class Candy {
    private String flavor;
    private String color;
    private double weight; // in grams

    public Candy(String flavor, String color, double weight) {
        this.flavor = flavor;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "Flavor='" + flavor + '\'' +
                ", Color='" + color + '\'' +
                ", Weight=" + weight + "g" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 1234;
    }
}
