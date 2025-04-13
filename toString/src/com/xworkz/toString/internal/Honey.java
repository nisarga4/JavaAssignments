package com.xworkz.toString.internal;

public class Honey {
    private String type;
    private double weight;
    private String origin;

    public Honey(String type, double weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Honey{Type='" + type + "', Weight=" + weight + "kg, Origin='" + origin + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 500;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Honey) {
                Honey honey1 = this;
                Honey honey2 = (Honey) obj;
                if (honey1.type.equals(honey2.type) && honey1.weight == honey2.weight && honey1.origin.equals(honey2.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}
