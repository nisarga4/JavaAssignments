package com.xworkz.toString.internal;

public class SoapPowder {
    private String brand;
    private double weight;
    private String fragrance;

    public SoapPowder(String brand, double weight, String fragrance) {
        this.brand = brand;
        this.weight = weight;
        this.fragrance = fragrance;
    }

    @Override
    public String toString() {
        return "SoapPowder{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight + " kg" +
                ", fragrance='" + fragrance + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 102;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof SoapPowder) {
                System.out.println("Ref is SoapPowder, comparing...");
                SoapPowder soap1 = this;
                SoapPowder soap2 = (SoapPowder) obj;
                if (soap1.brand.equals(soap2.brand) && soap1.weight == soap2.weight && soap1.fragrance.equals(soap2.fragrance)) {
                    System.out.println("Both SoapPowders are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
