package com.xworkz.isRelation;

import com.xworkz.inheritance.Flower;
import com.xworkz.inheritance.Petal;

    public class FlowerRunner {
        public static void main(String[] args) {
            Petal petal = new Petal();
            petal.bloom();
            petal.smell();
            petal.attractBees();
            petal.absorbSunlight();
            petal.grow();

            System.out.println("--------------------------------------");

            Flower flower = new Petal();
            flower.bloom();
            flower.smell();
            flower.attractBees();
            flower.absorbSunlight();
            flower.grow();
        }
    }
