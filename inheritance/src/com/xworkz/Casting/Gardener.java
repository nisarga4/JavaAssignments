package com.xworkz.Casting;

public class Gardener {

        public void careForPlant(Plant plant) {
            plant.grow();
            plant.absorbWater();
            plant.photosynthesize();
            plant.bloom();
            plant.shedLeaves();

            if (plant instanceof RosePlant) {
                RosePlant rose = (RosePlant) plant;
                rose.smellFragrance();
            }
        }
    }
