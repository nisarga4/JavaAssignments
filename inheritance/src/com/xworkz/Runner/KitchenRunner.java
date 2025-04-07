package com.xworkz.Runner;

import com.xworkz.Casting.Chef;
import com.xworkz.Casting.Kitchen;
import com.xworkz.Casting.PastryChef;

public class KitchenRunner {
        public static void main(String[] args) {
            Chef chef = new PastryChef();
            Kitchen kitchen = new Kitchen();
            kitchen.manageChef(chef);
        }
    }