package com.xworkz.toString.internal;

public class Battery {
    private String brand;
    private int capacity;
    private String type;

    public Battery(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Battery{Brand='" + brand + "', Capacity=" + capacity + "mAh, Type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 818;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Battery) {
                System.out.println("Ref is Battery, will compare...");
                Battery battery1 = this;
                Battery battery2 = (Battery) obj;
                if (battery1.brand.equals(battery2.brand) &&
                        battery1.capacity == battery2.capacity &&
                        battery1.type.equals(battery2.type)) {
                    System.out.println("Both batteries are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
