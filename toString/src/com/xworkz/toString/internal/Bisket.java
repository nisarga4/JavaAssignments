package com.xworkz.toString.internal;

public class Bisket {
    private String flavor;
    private int pieces;
    private boolean isSweet;

    public Bisket(String flavor, int pieces, boolean isSweet) {
        this.flavor = flavor;
        this.pieces = pieces;
        this.isSweet = isSweet;
    }

    @Override
    public String toString() {
        return "Bisket{" +
                "Flavor='" + flavor + '\'' +
                ", Pieces=" + pieces +
                ", Sweet=" + (isSweet ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 60101;
    }
}
