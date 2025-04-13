package com.xworkz.toString.internal;

public class Sea {
    private String name;
    private String location;
    private double depth;

    public Sea(String name, String location, double depth) {
        this.name = name;
        this.location = location;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Sea{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", depth=" + depth +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sea) {
                System.out.println("Ref is Sea, comparing...");
                Sea sea1 = this;
                Sea sea2 = (Sea) obj;
                if (sea1.name.equals(sea2.name) && sea1.location.equals(sea2.location) && sea1.depth == sea2.depth) {
                    System.out.println("Both Sea objects are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
