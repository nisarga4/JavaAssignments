package com.xworkz.toString.internal;

public class Rabbit {
    private String breed;
    private double weight;
    private String color;

    public Rabbit(String breed, double weight, String color) {
        this.breed = breed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "Breed='" + breed + '\'' +
                ", Weight=" + weight + "kg" +
                ", Color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Rabbit) {
                Rabbit otherRabbit = (Rabbit) obj;
                return this.breed.equals(otherRabbit.breed) &&
                        this.weight == otherRabbit.weight &&
                        this.color.equals(otherRabbit.color);
            }
        }
        return false;
    }
}
