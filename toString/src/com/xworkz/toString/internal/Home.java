package com.xworkz.toString.internal;

    public class Home {
        private String ownerName;
        private String address;
        private int numberOfRooms;
        private boolean hasGarden;

        public Home(String ownerName, String address, int numberOfRooms, boolean hasGarden) {
            this.ownerName = ownerName;
            this.address = address;
            this.numberOfRooms = numberOfRooms;
            this.hasGarden = hasGarden;
        }

        @Override
        public String toString() {
            return "Home{" +
                    "OwnerName='" + ownerName + '\'' +
                    ", Address='" + address + '\'' +
                    ", NumberOfRooms=" + numberOfRooms +
                    ", HasGarden=" + (hasGarden ? "Yes" : "No") +
                    '}';
        }
    }