package com.xworkz.toString.internal;

public class Sunglass {
    private String brand;
    private String color;
    private String lensType;

    public Sunglass(String brand, String color, String lensType) {
        this.brand = brand;
        this.color = color;
        this.lensType = lensType;
    }

    @Override
    public String toString() {
        return "Sunglass{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", lensType='" + lensType + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sunglass) {
                System.out.println("Ref is Sunglass, comparing...");
                Sunglass sunglass1 = this;
                Sunglass sunglass2 = (Sunglass) obj;
                if (sunglass1.brand.equals(sunglass2.brand) && sunglass1.color.equals(sunglass2.color) && sunglass1.lensType.equals(sunglass2.lensType)) {
                    System.out.println("Both sunglasses are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
