package com.xworkz.toString.internal;

public class Dam {
    private String location;
    private double capacity; // in cubic meters
    private int yearOfConstruction;

    public Dam(String location, double capacity, int yearOfConstruction) {
        this.location = location;
        this.capacity = capacity;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        return "Dam{Location='" + location + "', Capacity=" + capacity + " cubic meters, Year of Construction=" + yearOfConstruction + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Dam) {
                System.out.println("Ref is Dam, will compare...");
                Dam dam1 = this;
                Dam dam2 = (Dam) obj;
                if (dam1.location.equals(dam2.location) && dam1.capacity == dam2.capacity && dam1.yearOfConstruction == dam2.yearOfConstruction) {
                    System.out.println("Both Dams are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
