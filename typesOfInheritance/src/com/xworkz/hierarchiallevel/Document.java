package com.xworkz.hierarchiallevel;
class Document {
    void open() {
        System.out.println("Opening document.");
    }
}

class PDF extends Document {
    void readPDF() {
        System.out.println("Reading PDF.");
    }
}

class Word extends Document {
    void editWord() {
        System.out.println("Editing Word file.");
    }
}

class Excel extends Document {
    void calculate() {
        System.out.println("Performing Excel calculations.");
    }
}
