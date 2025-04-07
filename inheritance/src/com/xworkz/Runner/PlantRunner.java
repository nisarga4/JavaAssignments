package com.xworkz.Runner;

import com.xworkz.Casting.Gardener;
import com.xworkz.Casting.Plant;
import com.xworkz.Casting.RosePlant;

public class PlantRunner {

        public static void main(String[] args) {
            Plant plant = new RosePlant(); // Upcasting
            Gardener gardener = new Gardener();
            gardener.careForPlant(plant);  // Safe casting & method call
        }
    }

