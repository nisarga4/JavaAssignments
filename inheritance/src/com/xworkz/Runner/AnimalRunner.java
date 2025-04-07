package com.xworkz.Runner;

import com.xworkz.Casting.Animal;
import com.xworkz.Casting.Dog;
import com.xworkz.Casting.Vet;

public class AnimalRunner {

        public static void main(String[] args) {
            Animal animal = new Dog(); // Upcasting
            Vet vet = new Vet();
            vet.treatAnimal(animal); // Pass parent, invoke all + cast
        }
    }