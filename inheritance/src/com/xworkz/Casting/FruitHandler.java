package com.xworkz.Casting;

    public class FruitHandler {

        public void prepareFruit(Fruit fruit) {
            fruit.wash();
            fruit.peel();
            fruit.cut();
            fruit.serve();
            fruit.eat();

            if (fruit instanceof Banana) {
                Banana banana = (Banana) fruit;
                banana.makeSmoothie();
            } else if (fruit instanceof Grapes) {
                Grapes grapes = (Grapes) fruit;
                grapes.makeJuice();
            }
        }
    }
