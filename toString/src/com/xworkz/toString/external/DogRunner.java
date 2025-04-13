package com.xworkz.toString.external;

import com.xworkz.toString.internal.Dog;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever", 4);
        System.out.println(dog1);

        int hash = dog1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(dog1));

        Dog dog2 = new Dog("Buddy", "Golden Retriever", 4);
        Dog dog3 = new Dog("Max", "Bulldog", 3);

        System.out.println("Checking same location: " + (dog1 == dog2));
        boolean same = dog1.equals(dog2);
        System.out.println("Dog1 is same as Dog2: " + same);

        System.out.println("Dog1 is same as Dog3: " + dog1.equals(dog3));
    }
}
