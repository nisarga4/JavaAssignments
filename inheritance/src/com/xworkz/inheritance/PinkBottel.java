package com.xworkz.inheritance;

public class PinkBottel {

        public void useBottle(Bottle bottle) {
            bottle.open();
            bottle.close();
            bottle.fill();
            bottle.empty();
            bottle.shake();

            if (bottle instanceof Cap) {
                System.out.println("Bottle is an instance of Cap");
                Cap cap = (Cap) bottle;
                cap.open();
            }

            if (bottle instanceof Milton) {
                System.out.println("Bottle is an instance of Milton");
                Milton milton = (Milton) bottle;
                milton.keepWarm();
            }
        }
    }

