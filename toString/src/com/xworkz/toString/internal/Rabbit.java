package com.xworkz.toString.internal;

public class Rabbit {
    private String color;
    private int age;
    private boolean isDomestic;

    public Rabbit(String color, int age, boolean isDomestic) {
        this.color = color;
        this.age = age;
        this.isDomestic = isDomestic;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "Color='" + color + '\'' +
                ", Age=" + age +
                ", Domestic=" + (isDomestic ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 31031;
    }
}
