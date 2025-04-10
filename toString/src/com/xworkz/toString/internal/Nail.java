package com.xworkz.toString.internal;

public class Nail {
    private String type;
    private double length;
    private boolean isRustProof;

    public Nail(String type, double length, boolean isRustProof) {
        this.type = type;
        this.length = length;
        this.isRustProof = isRustProof;
    }

    @Override
    public String toString() {
        return "Nail{" +
                "Type='" + type + '\'' +
                ", Length=" + length + "cm" +
                ", RustProof=" + (isRustProof ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 60303;
    }
}
