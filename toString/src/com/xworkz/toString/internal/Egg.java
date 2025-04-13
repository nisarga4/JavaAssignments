package com.xworkz.toString.internal;

public class Egg {
    private String brand;
    private String size;
    private String color;

    public Egg(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Egg{Brand='" + brand + "', Size='" + size + "', Color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Egg) {
                Egg egg1 = this;
                Egg egg2 = (Egg) obj;
                if (egg1.brand.equals(egg2.brand) && egg1.size.equals(egg2.size) && egg1.color.equals(egg2.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}
