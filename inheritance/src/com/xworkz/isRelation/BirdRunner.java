package com.xworkz.isRelation;
import com.xworkz.inheritance.Bird;
import com.xworkz.inheritance.Feather;

    public class BirdRunner {
        public static void main(String[] args) {
            Feather feather = new Feather();
            feather.fly();
            feather.chirp();
            feather.buildNest();
            feather.layEggs();
            feather.migrate();

            System.out.println("--------------------------------------");

            Bird bird = new Feather();
            bird.fly();
            bird.chirp();
            bird.buildNest();
            bird.layEggs();
            bird.migrate();
        }
    }

