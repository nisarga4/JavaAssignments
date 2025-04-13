package com.xworkz.toString.internal;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{Brand='" + brand + "', Model='" + model + "', Year=" + year + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 567;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Vehicle) {
                Vehicle vehicle1 = this;
                Vehicle vehicle2 = (Vehicle) obj;
                if (vehicle1.brand.equals(vehicle2.brand) && vehicle1.model.equals(vehicle2.model) && vehicle1.year == vehicle2.year) {
                    return true;
                }
            }
        }
        return false;
    }
}
