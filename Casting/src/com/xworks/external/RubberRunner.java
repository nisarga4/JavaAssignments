package com.xworks.external;

public class RubberRunner {
        public static void main(String[] args) {
            Rubber rubber = new Rubber();
            Rubber rubber1 = new Tyre();
            Tyre tyre = new Tyre();
            MRFTyre mrfTyre = new MRFTyre();

            rubber.expand();
            rubber1.expand();
            tyre.expand();

            ArmyVehicle armyVehicle = new ArmyVehicle();
            armyVehicle.wheel(rubber);
            armyVehicle.wheel(tyre);
            armyVehicle.wheel(rubber1);
            armyVehicle.wheel(mrfTyre);
        }
}
