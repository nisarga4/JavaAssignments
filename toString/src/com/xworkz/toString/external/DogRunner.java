package com.xworkz.toString.external;

import com.xworkz.toString.internal.Dog;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador", 3, true);
        Dog dog2 = new Dog("Beagle", 2, false);

        System.out.println(dog1);
        System.out.println(dog2);

        int code1 = dog1.hashCode();
        System.out.println("Code1: " + code1);

        int code2 = dog2.hashCode();
        System.out.println("Code2: " + code2);

        System.out.println(new Dog("German Shepherd", 4, true).hashCode());
    }
}
