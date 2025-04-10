package com.xworkz.toString.external;

import com.xworkz.toString.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Bike", "Yamaha", 150);
        Vehicle v2 = new Vehicle("Car", "Toyota", 1800);

        System.out.println(v1);
        System.out.println(v2);

        System.out.println("HashCode1: " + v1.hashCode());
        System.out.println("HashCode2: " + v2.hashCode());
        System.out.println(new Vehicle("Truck", "Tata", 5000).hashCode());
    }
}
