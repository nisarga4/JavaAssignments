package com.xworkz.isRelation;
import com.xworkz.inheritance.Planet;
import com.xworkz.inheritance.Atmosphere;

    public class PlanetRunner {
        public static void main(String[] args) {
            Atmosphere atmosphere = new Atmosphere();
            atmosphere.rotate();
            atmosphere.revolve();
            atmosphere.supportLife();
            atmosphere.experienceSeasons();
            atmosphere.holdGravity();

            System.out.println("--------------------------------------");

            Planet planet = new Atmosphere();
            planet.rotate();
            planet.revolve();
            planet.supportLife();
            planet.experienceSeasons();
            planet.holdGravity();
        }
    }

