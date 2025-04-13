package com.xworkz.toString.internal;

public class Eagle {
    private String species;  // Species of the Eagle (e.g., Golden Eagle, Bald Eagle)
    private double wingspan;  // Wingspan in meters
    private String habitat;  // Habitat of the Eagle (e.g., Forest, Mountains)

    public Eagle(String species, double wingspan, String habitat) {
        this.species = species;
        this.wingspan = wingspan;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Eagle{Species='" + species + "', Wingspan=" + wingspan + "m, Habitat='" + habitat + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;  // Returning a fixed hash code for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Eagle) {
                System.out.println("Ref is Eagle, will compare...");
                Eagle eagle1 = this;
                Eagle eagle2 = (Eagle) obj;
                if (eagle1.species.equals(eagle2.species) && eagle1.wingspan == eagle2.wingspan && eagle1.habitat.equals(eagle2.habitat)) {
                    System.out.println("Both Eagles are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
