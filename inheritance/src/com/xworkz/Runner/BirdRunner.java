package com.xworkz.Runner;

import com.xworkz.Casting.Bird;
import com.xworkz.Casting.Ornithologist;
import com.xworkz.Casting.Parrot;

public class BirdRunner {
        public static void main(String[] args) {
            Bird bird = new Parrot(); // Upcasting
            Ornithologist ornithologist = new Ornithologist();
            ornithologist.observeBird(bird); // Pass parent, cast to child
        }
    }
