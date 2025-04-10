package com.xworkz.toString.internal;

public class Baby {
    private String name;
    private int ageInMonths;
    private double weight; // in kg

    public Baby(String name, int ageInMonths, double weight) {
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "Name='" + name + '\'' +
                ", AgeInMonths=" + ageInMonths +
                ", Weight=" + weight + "kg" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 666;
    }
}
