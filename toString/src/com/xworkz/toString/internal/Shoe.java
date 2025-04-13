package com.xworkz.toString.internal;

public class Shoe {
    private String brand;
    private String size;
    private String color;

    public Shoe(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 456;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shoe) {
                System.out.println("Ref is Shoe, comparing...");
                Shoe shoe1 = this;
                Shoe shoe2 = (Shoe) obj;
                if (shoe1.brand.equals(shoe2.brand) && shoe1.size.equals(shoe2.size) && shoe1.color.equals(shoe2.color)) {
                    System.out.println("Both Shoes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
