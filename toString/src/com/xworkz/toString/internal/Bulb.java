package com.xworkz.toString.internal;

public class Bulb {
    private String brand;
    private String type;
    private double price;

    public Bulb(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bulb{Brand='" + brand + "', Type='" + type + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 456;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bulb) {
                System.out.println("Ref is Bulb, will compare...");
                Bulb bulb1 = this;
                Bulb bulb2 = (Bulb) obj;
                if (bulb1.brand.equals(bulb2.brand) && bulb1.type.equals(bulb2.type) && bulb1.price == bulb2.price) {
                    System.out.println("Both Bulbs are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
