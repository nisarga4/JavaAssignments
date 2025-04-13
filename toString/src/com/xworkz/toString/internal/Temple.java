package com.xworkz.toString.internal;

public class Temple {
    private String name;
    private String location;
    private int yearOfEstablishment;

    public Temple(String name, String location, int yearOfEstablishment) {
        this.name = name;
        this.location = location;
        this.yearOfEstablishment = yearOfEstablishment;
    }

    @Override
    public String toString() {
        return "Temple{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 33;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Temple) {
                System.out.println("Ref is Temple, comparing...");
                Temple temple1 = this;
                Temple temple2 = (Temple) obj;
                if (temple1.name.equals(temple2.name) && temple1.location.equals(temple2.location) && temple1.yearOfEstablishment == temple2.yearOfEstablishment) {
                    System.out.println("Both temples are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
