package com.xworkz.toString.internal;

public class Water {
    private String source;
    private double pHLevel;
    private boolean drinkable;

    public Water(String source, double pHLevel, boolean drinkable) {
        this.source = source;
        this.pHLevel = pHLevel;
        this.drinkable = drinkable;
    }

    @Override
    public String toString() {
        return "Water{" +
                "Source='" + source + '\'' +
                ", pHLevel=" + pHLevel +
                ", Drinkable=" + (drinkable ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 47047;
    }
}
