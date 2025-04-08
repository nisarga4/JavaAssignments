package com.xworkz.Casting;

public class FootwearHandler {

        public void useFootwear(Footwear footwear) {
            footwear.wear();
            footwear.remove();
            footwear.clean();
            footwear.polish();
            footwear.store();

            if (footwear instanceof Heels) {
                Heels heels = (Heels) footwear;
                heels.walkOnRamp();
            } else if (footwear instanceof Slipper) {
                Slipper slipper = (Slipper) footwear;
                slipper.goForWalk();
            }
        }
    }