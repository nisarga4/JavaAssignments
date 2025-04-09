package com.xworkz.toString.external;
import com.xworkz.toString.internal.Dog;

    public class DogRunner {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Bruno", "Labrador", 3, true);
            Dog dog2 = new Dog("Lucy", "Beagle", 2, false);

            System.out.println(dog1);
            System.out.println(dog2);
        }
    }
