package com.xworkz.Casting;
    public class Kitchen {

        public void manageChef(Chef chef) {
            chef.prepareDish();
            chef.cook();
            chef.cleanKitchen();
            chef.planMenu();
            chef.tasteFood();

            if (chef instanceof PastryChef) {
                PastryChef pastry = (PastryChef) chef;
                pastry.decorateCake(); // Unique method
            }
        }
    }