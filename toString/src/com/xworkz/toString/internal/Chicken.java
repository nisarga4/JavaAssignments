package com.xworkz.toString.internal;

public class Chicken {
    private String breed;
    private double weight;
    private String color;

    public Chicken(String breed, double weight, String color) {
        this.breed = breed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chicken{Breed='" + breed + "', Weight=" + weight + "kg, Color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 125;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Chicken) {
                System.out.println("Ref is Chicken, will compare...");
                Chicken chicken1 = this;
                Chicken chicken2 = (Chicken) obj;
                if (chicken1.breed.equals(chicken2.breed) && chicken1.weight == chicken2.weight && chicken1.color.equals(chicken2.color)) {
                    System.out.println("Both chickens are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
