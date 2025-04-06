package com.xworkz.isRelation;

import com.xworkz.inheritance.Mug;
import com.xworkz.inheritance.Coffee;

    public class CoffeRunner {
        public static void main(String[] args) {
            Mug mug = new Mug();
            mug.brew();
            mug.pour();
            mug.stir();
            mug.serve();
            mug.drink();

            System.out.println("--------------------------------------");

            Coffee coffee = new Mug(); // Polymorphic reference
            coffee.brew();
            coffee.pour();
            coffee.stir();
            coffee.serve();
            coffee.drink();
        }
    }


