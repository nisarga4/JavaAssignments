package com.xworkz.toString.internal;

public class Flower {
    private String name;
    private String color;
    private double price;

    public Flower(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{Name='" + name + "', Color='" + color + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 45;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Flower) {
                Flower flower1 = this;
                Flower flower2 = (Flower) obj;
                if (flower1.name.equals(flower2.name) && flower1.color.equals(flower2.color) && flower1.price == flower2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
