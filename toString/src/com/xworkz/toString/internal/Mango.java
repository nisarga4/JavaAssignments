package com.xworkz.toString.internal;

public class Mango {
    private String variety;
    private double weight;
    private boolean isSweet;

    public Mango(String variety, double weight, boolean isSweet) {
        this.variety = variety;
        this.weight = weight;
        this.isSweet = isSweet;
    }

    @Override
    public String toString() {
        return "Mango{" +
                "Variety='" + variety + '\'' +
                ", Weight=" + weight + "g" +
                ", Sweet=" + (isSweet ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 90010;
    }
}
