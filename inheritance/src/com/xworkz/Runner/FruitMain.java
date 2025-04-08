package com.xworkz.Runner;

import com.xworkz.Casting.Banana;
import com.xworkz.Casting.Fruit;
import com.xworkz.Casting.FruitHandler;
import com.xworkz.Casting.Grapes;

public class FruitMain {
        public static void main(String[] args) {
            FruitHandler handler = new FruitHandler();

            Fruit banana = new Banana();
            System.out.println("--- Banana Process ---");
            handler.prepareFruit(banana);

            System.out.println("\n--- Grapes Process ---");
            Fruit grapes = new Grapes();
            handler.prepareFruit(grapes);
        }
    }

