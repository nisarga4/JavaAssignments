package com.xworkz.toString.internal;

public class Egg {
    private String type;
    private boolean isBoiled;
    private double weight;

    public Egg(String type, boolean isBoiled, double weight) {
        this.type = type;
        this.isBoiled = isBoiled;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Egg{" +
                "Type='" + type + '\'' +
                ", Boiled=" + (isBoiled ? "Yes" : "No") +
                ", Weight=" + weight + "g" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 3030;
    }
}
