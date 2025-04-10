package com.xworkz.toString.internal;

public class Oil {
    private String type;
    private double volume;
    private boolean isEdible;

    public Oil(String type, double volume, boolean isEdible) {
        this.type = type;
        this.volume = volume;
        this.isEdible = isEdible;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "Type='" + type + '\'' +
                ", Volume=" + volume + "ml" +
                ", Edible=" + (isEdible ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90005;
    }
}
