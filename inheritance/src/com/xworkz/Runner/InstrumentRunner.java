package com.xworkz.Runner;

import com.xworkz.Casting.Guitar;
import com.xworkz.Casting.Instrument;
import com.xworkz.Casting.Musician;

public class InstrumentRunner {
        public static void main(String[] args) {
            Instrument instrument = new Guitar(); // Upcasting
            Musician musician = new Musician();
            musician.useInstrument(instrument); // Safe casting and invocation
        }
    }
