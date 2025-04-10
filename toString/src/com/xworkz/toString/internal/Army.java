package com.xworkz.toString.internal;

public class Army {
    private String country;
    private int soldiers;
    private String division;

    public Army(String country, int soldiers, String division) {
        this.country = country;
        this.soldiers = soldiers;
        this.division = division;
    }

    @Override
    public String toString() {
        return "Army{" +
                "Country='" + country + '\'' +
                ", Soldiers=" + soldiers +
                ", Division='" + division + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 555;
    }
}
