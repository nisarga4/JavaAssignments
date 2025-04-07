package com.xworkz.Runner;

import com.xworkz.Casting.Cake;
import com.xworkz.Casting.DessertChef;
import com.xworkz.Casting.IceCream;

public class DessertMain {
        public static void main(String[] args) {
            IceCream dessert = new Cake(); // Upcasting
            DessertChef chef = new DessertChef();
            chef.prepareDessert(dessert);
        }
    }
