package com.xworkz.toString.internal;

public class Tools {
    private String name;
    private String material;
    private double price;

    public Tools(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Tools) {
                System.out.println("Ref is Tools, comparing...");
                Tools tool1 = this;
                Tools tool2 = (Tools) obj;
                if (tool1.name.equals(tool2.name) && tool1.material.equals(tool2.material) && tool1.price == tool2.price) {
                    System.out.println("Both tools are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
