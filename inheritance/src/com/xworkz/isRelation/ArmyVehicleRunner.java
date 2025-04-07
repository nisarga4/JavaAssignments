package com.xworkz.isRelation;

import com.xworkz.inheritance.ArmyVehicle;
import com.xworkz.inheritance.MRFTyre;

    public class ArmyVehicleRunner {
        public static void main(String[] args) {
            ArmyVehicle vehicle = new ArmyVehicle();

            MRFTyre mrfTyre = new MRFTyre();
            vehicle.wheel(mrfTyre);
        }
    }
