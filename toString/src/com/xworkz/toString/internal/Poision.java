package com.xworkz.toString.internal;

public class Poision {
    private String name;
    private double toxicityLevel;
    private String origin;

    public Poision(String name, double toxicityLevel, String origin) {
        this.name = name;
        this.toxicityLevel = toxicityLevel;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Poison{" +
                "Name='" + name + '\'' +
                ", Toxicity Level=" + toxicityLevel +
                ", Origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Poision) {
                Poision otherPoison = (Poision) obj;
                return this.name.equals(otherPoison.name) &&
                        this.toxicityLevel == otherPoison.toxicityLevel &&
                        this.origin.equals(otherPoison.origin);
            }
        }
        return false;
    }
}
