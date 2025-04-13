package com.xworkz.toString.internal;

public class Football {
    private String brand;
    private String material;
    private double size;

    public Football(String brand, String material, double size) {
        this.brand = brand;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Football{Brand='" + brand + "', Material='" + material + "', Size=" + size + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 55;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Football) {
                Football football1 = this;
                Football football2 = (Football) obj;
                if (football1.brand.equals(football2.brand) && football1.material.equals(football2.material) && football1.size == football2.size) {
                    return true;
                }
            }
        }
        return false;
    }
}
