package com.xworkz.Casting;

    public class DessertChef {

        public void prepareDessert(IceCream dessert) {
            dessert.freeze();
            dessert.addFlavors();
            dessert.scoop();
            dessert.serve();
            dessert.eat();

            if (dessert instanceof Cake) {
                Cake cake = (Cake) dessert;
                cake.addIcing(); // Unique method in Cake
            }
        }
    }
