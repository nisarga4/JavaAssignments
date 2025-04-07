package com.xworkz.Casting;

    public class Ornithologist {

        public void observeBird(Bird bird) {
            bird.fly();
            bird.sing();
            bird.buildNest();
            bird.eat();
            bird.sleep();

            if (bird instanceof Parrot) {
                Parrot parrot = (Parrot) bird; // Safe casting
                parrot.talk(); // Unique method
            }
        }
    }

