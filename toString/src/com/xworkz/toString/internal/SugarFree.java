package com.xworkz.toString.internal;

public class SugarFree {
    private String brand;
    private String flavor;
    private double weight;

    public SugarFree(String brand, String flavor, double weight) {
        this.brand = brand;
        this.flavor = flavor;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SugarFree{" +
                "brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                ", weight=" + weight + "g" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 101;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof SugarFree) {
                System.out.println("Ref is SugarFree, comparing...");
                SugarFree sugarFree1 = this;
                SugarFree sugarFree2 = (SugarFree) obj;
                if (sugarFree1.brand.equals(sugarFree2.brand) && sugarFree1.flavor.equals(sugarFree2.flavor) && sugarFree1.weight == sugarFree2.weight) {
                    System.out.println("Both SugarFree products are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
