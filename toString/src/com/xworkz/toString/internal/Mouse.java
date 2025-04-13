package com.xworkz.toString.internal;

public class Mouse {
    private String brand;
    private String type;
    private double price;

    public Mouse(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse{Brand='" + brand + "', Type='" + type + "', Price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 503;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Mouse) {
                Mouse mouse1 = this;
                Mouse mouse2 = (Mouse) obj;
                if (mouse1.brand.equals(mouse2.brand) && mouse1.type.equals(mouse2.type) && mouse1.price == mouse2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
