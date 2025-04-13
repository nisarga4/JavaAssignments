package com.xworkz.toString.internal;

public class Ant {
    private String species;
    private double size;
    private String color;

    public Ant(String species, double size, String color) {
        this.species = species;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ant{Species='" + species + "', Size=" + size + "mm, Color='" + color + "'}";
    }

    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Ant) {
                System.out.println("Ref is Ant, will compare...");
                Ant ant1 = this;
                Ant ant2 = (Ant) obj;
                if (ant1.species.equals(ant2.species) && ant1.size == ant2.size && ant1.color.equals(ant2.color)) {
                    System.out.println("Both Ants are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
