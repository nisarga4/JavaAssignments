package com.xworkz.toString.internal;

public class Apple {
    private String variety;
    private String origin;
    private double pricePerKg;

    public Apple(String variety, String origin, double pricePerKg) {
        this.variety = variety;
        this.origin = origin;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "Variety='" + variety + '\'' +
                ", Origin='" + origin + '\'' +
                ", PricePerKg=" + pricePerKg + " INR" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 444;
    }
}
