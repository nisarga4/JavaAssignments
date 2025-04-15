package com.xworkz.internal;

    public abstract class Building {
        String type;
        String city;
        int floors;

        public Building(String type, String city, int floors) {
            this.type = type;
            this.city = city;
            this.floors = floors;
        }

        public abstract void open();

        public void showInfo() {
            System.out.println("Type: " + type);
            System.out.println("City: " + city);
            System.out.println("Floors: " + floors);
        }
    }

