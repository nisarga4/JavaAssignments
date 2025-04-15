package com.xworkz.multilevel;

class Instrument {
    void play() {
        System.out.println("Instrument is playing.");
    }
}

class StringInstrument extends Instrument {
    void tuneStrings() {
        System.out.println("Tuning string instrument.");
    }
}

class Violin extends StringInstrument {
    void bow() {
        System.out.println("Playing violin with a bow.");
    }
}

