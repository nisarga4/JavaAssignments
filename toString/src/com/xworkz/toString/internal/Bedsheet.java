package com.xworkz.toString.internal;

public class Bedsheet {
    private String material;
    private String color;
    private double price;

    public Bedsheet(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bedsheet{Material='" + material + "', Color='" + color + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 777;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bedsheet) {
                System.out.println("Ref is Bedsheet, will compare...");
                Bedsheet bedsheet1 = this;
                Bedsheet bedsheet2 = (Bedsheet) obj;
                if (bedsheet1.material.equals(bedsheet2.material) &&
                        bedsheet1.color.equals(bedsheet2.color) &&
                        bedsheet1.price == bedsheet2.price) {
                    System.out.println("Both bedsheets are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
