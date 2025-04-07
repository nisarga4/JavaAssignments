package com.xworkz.inheritance;

public class ArmyVehicle {

        public void wheel(Rubber rubber) {
            rubber.expand();
            rubber.bend();
            rubber.stretch();
            rubber.melt();
            rubber.bounce();

            if (rubber instanceof Tyre) {
                System.out.println("rubber is Tyre");
                Tyre tyre = (Tyre) rubber;
                tyre.compress();
            }

            if (rubber instanceof MRFTyre) {
                System.out.println("rubber is MRFTyre");
                MRFTyre mrfTyre = (MRFTyre) rubber;
                mrfTyre.compress();
                mrfTyre.radial();
            }
        }
    }

