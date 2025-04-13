package com.xworkz.toString.external;

import com.xworkz.toString.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2020);
        System.out.println(vehicle1);

        int hash = vehicle1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(vehicle1));

        Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 2020);
        Vehicle vehicle3 = new Vehicle("Honda", "Civic", 2021);

        System.out.println("Checking same location: " + (vehicle1 == vehicle2));
        boolean same = vehicle1.equals(vehicle2);
        System.out.println("Vehicle1 is same as Vehicle2: " + same);

        System.out.println("Vehicle1 is same as Vehicle3: " + vehicle1.equals(vehicle3));
    }
}
