package com.xworkz.Casting;

public class Vet {

        public void treatAnimal(Animal animal) {
            animal.eat();
            animal.sleep();
            animal.move();
            animal.makeSound();
            animal.breathe();

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal; // Safe casting
                dog.wagTail();          // Unique method
            }
        }
    }

