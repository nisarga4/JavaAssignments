package com.xworkz.singlelevel;
class Book {
    void open() {
        System.out.println("Opening the book.");
    }
}

class Novel extends Book {
    void readStory() {
        System.out.println("Reading a fiction story.");
    }
}
