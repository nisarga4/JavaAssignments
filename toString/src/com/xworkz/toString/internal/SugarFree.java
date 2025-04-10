package com.xworkz.toString.internal;

public class SugarFree {
    private String type;
    private int tablets;
    private boolean suitableForDiabetic;

    public SugarFree(String type, int tablets, boolean suitableForDiabetic) {
        this.type = type;
        this.tablets = tablets;
        this.suitableForDiabetic = suitableForDiabetic;
    }

    @Override
    public String toString() {
        return "SugarFree{" +
                "Type='" + type + '\'' +
                ", Tablets=" + tablets +
                ", SuitableForDiabetic=" + (suitableForDiabetic ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 38038;
    }
}
