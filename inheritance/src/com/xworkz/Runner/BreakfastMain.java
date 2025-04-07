package com.xworkz.Runner;

import com.xworkz.Casting.Dosa;
import com.xworkz.Casting.Idli;
import com.xworkz.Casting.SouthIndianChef;

public class BreakfastMain {
        public static void main(String[] args) {
            Idli morningItem = new Dosa(); // Upcasting
            SouthIndianChef chef = new SouthIndianChef();
            chef.makeDish(morningItem);
        }
    }