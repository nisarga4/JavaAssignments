package com.xworkz.toString.internal;

public class Shoe {
    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "Brand='" + brand + '\'' +
                ", Size=" + size +
                ", Color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 80001;
    }
}
