package com.xworkz.toString.external;


import com.xworkz.toString.internal.Vehicle;

    public class VehicleRunner {
        public static void main(String[] args) {
            Vehicle vehicle1 = new Vehicle("Tesla", "Model S", 2023);
            Vehicle vehicle2 = new Vehicle("Mahindra", "Thar", 2022);

            System.out.println(vehicle1);
            System.out.println(vehicle2);
        }
    }
