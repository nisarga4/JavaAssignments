package com.xworkz.toString.internal;

public class School {
    private String name;
    private String location;
    private int strength;

    public School(String name, String location, int strength) {
        this.name = name;
        this.location = location;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "School{" +
                "Name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Strength=" + strength +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 33033;
    }
}
