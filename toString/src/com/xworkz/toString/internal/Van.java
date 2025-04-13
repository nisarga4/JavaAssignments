package com.xworkz.toString.internal;

public class Van {
    private String brand;
    private String model;
    private int year;

    public Van(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Van{Brand='" + brand + "', Model='" + model + "', Year=" + year + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 999;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Van) {
                Van van1 = this;
                Van van2 = (Van) obj;
                if (van1.brand.equals(van2.brand) && van1.model.equals(van2.model) && van1.year == van2.year) {
                    return true;
                }
            }
        }
        return false;
    }
}
