package com.xworkz.toString.internal;

public class Dog {
    private String breed;
    private int age; // in years
    private boolean isTrained;

    public Dog(String breed, int age, boolean isTrained) {
        this.breed = breed;
        this.age = age;
        this.isTrained = isTrained;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Breed='" + breed + '\'' +
                ", Age=" + age + " years" +
                ", Trained=" + (isTrained ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 7788;
    }
}
