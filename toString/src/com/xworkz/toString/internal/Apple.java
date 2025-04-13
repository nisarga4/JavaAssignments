package com.xworkz.toString.internal;

public class Apple {
    private String color;
    private String origin;
    private double weight;

    public Apple(String color, String origin, double weight) {
        this.color = color;
        this.origin = origin;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", origin='" + origin + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 88;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Apple) {
                Apple apple1 = this;
                Apple apple2 = (Apple) obj;
                if (apple1.color.equals(apple2.color) &&
                        apple1.origin.equals(apple2.origin) &&
                        apple1.weight == apple2.weight) {
                    return true;
                }
            }
        }
        return false;
    }
}
