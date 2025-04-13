package com.xworkz.toString.internal;

public class Laptop {
    private String brand;
    private int ram;
    private String processor;

    public Laptop(String brand, int ram, String processor) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{Brand='" + brand + "', RAM=" + ram + "GB, Processor='" + processor + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 901;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Laptop) {
                Laptop l1 = this;
                Laptop l2 = (Laptop) obj;
                if (l1.brand.equals(l2.brand) && l1.ram == l2.ram && l1.processor.equals(l2.processor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
