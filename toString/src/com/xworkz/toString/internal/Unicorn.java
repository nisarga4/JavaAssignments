package com.xworkz.toString.internal;

public class Unicorn {
    private String name;
    private String color;
    private boolean magical;

    public Unicorn(String name, String color, boolean magical) {
        this.name = name;
        this.color = color;
        this.magical = magical;
    }

    @Override
    public String toString() {
        return "Unicorn{" +
                "Name='" + name + '\'' +
                ", Color='" + color + '\'' +
                ", Magical=" + (magical ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 43043;
    }
}
