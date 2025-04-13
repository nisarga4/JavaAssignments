package com.xworkz.toString.internal;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{Name='" + name + "', Breed='" + breed + "', Age=" + age + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 42;  // Returning a fixed hash code for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Dog) {
                System.out.println("Ref is Dog, will compare...");
                Dog dog1 = this;
                Dog dog2 = (Dog) obj;
                if (dog1.name.equals(dog2.name) && dog1.breed.equals(dog2.breed) && dog1.age == dog2.age) {
                    System.out.println("Both dogs are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
