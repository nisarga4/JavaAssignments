package com.xworkz.internal;

    public class Library extends Building {

        public Library(String type, String city, int floors) {
            super(type, city, floors);
        }

        @Override
        public void open() {
            System.out.println("Library is now open.");
        }

        public void displayLibrary() {
            showInfo();
            System.out.println("This is a library.");
        }
    }

