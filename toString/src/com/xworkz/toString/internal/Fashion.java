package com.xworkz.toString.internal;

public class Fashion {
    private String type;
    private String brand;
    private double price;

    public Fashion(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fashion{Type='" + type + "', Brand='" + brand + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 678;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Fashion) {
                Fashion fashion1 = this;
                Fashion fashion2 = (Fashion) obj;
                if (fashion1.type.equals(fashion2.type) && fashion1.brand.equals(fashion2.brand) && fashion1.price == fashion2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
