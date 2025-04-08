package com.xworkz.Casting;

    public class HatHandler {

        public void useHat(Hat hat) {
            hat.wear();
            hat.remove();
            hat.clean();
            hat.fold();
            hat.store();

            if (hat instanceof SunHat) {
                SunHat sunHat = (SunHat) hat;
                sunHat.blockSunlight();
            }
        }
    }