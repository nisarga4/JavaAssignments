package com.xworkz.toString.internal;
    public class Army {
        private String country;
        private int numberOfSoldiers;
        private String divisionType;
        private boolean isActive;

        public Army(String country, int numberOfSoldiers, String divisionType, boolean isActive) {
            this.country = country;
            this.numberOfSoldiers = numberOfSoldiers;
            this.divisionType = divisionType;
            this.isActive = isActive;
        }

        @Override
        public String toString() {
            return "Army{" +
                    "Country='" + country + '\'' +
                    ", NumberOfSoldiers=" + numberOfSoldiers +
                    ", DivisionType='" + divisionType + '\'' +
                    ", IsActive=" + (isActive ? "Yes" : "No") +
                    '}';
        }
    }

