package com.xworkz.toString.internal;

public class Cycle {
    private String brand;
    private String type;
    private int gearCount;

    public Cycle(String brand, String type, int gearCount) {
        this.brand = brand;
        this.type = type;
        this.gearCount = gearCount;
    }

    @Override
    public String toString() {
        return "Cycle{Brand='" + brand + "', Type='" + type + "', GearCount=" + gearCount + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 101;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cycle) {
                System.out.println("Ref is Cycle, will compare...");
                Cycle cycle1 = this;
                Cycle cycle2 = (Cycle) obj;
                if (cycle1.brand.equals(cycle2.brand) && cycle1.type.equals(cycle2.type) && cycle1.gearCount == cycle2.gearCount) {
                    System.out.println("Both Cycles are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
