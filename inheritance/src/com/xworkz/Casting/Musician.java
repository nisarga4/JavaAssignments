package com.xworkz.Casting;

public class Musician {
        public void useInstrument(Instrument instrument) {
            instrument.play();
            instrument.tune();
            instrument.clean();
            instrument.repair();
            instrument.store();

            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                guitar.changeStrings();  // Unique subclass method
            }
        }
    }
